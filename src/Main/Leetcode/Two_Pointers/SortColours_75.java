package Main.Leetcode.Two_Pointers;

import java.util.Arrays;

public class SortColours_75 {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        System.out.println(Arrays.toString(sortColors(nums)));
    }

    public static int[] sortColors(int[] nums) {
        if(nums.length == 0) return new int[]{0,0,0};
        int i=0,j=0,k= nums.length-1,temp = 0;
        while(j<=k){
            if (nums[j]==0) {
                temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
                i++;
            } else if (nums[j] == 1) {
                j++;
            }
            else{
                temp = nums[j];
                nums[j] = nums[k];
                nums[k] = temp;
                k--;
            }

        }
        return nums;
    }
}
