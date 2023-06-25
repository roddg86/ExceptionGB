package lesson2.example;

import java.io.File;

/**
 * Неверное приведение типов
 */
public class ClassCastException {
    public static void main(String[] args) {
        Object object = new String("123");
        File file = (File) object;

        System.out.println(file);
    }
}
