package co.rajat.day6_class.leetcode;

import java.util.*;

public class SummaryRanges {
//    228. Summary Ranges
/*      Input: nums = [0,2,3,4,6,8,9]
        Output: ["0","2->4","6","8->9"]
        Explanation: The ranges are:
            [0,0] --> "0"
            [2,4] --> "2->4"
            [6,6] --> "6"
            [8,9] --> "8->9"*/

    public static void main(String[] args){
        int[] arr = new int[]{0,2,3,4,6,8,9};
        System.out.println(summaryRanges(arr));
    }
    public static List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        int i = 0, j = 0;
        while (j < nums.length) {
            if (j + 1 == nums.length || nums[j + 1] != nums[j] + 1) {
                if (i != j) {
                    ans.add(nums[i] + "->" + nums[j]);
                } else {
                    ans.add(Integer.toString(nums[i]));
                }
                i = j + 1;
            }
            j++;
        }
        return ans;
    }

    
}
