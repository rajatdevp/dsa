package co.rajat.day4_class;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MajorityElements {

    public static void main(String[] args) {
        int[] arr ={2,2,4,4,4,4,4,4,1,1,2};
        System.out.println(getMajorityM1(arr));
        System.out.println(getMajorityM2(arr));
    }
    public static int getMajorityM1(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length/2];
    }
    public static int getMajorityM2(int[] arr) {
        Map<Integer,Integer> countTable= new HashMap<>();
         for(int elm : arr ){
             if(countTable.containsKey(elm)){
                 countTable.put(elm ,countTable.get(elm)+1);
             }else {
                 countTable.put(elm, elm);
             }
         }
         int max =0;
         int result=0;
         for(Integer integer :countTable.keySet()) {
           if (countTable.get(integer)>max) {
               max=countTable.get(integer);
               result =integer;
           }
         }
         return result;
    }

}
