package lesson3;

import java.util.Scanner;

/**
 * 3. Напишите программу, которая запрашивает у пользователя ввод некоторых данных,
 * например, возраст, имя или адрес электронной почты.
 * Проверьте ввод пользователя на соответствие определенным критериям
 * (например, возраст должен быть положительным числом, имя не должно содержать цифр и т.д.).
 * В случае некорректного ввода, обработайте исключение и выведите сообщение об ошибке.
 */
public class Task3 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите электронный адрес");
        String input = scn.nextLine();
        if (input.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}")) {
            System.out.println("Адрес корректный");
        } else {
            throw new RuntimeException("Адрес некорректный!");
        }
    }
}

