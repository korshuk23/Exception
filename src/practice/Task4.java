package practice;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Написать программу, которая считывает массив целых чисел от пользователя
 * и вычисляет среднее значение чисел в массиве. Если пользователь вводит
 * массив с нулевым количеством элементов, перехватить возникающее
 * исключение ArrayIndexOutOfBoundsException и вывести сообщение об ошибке.
 */
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Enter array dimension: ");
            int dim = scanner.nextInt();
            if (dim <= 0) {
                throw new ArrayIndexOutOfBoundsException("Array size must be greater than zero.");
            }

            int[] array = new int[dim];
            System.out.println("Enter int array: ");
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }
            System.out.println(Arrays.toString(array));

            int sum = 0;
            for (int num : array) {
                sum += num;
            }

            double average = (double) sum / dim;
            System.out.println("Average value of the array: " + average);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
