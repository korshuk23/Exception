package practice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

/**
 * Создайте программу, которая принимает ввод от пользователя URL-адреса. Если URL-адрес
 * недействителен, программа должна генерировать исключение, указывающее на то,
 * что URL-адрес недопустим.
 */
public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter correct URL: ");

        String urlString = scanner.next();

        try {
            URL url = new URL("https://" + urlString);
            System.out.println("Entered URL is correct: " + url);
        } catch (MalformedURLException e) {
            System.err.println("Error: Incorrect URL: " + e.getMessage());
        }
    }
}
