package practice;

import java.util.Scanner;

/**
 * Написать программу, которая считывает список строк от пользователя и пытается
 * конвертировать каждую строку в число. Если какая-то строка не может быть
 * преобразована в число, программа должна игнорировать эту строку и продолжать
 * конвертировать оставшиеся строки. В конце работы программа должна вывести
 * сумму всех сконвертированных чисел и количество строк, которые не были конвертированы.
 */
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter count of string");
        int strCount = scanner.nextInt();

        int[] numbers = new int[strCount];
        int sum = 0;
        int notParsedCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            try {
                System.out.println("Enter string to parse");
                String line = scanner.next();
                numbers[i] = Integer.parseInt(line);
                sum += numbers[i];

            } catch (NumberFormatException e) {
                notParsedCount++;
            }
        }

        int res = sum + notParsedCount;
        System.out.println(res);

    }
}
