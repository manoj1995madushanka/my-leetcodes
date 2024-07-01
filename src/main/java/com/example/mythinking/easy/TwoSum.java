package com.example.mythinking.easy;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target){
        int[] result = new int[2];

        for (int i=0;i<nums.length;i++){
            int rest = target - nums[i];

            for (int j=i+1;j<nums.length;j++){
                if (nums[j] == rest){
                    result[0] = i;
                    result[1]= j;
                    break;
                }
            }
        }

        return result;
    }

}
