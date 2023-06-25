package lesson2.example;

import java.lang.Exception;
import java.util.Collections;

/**
 * Порядок обработки Exception - сначала обрабатываются самые узкие,
 * потом самые общие.
 */
public class ThreeCatch {
    public static void main(String[] args) {
        int number = 1;
        try {
            number = 10 / 1;
            String test = null;
            //System.out.println(test.length());
            Collections.emptyList().add(new Object());
        } catch (ArithmeticException  e) {
            System.out.println("на ноль д елить нельзя " + e);
        } catch (java.lang.NullPointerException e) {
            System.out.println("Null Pointer: " + e);
        } catch (Exception e) {
            System.out.println("exception");
        }
        System.out.println("После блока операторов try/catch " + number);
    }
}

