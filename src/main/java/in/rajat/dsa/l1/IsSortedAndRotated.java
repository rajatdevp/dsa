package in.rajat.dsa.l1;

import java.util.Arrays;

public class IsSortedAndRotated {

    public static void main(String[] args) {
        int[] arr = {3, 6, 5, 1, 2};
        System.out.println(isSortedAndRotatedBruteForce(arr));
    }

    public static boolean isSortedAndRotatedBruteForce(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            int[] temp = new int[arr.length];
            int j = i;
            while (j >= 0) {
                temp[temp.length - 1 - j] = arr[i - j];
                j--;
            }
            j = i + 1;
            int k = 0;
            while (j < arr.length) {
                temp[k++] = arr[j];
                j++;
            }
            int check = 1;
            for (int m = 1; m < temp.length; m++) {
                if (temp[m] > temp[m - 1]) {
                    check++;
                }
            }
            if (check == temp.length) {
                return true;
            }

        }
        return false;
    }
}
