package lesson2.example;

public class TryArithmeticException {
    public static void main(String[] args) {
        try {
            int number = 10 / 0;
        } catch (ArithmeticException exception) {
            System.out.println("на ноль делить нельзя");
        }
    }
}
