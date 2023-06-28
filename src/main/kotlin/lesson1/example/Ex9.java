package lesson1.example;

/**
 * Создание своего исключения
 * Пример непроверяемого исключения
 */
public class Ex9 extends RuntimeException {
    public Ex9(String message) {
        super(message);
    }
}
