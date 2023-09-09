package co.rajat.day5_class.leetcode;

public class BuildArrayFromPermutation {
    //1920. Build Array from Permutation
    public static void main(String[] dd){
        for(int i:buildArray(new int[]{0,2,1,5,3,4})){
            System.err.print(i+ " ");
        }
    }

    public static int[] buildArray(int[] nums) {
        int[] ans= new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
    }
