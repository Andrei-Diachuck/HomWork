package HomWork3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class First {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 0, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

