package lesson1.example;

/**
 * Пример обработки двух исключений
 */
public class Ex8 {
    public static void main(String[] args) {
        try {
            //int a = 1/0;
            String a = null;
            a.getBytes();
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("На ноль делить нельзя!");
            e.printStackTrace();
        }
    }
}
