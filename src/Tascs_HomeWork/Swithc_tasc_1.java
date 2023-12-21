package Tascs_HomeWork;

import java.util.Scanner;

public class Swithc_tasc_1 {
    public static int calculutor(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int operand_1 = scanner.nextInt();
        System.out.println("Введите второе число");
        int operand_2 = scanner.nextInt();
        System.out.println("Введите оператор (+,-,*,/): ");
        char operator = scanner.next().charAt(0);

        int result = 0;
        switch (operator) {
            case '+' -> result = operand_1 + operand_2;
            case '-' -> result = operand_1 - operand_2;
            case '*' -> result = operand_1 * operand_2;
            case '/' -> result = operand_1 / operand_2;
            default -> System.out.println("Некорректная операция");
        }
         System.out.println("Результат: " + result);
        return result;
    }
    public static void main(String[] args) {
        calculutor();
    }
}
