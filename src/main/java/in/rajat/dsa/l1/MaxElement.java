package in.rajat.dsa.l1;

public class MaxElement {

    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 8, 20, 15, 38};
        System.out.println(max(arr));
        System.out.println(recursiveMax(arr,0));
        recursiveTable(1,2);

    }


    public static int max(int[] arr) {
        int max= arr[0];
        for (int j : arr) {
            max = Math.max(max, j);
            //max = (j > max) ? j : max;
        }
        return max;
    }
    public static int recursiveMax(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[index];
        }
        int maxOfRest = recursiveMax(arr, index + 1);

        return Math.max(arr[index], maxOfRest);
    }

    public static void recursiveTable(int index, int n){
        if (index == 10){
            System.err.println(n*index);
            return;
        }
        System.err.println(n*index);
        recursiveTable(index+1, n);
    }

}
