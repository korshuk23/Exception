package practice;

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

/**
 * Написать программу, которая считывает массив целых чисел от пользователя
 * и пытается найти все пары чисел, которые в сумме дают определенное значение.
 * Если в массиве нет таких пар, программа должна вывести сообщение об ошибке.
 */
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter the size of the array: ");
            int size = scanner.nextInt();
            int[] array = new int[size];

            System.out.println("Enter the elements of the array: ");
            for (int i = 0; i < size; i++) {
                array[i] = scanner.nextInt();
            }

            System.out.println("Enter the target sum: ");
            int targetSum = scanner.nextInt();

            findPairsWithSum(array, targetSum);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid integers.");
        } catch (NoPairsException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void findPairsWithSum(int[] array, int targetSum) throws NoPairsException {
        Set<Integer> seen = new HashSet<>();

        System.out.println("Pairs with sum " + targetSum + ":");
        boolean isFound = false;
        for (int num : array) {
            int complement = targetSum - num;
            if (seen.contains(complement)) {
                System.out.println("(" + complement + ", " + num + ")");
                isFound = true;
            }
            seen.add(num);
        }

        if (!isFound) {
            throw new NoPairsException();
        }
    }
}

class NoPairsException extends Exception {
    public NoPairsException() {
    }

    public NoPairsException(String message) {
        super(message);
    }
}
