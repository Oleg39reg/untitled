package Tascs_HomeWork;

import java.util.Scanner;

public class doWhile_task_5 {
    public static void main(String[] args) {
        int attempts = 3;
        String password = "Oleg39162008";
        boolean result;
        System.out.println("Введите пароль");
        Scanner s = new Scanner(System.in);
        String inputPassword;
        do {
            inputPassword = s.nextLine();
            result = inputPassword.equals(password);
            attempts--;
            if (result) {
                System.out.println("Пароль верен");
                break;
            } else if(attempts>0){
                System.out.println("Пароль не верный. Осталось попыток: " + attempts);
            }else {
                System.out.println("У вас закончились попытки. Доступ заблокирован.");
            }
        } while (attempts > 0);
    }
}
