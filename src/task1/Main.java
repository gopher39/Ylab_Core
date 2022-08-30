package task1;

public class Main {
    public static void main(String[] args) {
      int[][] arr = new int[5][5];
      int multiplier = 87;
      int mask = 78;
      int firstElem = (int) ((System.nanoTime() / 2140000000) % 80);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                firstElem = (firstElem * multiplier + (i * j)) % mask;
                arr[i][j] = firstElem;
            }
        }
        int min = arr[0][0];
        int max = arr[0][0];
        int average;
        int summElements = 0;
        int quantityElements = 0;
        for (int[] ints : arr) {
            for (int anInt : ints) {
                quantityElements++;
                summElements += anInt;
                if (min > anInt) {
                    min = anInt;
                }
                if (max < anInt) {
                    max = anInt;
                }
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
        average = summElements / quantityElements;
        System.out.print("Максимум "+max+" Минимум "+min+" Среднее "+average+" \n\n");
    }
}
