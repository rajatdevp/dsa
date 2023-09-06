package co.rajat.day4_class;

import java.util.Arrays;

public class MajorityElements {

    public static void main(String[] args) {
        int[] arr ={2,2,1,1,1,2};
        System.out.println(getMajorityM1(arr));
    }
    public static int getMajorityM1(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length/2];
    }


}
