public class Lesson_13_Multi_Arrays {
    public static void main(String[] args) {
        int[][] matrice = {{1, 3, 4},
                           {2, 6, 4},
                           {9, 6, 4}};
        System.out.println(matrice[2][1]);//ввыводим число 67


        int[] number = new int[5]; //инициализация одномерного массива


        String[][] strings = new String[4][3];//Инициализация двумерного массива
        strings[0][2] = "Привет";
        System.out.println(strings[0][2]);
        System.out.println(strings.length);

        System.out.println();

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j]+" ");
            }
            System.out.println();

        }
    }
}
