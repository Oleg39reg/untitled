package Tascs_HomeWork;

import java.util.Scanner;

//Угадай число
public class doWhile_tasc_2 {
    public static int randomNumbers() {
        return (int) (Math.random() * 10);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int inputNumbers;
        int randomNumbers;
        int attempts = 5;
        do {
            inputNumbers = s.nextInt();
            randomNumbers = randomNumbers();
            attempts--;
            System.out.println("Вы ввели " + inputNumbers + ", загаданное число: " + randomNumbers);
            System.out.println("Осталось попыток " + attempts);
            if (attempts == 0) {
                break;
            }
        } while (randomNumbers != inputNumbers);
        if (attempts == 0) {
            System.out.println("У вас не осталось попыток");
        }
        if (inputNumbers==randomNumbers){
            System.out.println("Вы угадали число");
        }
    }
}
