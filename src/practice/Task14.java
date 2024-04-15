package practice;

import java.io.File;

/**
 * Создайте программу, которая принимает ввод от пользователя пути к файлу. Если путь к
 * файлу недействителен, программа должна генерировать исключение, указывающее на то,
 * что путь к файлу недопустим.
 */
public class Task14 {
    public static void main(String[] args) {
        String filePath = "file.txt";

        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new InvalidPathException("File is not exists: " + filePath);
            }
            System.out.println("File path is correct: " + filePath);
        } catch (InvalidPathException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}

class InvalidPathException extends Exception {
    public InvalidPathException(String message) {
        super(message);
    }
}
