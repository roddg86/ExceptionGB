package lesson2.example;

/**
 * Неверное преобразование символьной строки в числовой формат
 */
public class NumberFormatException {
    public static void main(String[] args) {
        String number = "123fq";
        int result = Integer.parseInt(number);
        System.out.println(result );
    }
}
