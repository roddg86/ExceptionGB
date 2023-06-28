package lesson1.example;

public class Ex5 {
    public static void main(String[] args) {
        System.out.println("divide(10,0) = " + divide(10, 0));
    }

    /**
     * @apiNote Бросаем свое исключение
     * @param a1
     * @param a2
     * @return результат деления
     */
    public static int divide(int a1, int a2){
        if (a2 == 0){
            throw new  RuntimeException("Divide by zero not permited");
        }
        return a1/a2;
    }
}
