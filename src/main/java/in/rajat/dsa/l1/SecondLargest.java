package in.rajat.dsa.l1;

public class SecondLargest {

    public static void main(String[] args) {
        int[] arr = {14, 13, 16, 9, 5};
        System.out.println(secondLargest(arr));
    }
    public static int secondLargest(int[] arr) {
        int largest = arr[0];
        int secondLargest = Integer.MIN_VALUE;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
