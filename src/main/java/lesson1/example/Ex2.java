package lesson1.example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Ex2 {
    public static void main(String[] args) {

    }

    /**
     * @apiNote Трай с ресурсами
     * @param pathRead
     * @param pathWrite
     * @throws IOException
     */
    public void rwLine(Path pathRead, Path pathWrite) throws IOException {
        try (BufferedReader in = Files.newBufferedReader(pathRead);
             BufferedWriter out = Files.newBufferedWriter(pathWrite)) {
            out.write(in.readLine());
            in.readLine();
        } catch (IOException e) {

        }
    }
}
