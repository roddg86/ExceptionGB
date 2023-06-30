package lesson3;

import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {

        /**
         * Закрывает ресурсы, которые были открыты в пределах блока try
         */
        try(FileReader test = new FileReader("D:/test");) {
            test.read();
        } catch (RuntimeException | IOException e) {
            System.out.println("catch exception: " + e.getClass().getSimpleName());
        }
    }
}
