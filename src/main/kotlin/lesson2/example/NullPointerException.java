package lesson2.example;

/**
 * Обращение к несуществующему объекту
 */
public class NullPointerException extends Throwable {
    public static void main(String[] args) {
        String name = null;
        System.out.println(name.length());
    }
}
