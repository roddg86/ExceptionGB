package lesson3;

public class TryFinally {
    public static void main(String[] args) {

        /**
         * Использовать, для того чтобы тестировать
         * приложение и делать разный тестовый код
         */

        try {
            System.out.println("test operation");
        } finally {
            System.out.println("finally operation");
        }
    }
}
