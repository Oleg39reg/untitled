package Tascs_HomeWork;

import java.util.Scanner;

//таблица умножения
public class doWhile_tasc_4 {
    public static void main(String[] args) {

        // Указываем число, для которого строим таблицу умножения
        int baseNumber = 4;

        // Инициализируем множитель
        int multiplier = 1;

        // Используем цикл do while для вывода таблицы умножения
        do {
            // Вычисляем результат умножения
            int result = baseNumber * multiplier;

            // Выводим результат
            System.out.println(baseNumber + " * " + multiplier + " = " + result);

            // Увеличиваем множитель
            multiplier++;
        } while (multiplier <= 10); // Повторяем, пока множитель не превысит 10
    }
}

