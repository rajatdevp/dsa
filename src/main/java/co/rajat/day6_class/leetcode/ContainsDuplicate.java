package co.rajat.day6_class.leetcode;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
//217. Contains Duplicate

    public static  void main(String[] dd){

        System.err.println(containsDuplicate(new int[]{1,1,1,3,3,4,3,2,4,2}));
    }

    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> setV= new HashSet<>();
         for(int i: nums){
             if(!setV.add(i)){
                 return true;
             }
         }
        return false;
    }
}
