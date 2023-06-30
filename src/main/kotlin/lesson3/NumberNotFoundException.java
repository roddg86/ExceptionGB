package lesson3;

public class NumberNotFoundException extends Exception{
    public NumberNotFoundException() {
        super("Число не найдено ");
    }
}
