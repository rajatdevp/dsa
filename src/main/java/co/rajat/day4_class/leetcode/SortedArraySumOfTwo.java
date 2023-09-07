package co.rajat.day4_class.leetcode;

public class SortedArraySumOfTwo {
    //167. Two Sum II - Input Array Is Sorted

    public static void main(String[] dd){
        int[]  arr = {2,11,7,15};
        int i=0;
        int j=arr.length-1;
        int traget=9;
        while(i<j){
             if((arr[i]+ arr[j]) == traget){
                 System.err.println( i+1 +"------"+j+1);
                 break;
             }
             if((arr[i]+ arr[j])>traget ){
                 j--;
             }
            if((arr[i]+ arr[j])<traget ){
                i++;
            }
        }
    }
}
