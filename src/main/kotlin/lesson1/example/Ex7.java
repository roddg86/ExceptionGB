package lesson1.example;

import java.io.FileWriter;

/**
 * Пример сокращенного кода try с ресурсами
 */
public class Ex7 {
    public static void main(String[] args) {
        try(FileWriter reader = new FileWriter("System.in")){

        }catch (Exception e){
            System.out.println("На ноль делить нельзя!");
        }
    }
}
