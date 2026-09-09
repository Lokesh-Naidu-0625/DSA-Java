package Main.Leetcode.Two_Pointers;

import java.util.Arrays;

public class Remove_duplicates_26 {
    public static void main(String[] args) {

        int[] nums = {0,0,1,1,1,2,3,4,4};
        System.out.println(Arrays.toString(removeDuplicates(nums)));
    }

    public static int[] removeDuplicates(int[] nums){
        if (nums.length < 1) return new int[]{};
        int j=1;
        int i=0;
        while(i<j && j<nums.length && i<nums.length-1){
            if(nums[i]==nums[j]){
                j++;
                continue;
            }
            else{
                int temp = nums[j];
                nums[j] = nums[i+1];
                nums[i+1] = temp;
                i++;
                j++;
            }
        }

        return nums;
    }


//    optimal solution
    public static int removeDuplicates2(int[] nums) {

        if (nums.length == 0) return 0;

        int i = 0;

        for (int j = 1; j < nums.length; j++) {

            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }
}
