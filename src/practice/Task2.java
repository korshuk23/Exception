package practice;

import java.io.*;
import java.util.Scanner;

/**
 * Написать программу, которая считывает имя файла от пользователя и пытается
 * открыть и прочитать содержимое файла. Если файл не существует или не может
 * быть открыт, перехватить возникающее исключение FileNotFoundException
 * и вывести сообщение об ошибке.
 */
public class Task2 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter file name: ");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.next();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error! " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Reading error!: " + fileName);
            e.printStackTrace();
        }
    }
}
