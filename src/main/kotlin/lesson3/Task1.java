package lesson3;

import java.util.Scanner;

/**
 * 1. Напишите программу, которая запрашивает у пользователя размер массива
 * и элементы этого массива. Затем программа запрашивает у пользователя число
 * для поиска в массиве.
 * В случае, если число найдено в массиве, выведите его индекс.
 * Если число не найдено, обработайте исключение и выведите сообщение об ошибке.
 */
public class Task1 {

    public static void main(String[] args) throws NumberNotFoundException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Введите число для поиска: ");
        int searchNumber = scanner.nextInt();

        for (int i = 0; i < size; i++) {

                if(array[i] == searchNumber){
                    System.out.println(i);
                    break;
                } else {
                    throw new NumberNotFoundException();
                }
        }
    }
}
