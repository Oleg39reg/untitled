package Tascs_HomeWork;

import java.util.Scanner;

//Подсчёт букв
public class doWhile_task_3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введите слово");
        String inputText = s.nextLine();
        int letterCount = 0;
        int index = 0;
        do {
            char currentChar = inputText.charAt(index);
            if (Character.isLetter(currentChar)) {
                letterCount++;
            }
            index++;
        } while (index < inputText.length());
        System.out.println("Количество букв в тексте: " + letterCount);
        s.close();
    }
}
