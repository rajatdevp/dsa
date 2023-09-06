package co.rajat.day4_class;

import java.util.HashMap;
import java.util.Map;

public class SumOfTwo {
    public static void main(String[] arg) {
           int[] arr ={4,6,7,9,2,1};
           int target =13;
           Map<Integer, Integer> group = new HashMap<>();

           for(int i=0; i<arr.length;i++){

               if(group.containsKey(target-arr[i])){
                   System.out.println("index 1 :"+ group.get(target-arr[i]));
                   System.out.println("index 2 :"+ i);
                   break;
               }else{
                   group.put(arr[i],i);
               }
           }
    }
}
