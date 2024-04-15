package practice;

import java.util.Scanner;

/**
 * Создайте программу, которая принимает ввод от пользователя его возраста.
 * Если введенный возраст меньше 18 лет, программа должна генерировать исключение,
 * указывающее на то, что пользователь слишком молод. Если введенный возраст больше
 * 100 лет, программа должна генерировать исключение, указывающее на то, что возраст недопустим.
 * */
public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Введите свой возраст:");
            int age = scanner.nextInt();

            if (age < 18) {
                throw new AgeTooYoungException("Вы слишком молоды!");
            } else if (age > 100) {
                throw new AgeInvalidException("Ваш возраст недопустим!");
            } else {
                System.out.println("Ваш возраст валиден: " + age);
            }
        } catch (AgeTooYoungException | AgeInvalidException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}
class AgeTooYoungException extends Exception {
    public AgeTooYoungException() {
    }

    public AgeTooYoungException(String message) {
        super(message);
    }
}
class AgeInvalidException extends Exception {
    public AgeInvalidException() {
    }

    public AgeInvalidException(String message) {
        super(message);
    }
}
