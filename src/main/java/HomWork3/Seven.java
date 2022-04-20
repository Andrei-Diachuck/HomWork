package HomWork3;

import java.util.Arrays;

public class Seven {
    public static void main(String[] args) {
        System.out.println(array());
    }

    public static boolean array() {
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        int sum1 = arr[0] + arr[1] + arr[2];
        int sum2 = arr[3] + arr[4];

        if (sum1 == sum2) {
            return true;
        } else {
            return false;
        }
    }

}


