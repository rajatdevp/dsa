package co.rajat.day5_class.leetcode;

import java.util.*;

public class Intersection {
//349. Intersection of Two Arrays
    public  static void main(String[] ss){

            int[] result= intersection(new int[]{1,2,2,1},new int[]{2,2});
            for (int num : result)
                System.err.println(num);

    }

    public static int[] intersection(int[] nums1, int[] nums2) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int j : nums1) {
            if (!map.containsKey(j)) {
                map.put(j, 1);
            }
        }
        List<Integer> ansList= new ArrayList<>();
        for(int num2 : nums2){
            if(map.containsKey(num2) && map.get(num2)==1){
                ansList.add(num2);
                map.put(num2,0);
            }
        }

        return ansList.stream().mapToInt(i ->i).toArray();
    }
}
