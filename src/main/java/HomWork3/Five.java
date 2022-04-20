package HomWork3;

import java.util.Arrays;

public class Five {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(array(3, 7)));
    }

    public static int[] array(int len, int initialValue) {
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}
