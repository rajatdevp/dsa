package in.rajat.dsa.l1;

public class IsStored {

    public static void main(String[] args) {
        int[] arr = {1, 6, 3, 4, 5};
        System.out.println(isSorted(arr));
    }
    private static boolean isSorted(int arr[]) {

        if (arr.length == 1) return true;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
