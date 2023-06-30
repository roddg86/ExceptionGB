package lesson3;

/**
 * Пример своего исключения
 */
public class SavedException extends Exception {
    public SavedException(String message, Exception e) {
        super(message, e);
    }
}
