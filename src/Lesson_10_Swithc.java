import java.util.Scanner;

public class Lesson_10_Swithc {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Введи возраст");
        int age = s.nextInt();
        switch (age) {
            case 0 -> System.out.println("Ты родился");
            case 7 -> System.out.println("Ты пошёл в школу");
            case 18 -> System.out.println("Ты закончил школу");
            default -> System.out.println("Ни одно из условий не подошло");
        }
    }
}
