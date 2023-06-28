package lesson1.example;

/**
 * Пример try catch
 */
public class Ex1 {
    public static void main(String[] args) {
        try {
            int a = 1 / 0;
        } catch (Exception e) {
            System.out.println("На ноль делить нельзя!");
            e.printStackTrace();
        }
    }
}
