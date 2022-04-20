package HomWork3;

import java.util.Arrays;

public class Four {
    public static void main(String[] args) {
        array();
    }

    public static void array() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i][j] = 1;
                }

                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
