package task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {5,6,3,2,5,1,4,9};
            for (int i = 0; i < arr.length - 1; i++) {
                for (int j = arr.length - 1; j > i; j--) {
                if (arr[j - 1] > arr[j]) {
                    int buble = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = buble;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
