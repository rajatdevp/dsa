package co.rajat.day6_class.leetcode;

import java.util.*;

public class ContainsDuplicateII {
    //contains-duplicate-ii

    public static void main(String[] dd){
         System.err.println(containsNearbyDuplicate(new  int[]{1,2,3,1,2,3},2));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        int j=0;
        Map<Integer, Integer> numsMap =new HashMap<>();
        for(int i=0; i<nums.length;i++){
            if(numsMap.containsKey(nums[i])){
                if((i- numsMap.get(nums[i])) <=k){
                    return true;
                }
            }
            numsMap.put(nums[i],i);
        }
        return false;
    }
}
