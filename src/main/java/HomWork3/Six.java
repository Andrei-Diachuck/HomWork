package HomWork3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Six {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 50, 20};

        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i != arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("min = " + min + ", " + "max = " + max);
    }
}
