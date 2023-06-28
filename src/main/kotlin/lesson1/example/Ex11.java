package lesson1.example;

import java.io.IOException;

public class Ex11 {
    public static void main(String[] args) {
        /**
         * Задание 2
         *
         * Создайте класс Счетчик, у которого есть метод add(), увеличивающий
         * значение внутренней int переменной на 1. Сделайте так, чтобы с объектом
         * такого тпа можно было работать в блоке try-with-resources. Подумайте, что
         * должно происходить при закрытии этого ресурса? Напишите метод
         * для проверки, закрыт ли ресурс. При попытке вызвать add() у закрытого ресурса,
         * должен выброситься IOException
         *
         */

        try (Counter counter = new Counter()) {
            counter.add();
            counter.close();
            counter.add();
        } catch (Exception e) {
            System.out.println("После close нельзя вызвать add");
        }

    }

    private static class Counter implements AutoCloseable {

        int i;
        boolean flag = true;

        public void add() throws IOException {
            System.out.println(i);
            if (!flag) {
                throw new IOException();
            }
            i++;
        }

        @Override
        public void close() throws IOException {
            flag = false;
        }
    }
}
