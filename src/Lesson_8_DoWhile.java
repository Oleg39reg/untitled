import java.util.Scanner;

public class Lesson_8_DoWhile {
    //Цикл do While
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int value;
        do {//сначала выполняется код, затем проверяется условие,
            //что обеспечивает выполнение кода хотя бы один раз
            System.out.println("Введи 5");
            value = s.nextInt();
        } while (value != 5);
        System.out.println("Вы ввели 5");

    }
}
