package Main.Leetcode.Two_Pointers;

import java.util.Arrays;

public class TwoSum_11_1674 {

    public static void main(String[] args) {
        int[] numbers = {2,7,11,15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(numbers,target)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        if(numbers.length == 0){
            return new int[] { 0,0};
        }
        int i=0, j = numbers.length-1;
        while(i<j){
            if(numbers[i]+numbers[j]==target){
                return new int[]{i+1, j+1};
            } else if (numbers[i]+numbers[j] < target) {
                i++;
            }
            else{
                j--;
            }
        }
        return new int[] {0,0};
    }
}
