package practice;

/**
 * Создайте программу, которая имитирует банковский счет. Если пользователь пытается
 * снять больше денег, чем у него есть на счету, программа должна генерировать исключение,
 * указывающее на то, что операция не может быть выполнена из-за недостаточных средств.
 */
public class Task12 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1700);
        try {
            account.withdraw(1500);
        } catch (InsufficientFundsException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Недостаточно средств на счету");
        }
        balance -= amount;
        System.out.println("Вы сняли " + amount + " рублей. Остаток на счету: " + balance + " рублей.");
    }
}

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}