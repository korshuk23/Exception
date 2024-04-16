package practice;

/**
 * 1) Создать статический метод который принимет на вход три параметра: login,password, confirmPassword.
 * 2) Login должен содержать только латинские буквы, цифры и знак подчеркивания.
 * 3) Длина login должна быть меньше 20 символов. Если логин не соответствует этим требованиям, необходимо выбросить
 * WrongLoginException.
 * 4) Password должен содержать только латинские бувы, цифры, знак подчеркивания. Длина password должна быть не меньше
 * 20 символов.Также password и confirmPassword должны быть равны. Если password не соответствует этим требованиям,
 * необходимо выбросить WrongPasswordException.
 * 5) WrongPassword и WrongLoginException - пользовательские классы исключения с двумя конструкторами - один по умолчанию,
 * второй принимает сообщние исключения и передает его в конструктор класса Exception.
 * 6) Обработка исключения проводится внутри метода.
 * 7) Используем multi-catch block.
 * 8) Метод возвращает true, если значения верны или false  другом случае.
 * *
 */
public class Task15 {
    public static void main(String[] args) {
        String login = "user123";
        String password = "password1234567891011";
        String confirmPassword = "password1234567891011";

        System.out.println("is valid: " + validationUser(login, password, confirmPassword));

    }

    public static boolean validationUser(String login, String password, String confirmPassword) {
        boolean isAuthorized = true;
        try {
            if (!login.matches("^[a-zA-Z0-9_]{1,20}$")) {
                throw new WrongLoginException("Wrong login!");
            }
            if (!password.matches("^[a-zA-Z0-9_]{20,}$") || !password.equals(confirmPassword)) {
                throw new WrongPasswordException("Wrong password");
            }

        } catch (WrongLoginException | WrongPasswordException e) {
            isAuthorized = false;
            System.out.println(e.getMessage());
        }
        return isAuthorized;
    }
}

class WrongLoginException extends Exception {
    public WrongLoginException() {
        super();
    }

    public WrongLoginException(String message) {
        super(message);
    }
}

class WrongPasswordException extends Exception {
    public WrongPasswordException(String message) {
        super(message);
    }

    public WrongPasswordException() {
        super();
    }
}
