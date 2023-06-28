package lesson2.example;

public class TwoCatch {
    public static void main(String[] args) {
        try {
            int a = 0;
            a -= 10;
            int b = 42 / a;
            int[] c = {1,2,3};
            c[42] = 99;
        } catch (ArithmeticException e) {
            System.out.println("на ноль делить нельзя " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка индексации массива: " + e);
        }
        System.out.println("После блока операторов try/catch");
    }
}
