package Main.Leetcode.Two_Pointers;

public class Contain_water_11 {
    public static void main(String[] args) {
        int[] nums = {1,8,6,2,5,4,8,3,7};

        System.out.println(maxArea(nums));
    }

    public static int maxArea(int[] height) {
        if(height.length <2) return 0;

        int total = Integer.MIN_VALUE;

        int s=0, f = height.length-1;
        while(s<f){
            if(height[s]<height[f]){
                total = Math.max(total , (height[s]*(f-s)));
                s++;
            }
            else {
                total = Math.max(total , (height[f]*(f-s)));
                f--;
            }
        }
        return total;
    }
}
