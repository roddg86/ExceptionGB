package lesson3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResources2 {
    public static void main(String[] args) {

        /**
         * Закрывает ресурсы, которые были открыты в пределах блока try
         *
         * Открыты два потока
         */
        try (FileReader reader = new FileReader("D:/test");
             FileWriter writer = new FileWriter("test")) {
            while (reader.ready() ) {
                writer.write(reader.read());
            }
        } catch (RuntimeException | IOException e) {
            System.out.println("catch exception: " + e.getClass().getSimpleName());
        }

        System.out.println("Copy successfuly");
    }
}
