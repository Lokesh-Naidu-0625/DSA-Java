package Main.Leetcode.Two_Pointers;

public class Trappingrainwater_42 {
    public static void main(String[] args) {
        int[] nums = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(nums));
    }

    public static int trap(int[] nums) {
        if(nums.length==0) return 0;
        int water = 0;
        int i=0, j= nums.length-1;
        int rightmax= 0, leftmax= 0;

        while(i<j){
            if(nums[i]<nums[j]){
                leftmax = Math.max(nums[i],leftmax);
                water = water +  (leftmax - nums[i]);
                i++;
            }
            else {
                rightmax = Math.max(nums[j],rightmax);
                water = water +  (rightmax - nums[j]);
                j--;
            }
        }


        return water;
    }
}
