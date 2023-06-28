package lesson1.hw1;

import java.util.Arrays;

public class task2 {
    /**
     * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
     * и возвращающий новый массив, каждый элемент которого равен частному элементов
     * двух входящих массивов в той же ячейке. Если длины массивов не равны,
     * необходимо как-то оповестить пользователя.
     * Важно: При выполнении метода единственное исключение,
     * которое пользователь может увидеть - RuntimeException, т.е. ваше.
     */

    public static void main(String[] args) {
        //int[] array1 = {111, 222, 444, 555, 777};
        int[] array1 = null;
        int[] array2 = {10, 22, 33, 44};
        System.out.println("Новый массив = " + Arrays.toString(newArray(array1, array2)));
    }

    public static int[] newArray(int[] arr1, int[] arr2) {

        if (arr1 == null || arr2 == null)
            throw new RuntimeException("Массив равен NULL, заполните массив");


        if (arr1.length != arr2.length)
            throw new RuntimeException("Длины массивов не совпадают");

        int[] resArr = new int[arr1.length];

        for (int i = 0; i < resArr.length; i++) {
            resArr[i] = arr1[i] - arr2[i];
        }
        return resArr;
    }
}
