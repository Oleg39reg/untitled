package Tascs_HomeWork;

import java.util.Scanner;

public class doWhile_tasc_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;
        int a;
        do {
            a = s.nextInt();
            sum += a;
        } while (a != 0);
        System.out.println(sum);

    }
}
