package Tascs_HomeWork;

import java.util.Scanner;

public class calc {
    public static int result(int number1, int number2) {
        return number1 + number2;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number1 = s.nextInt();
        int number2 = s.nextInt();
        int result = result(number1, number2);
        System.out.println(result);
    }
}
