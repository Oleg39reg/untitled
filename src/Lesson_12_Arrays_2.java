public class Lesson_12_Arrays_2 {
    public static void main(String[] args) {
        String[] strings = new String[3];
        strings[0] = "Привет";
        strings[1] = "Пока";
        strings[2] = "Java";
//        System.out.println(strings[0]+" "+strings[2]);

        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
        System.out.println();

        for (String x : strings) {
            System.out.println(x);
        }

        System.out.println();

        int[] numbers1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int x : numbers1) {
            sum += x;
        }
        System.out.println(sum);
    }

}
