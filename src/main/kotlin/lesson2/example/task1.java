package lesson2.example;

public class task1 {
    public static void main(String[] args) {
        String[][] stringTest = {{"1","2"},{"3","4"},{"adbcde","1337"}};
        System.out.println("sum2d(stringTest) = " + sum2d(stringTest));
    }

    public static int sum2d(String[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                int val;
                try {
                    val = Integer.parseInt(arr[i][j]);
                } catch (java.lang.NumberFormatException e) {
                    val = 0;
                }
                sum += val;
            }
        }
        return sum;
    }
}
