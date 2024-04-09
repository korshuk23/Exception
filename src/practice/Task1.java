package practice;

import java.util.Scanner;

/**
 * Написать программу, которая считывает два целых числа от пользователя и
 * делит первое на второе. Если второе целое число равно нулю, перехватить
 * возникающее исключение ArithmeticException и вывести сообщение об ошибке.
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number one: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter number two: ");
        int number2 = scanner.nextInt();
        try {
            double division = number1 / number2;
        } catch (ArithmeticException e) {
            System.out.println("Error" + e.getMessage());
        }
    }
}
