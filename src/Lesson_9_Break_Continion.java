public class Lesson_9_Break_Continion {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            System.out.println(i);
            i++;
            if (i == 100) {
                //Если i равен 1000 то при помощи оператора break обрываем виток цикла
                break;
            }
        }

        for (int j = 0; j <= 15; j++) {
            if (j % 2 == 0) {
                continue;//в данном случаи оператор позволяет пропустить итерацию
                         // где по условию число имеет при дилении от остатка 0
            }
            System.out.println("Это не чётное число " + j);
        }
    }
}
