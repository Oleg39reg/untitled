package Tascs_HomeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Massiv_del {
    public static void main(String[] args) {
        String[] citis2;
        citis2 = {"Москва", "Минск", "Киев", "Воронеж"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добавить город - Y/N");
        boolean yN = scanner.nextLine().equals("Y");
        if (yN) {
            for (int i = 0; i < citis.length; i++) {
                System.out.println("Введите название города");
                String newCiti = scanner.nextLine();
                citis[]+=new[]newCiti;
                break;
            }
        } else {
            System.out.println("Удалить город из массива? Y/N?");
        }
        System.out.println(Arrays.toString(citis));
    }
}
