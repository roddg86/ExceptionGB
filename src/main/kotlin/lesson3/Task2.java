package lesson3;

import java.io.File;
import java.io.FileNotFoundException;

/**
 * 2. Напишите программу, которая выполняет несколько операций,
 * каждая из которых может вызывать исключение.
 * Например, попытайтесь открыть файл, выполнить деление на ноль,
 * вызвать метод с некорректными аргументами и т.д.
 * Обработайте исключения для каждой операции и выведите информацию об ошибках.
 */
public class Task2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        getNumberByIndex(4, numbers);

        try {
            isFileExists("Main.java");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    static int getNumberByIndex(int index, int[] array) throws IndexOutOfBoundsException {
        return array[index];
    }

    static String isFileExists(String filePath) throws FileNotFoundException {
        File file = new File(filePath);
        if (file.exists()) return "Yay!";
        throw new FileNotFoundException("File doesn't exist");
    }
}
