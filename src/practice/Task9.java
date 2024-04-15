package practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Написать программу, которая считывает список имен из файла и пытается
 * отсортировать их с помощью метода Collections.sort(). Если список содержит
 * пустые значения, перехватить возникающее исключение NullPointerException
 * и вывести сообщение об ошибке.
 */
public class Task9 {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (!line.equals("")) {
                    strList.add(line);
                }
            }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        } catch (NullPointerException e) {
            System.err.println("В списке содержится пустое значение.");
        }
        Collections.sort(strList);
        System.out.println(strList);
    }
}