package lesson3;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Напишите программу, которая выполняет парсинг данных из строк,
 * файлов или других источников. Обработайте исключения,
 * которые могут возникнуть при парсинге данных, например,
 * NumberFormatException или ParseException,
 * и выведите соответствующие сообщения об ошибках.
 */
public class Task4 {
    public static void main(String[] args) {
        try {
            System.out.println(isStringContainsEven("asdsad"));
        } catch (NumberFormatException e) {
            System.out.println("Invalid input:");
            System.out.println(e.getMessage());
        }
        try {
            System.out.println(isFileContainsEven("data.txt"));
        } catch (NumberFormatException e) {
            System.out.println("Invalid input:");
            System.out.println(e.getMessage());
        }
    }

    public static boolean isStringContainsEven(String input) throws NumberFormatException {
        int number = Integer.parseInt(input);
        return number % 2 == 0;
    }

    public static boolean isFileContainsEven(String filePath) throws NumberFormatException {
        int number;
        String input = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                input = line;
            }
        } catch (Exception e) {
            input = "Invalid";
        }
        number = Integer.parseInt(input);
        return number % 2 == 0;
    }
}

