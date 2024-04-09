package practice;

import java.util.Scanner;

/**
 * Написать программу, которая считывает строку от пользователя и пытается
 * преобразовать ее в целое число с помощью метода Integer.parseInt().
 * Если строка не может быть преобразована, перехватить возникающее
 * исключение NumberFormatException и вывести сообщение об ошибке.
 * */
public class Task3 {
    public static void main(String[] args) {
        System.out.println("Enter string to parse: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        try {
            int parsedStr = Integer.parseInt(string);
            System.out.println("Done! Str: " + parsedStr + " parsed to int.");
        } catch (NumberFormatException e) {
            System.out.println("Error, string cant be parsed! ");
        }
    }
}
