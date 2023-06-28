package lesson1.hw1;

public class task1 {
    /**
     * Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
     */
    public static void main(String[] args) {
        //divide(10, 0);
        //bounds(10);
        pointer(null);
    }

    /**
     * ArithmeticException
     *
     * @param a1
     * @param a2
     * @return a1/a2
     */
    public static int divide(int a1, int a2) {
        if (a2 == 0)
            throw new ArithmeticException("На ноль делить нельзя");
        return a1 / a2;
    }

    /**
     * ArrayIndexOutOfBoundsException
     */
    public static void bounds(int index) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        if (index > array.length - 1)
            throw new ArrayIndexOutOfBoundsException("Выход за пределы массива");
        System.out.println(array[index]);
    }

    /**
     * NullPointerException
     *
     * @return length
     */
    public static int pointer(String input) {
        if (input == null)
            throw new NullPointerException("Строка не существует");
        return input.length();
    }
}
