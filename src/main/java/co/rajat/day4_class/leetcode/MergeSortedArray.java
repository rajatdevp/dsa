package co.rajat.day4_class.leetcode;

public class MergeSortedArray {

    public static void main(String[] dd){

        int[] arr1 ={1,3,4,5};
        int[] arr2= {4,6,8};
        int[] result= new int[arr1.length+arr2.length];
        int i = 0,j=0,k=0;

        while(k< result.length ){
            if( i< arr1.length && (arr1[i] < arr2[j]) ) {
                result[k]=arr1[i];
                i++;
                k++;
            }else{
                result[k] =arr2[j];
                k++;
                j++;
            }
        }
        for (int f: result)
            System.err.println(f);
    }
}
