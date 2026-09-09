package Main.Leetcode.Two_Pointers;

import java.util.Arrays;

public class Move_zeros_283 {
    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
//        System.out.println(Arrays.toString(moveZeroes(nums)));
        System.out.println(Arrays.toString(moveZeroes(nums)));
    }

    public static int[] moveZeroes1(int[] nums) {
        int i=0;
        while (i<nums.length){
            if(nums[i]==0){
                int j = i;
                while(nums[j]==0 && j<nums.length-1){
                    j++;
                }
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
            else{
                i++;
            }
        }

        return nums;
    }



//    optimal solution
    public static int[] moveZeroes(int[] nums) {
        int j=0;
        for(int i=0;i< nums.length;i++){
            if(nums[i]!=0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        return nums;
    }
}
