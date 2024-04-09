package practice;

import java.util.Scanner;

/**
 * Написать программу, которая считывает две строки от пользователя
 * и пытается выполнить математическую операцию с указанными значениями.
 * Если операция не может быть выполнена из-за некорректных данных,
 * программа должна выводить соответствующее сообщение об ошибке.
 * Допустимые операции: "+", "-", "*", "/", "%".
 */
public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter first number: ");
            int number1 = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter second number: ");
            int number2 = Integer.parseInt(scanner.nextLine());
            Calculator calculator = new Calculator(number1, number2);
            calculator.calculate();
        } catch (NumberFormatException e) {
            System.out.println("Error: Input should be a valid integer.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Dividend cant be 0! ");
        }
    }

    static class Calculator {
        private final int number1;
        private final int number2;

        public Calculator(int number1, int number2) throws ArithmeticException {
            this.number1 = number1;
            if (number2 == 0) {
                throw new ArithmeticException();
            }
            this.number2 = number2;
        }

        public void calculate() {
            sum();
            sub();
            mul();
            div();
            mod();
        }

        private void sum() {
            System.out.println("sum = " + (number1 + number2));
        }

        private void sub() {
            System.out.println("sub = " + (number1 - number2));
        }

        private void mul() {
            System.out.println("mul = " + (number1 * number2));
        }

        private void div() {

            System.out.println("div = " + (number1 / number2));
        }

        private void mod() {
            System.out.println("mod = " + (number1 % number2));
        }


    }
}
