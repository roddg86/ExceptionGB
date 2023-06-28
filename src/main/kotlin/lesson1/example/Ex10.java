package lesson1.example;

import java.io.IOException;

public class Ex10 {
    public static void main(String[] args) throws IOException {
        doSomething();
//        try {
//            doSomething();
//        }catch (IOException e){
//
//        }
    }

    /**
     * Задание 1
     *
     * Создайте метод doSomething(), который может быть источником одного из
     * типов checked exception (тело самого метода прописывать необязательно).
     * Вызовите этот метод из main и обработайте в нем исключение, которое вызвал метод doSomething().
     *
     * @throws IOException
     * @apiNote Метод в котором может быть исключение.
     * Так же в main нужно прописать что throws может быть исключение,
     * либо нужно использовать try catch
     *
     */
    public static void doSomething() throws IOException {

    }
}
