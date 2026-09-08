package Main.Leetcode.Mixed;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum_1 {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        if(nums.length == 0){
            return new int[] {0,0};
        }

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0; i< nums.length; i++){
            int balance = target - nums[i] ;
            if(map.containsKey(balance)){
                return new int[] { i, map.get(balance)};
            }
            map.put(nums[i],i);
        }
        return new int[] {0,0};
    }
}
