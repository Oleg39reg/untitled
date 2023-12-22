package Tascs_HomeWork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Massiv_del {
    public static void main(String[] args) {
        ArrayList<String> Sitis = new ArrayList<>(Arrays.asList("Москва", "Минск", "Киев", "Воронеж"));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Добавить город - Y/N");
        boolean yN = scanner.nextLine().equals("Y");
        if (yN) {
            System.out.println("Введите название города");
            String newCiti = scanner.nextLine();
            Sitis.add(newCiti);
        } else {
            System.out.println("Удалить город из массива? Y/N?");
            String sitisRemuw = scanner.nextLine();
            Sitis.remove(sitisRemuw);
        }
        System.out.println(Sitis);
    }
}
