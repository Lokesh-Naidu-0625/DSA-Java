package Main.Leetcode.Mixed;

import java.util.ArrayList;
import java.util.List;

public class Remove_Element_27 {
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2} ;
        int val = 2;
//        System.out.println(removeElement(nums,val));
        System.out.println(approach(nums,val));
    }

//    for the following solution we might arise the following erros
//    for loop stops too early
//    while condition can cause an ArrayIndexOutOfBoundsException
//    fast starts at slow
//    The biggest logical problem: count isn't necessarily tracking the correct valid prefix
//    Java evaluates from left to right in the condition block
    public static int removeElement(int[] nums, int val) {
        if(nums.length ==0 ){
            return 0;
        }
        int count =0;
        for(int slow = 0 ;slow <nums.length-1;slow++){
            if(nums[slow]!=val) count++;
            else{
                int fast = slow;
                while(nums[fast]==val && fast< nums.length-1){
                    fast++;
                    if(nums[fast]!=val){
                        int temp = nums[fast];
                        nums[fast]=nums[slow];
                        nums[slow] = temp;
                        count++;
                        break;
                    }
                }
            }
        }
        return count;

    }

//better approach is
    public static int approach(int[] nums, int val){
        int count = 0;

        for(int num : nums){
            if(num!=val){
                nums[count] = num;
                count ++;
            }
        }
        return count;
    }
}
