package in.rajat.dsa.l1;

public class MaxElement {

    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 20, 15};
        System.out.println(max(arr));
    }


    public static int max(int[] arr) {
        int max= arr[0];
        for (int j : arr) {
            //max = Math.max(max, j);
            max = (j > max) ? j : max;
        }
        return max;
    }
}
