package practice;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Написать программу, которая считывает список строк от пользователя и пытается
 * выполнить определенные операции над каждой строкой. Возможные операции:
 * "замена", "удаление", "добавление". Если некоторые операции не могут
 * быть выполнены из-за некорректных данных или других ошибок, программа должна
 * выводить соответствующее сообщение об ошибке и продолжать работу с оставшимися строками.
 */
public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter count of strings: ");
            int size = scanner.nextInt();
            List<StringBuilder> strings = new ArrayList<>(size);
            scanner.nextLine();

            System.out.println("Enter strings: ");
            for (int i = 0; i < size; i++) {
                strings.add(new StringBuilder(scanner.nextLine()));
            }
            System.out.println(strings);

            strOperations(strings);
            System.out.println(strings);
        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid number.");
        }
    }

    public static void strOperations(List<StringBuilder> strings) {
        Scanner scanner = new Scanner(System.in);


        for (StringBuilder string : strings) {
            System.out.println("Choose operation: change/delete/add");
            switch (scanner.nextLine()) {
                case "change" -> {
                    System.out.println("Enter the substring to replace: ");
                    String oldSubstring = scanner.nextLine();
                    System.out.println("Enter the new substring: ");
                    String newSubstring = scanner.nextLine();

                    int index = string.indexOf(oldSubstring);
                    if (index != -1) {
                        string.replace(index, index + oldSubstring.length(), newSubstring);
                        System.out.println("After deletion: " + string);
                    } else {
                        System.out.println("Substring not found.");
                    }
                }
                case "delete" -> {
                    System.out.println("Enter the substring to delete: ");
                    String substringToDelete = scanner.nextLine();
                    int index = string.indexOf(substringToDelete);

                    if (index != -1) {
                        string.delete(index, index + substringToDelete.length());
                        System.out.println("After deletion: " + string);
                    } else {
                        System.out.println("Substring not found.");
                    }
                }
                case "add" -> {
                    System.out.println("Enter the substring to add: ");
                    String substringToAdd = scanner.nextLine();
                    string.append(substringToAdd);
                    System.out.println("After add: " + string);
                }
            }
        }
    }

}
