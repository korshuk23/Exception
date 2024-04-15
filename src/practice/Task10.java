package practice;

import java.util.Scanner;

/**
 * Написать программу, которая считывает строку от пользователя и пытается
 * преобразовать ее в число с плавающей запятой с помощью метода Double.parseDouble().
 * Если строка равна null или пустая, перехватить возникающее исключение
 * NullPointerException или NumberFormatException и вывести сообщение об ошибке.
 */
public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value: ");
        String input = scanner.nextLine();
        try {
            if (input == null || input.isEmpty()) {
                throw new NullPointerException("Empty String");
            }
            double value = Double.parseDouble(input);
            System.out.println(value);
        } catch (NullPointerException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: Невозможно преобразовать строку в число.");
        }
    }
}
