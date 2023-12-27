import java.util.Arrays;

public class Lesson_11_Arrays {
    public static void main(String[] args) {
        int number = 10;//примитивный тип данных
//        char character = 'd'; //примитивный тип данных
//        String s = "Hello";//ссылочный тип данных
//        String s1 = new String("Hello");//ссылочный тип данных

        //Созданния массива
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;
        }
        //Вывод на экран элементов массива
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        System.out.println();
        int[] numbers1 = {1,2,3};
        for (int i = 0; i <numbers1.length ; i++) {
            System.out.println(numbers1[i]);
        }
    }
}
