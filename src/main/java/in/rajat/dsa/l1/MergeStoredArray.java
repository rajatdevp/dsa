package in.rajat.dsa.l1;

public class MergeStoredArray {

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8};
        int[] mergedArray = mergeArrays(arr1, arr2);

        System.out.print("Merged Array: ");
        for (int num : mergedArray) {
            System.out.print(num + " ");
        }
    }

    public static int[] mergeArrays(int[] arr1, int[] arr2) {

        int i=0, j=0;
        int[] mergedArray = new int[arr1.length+arr2.length];
        for(int k=0;k<mergedArray.length;k++){
            if(i==arr1.length){
                mergedArray[k] = arr2[j++];
            }else if(j==arr2.length){
                mergedArray[k] = arr1[i++];
            } else if (arr1[i]<arr2[j]) {
                mergedArray[k] = arr1[i++];
            } else {
                mergedArray[k] = arr2[j++];
            }
        }
        return mergedArray;
    }
}
