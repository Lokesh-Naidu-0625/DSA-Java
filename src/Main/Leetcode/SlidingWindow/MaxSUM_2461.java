package Main.Leetcode.SlidingWindow;

import java.util.HashSet;

public class MaxSUM_2461 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,4,6,7,8};
        int k = 4;
//        System.out.println(maximumSubarraySum_tail(nums,k));
//        System.out.println(maximumSubarraySum_updated(nums,k));
        System.out.println(maximumSubarraySum(nums,k));
    }

    public static long maximumSubarraySum_tail(int[] nums, int k) {
        if(nums.length<k) return 0;
        long sum =0,max=0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];

            if(i>0 && nums[i]==nums[i-1]) {
                j=i;
                sum=nums[i];
            }
            if(i-j+1>k){
                sum-=nums[j];
                j++;
            }
            if(i-j+1==k){
                max = Math.max(sum,max);
            }
        }

        return max;
    }

    public static long maximumSubarraySum_updated(int[] nums, int k) {
        if(nums.length<k) return 0;
        long sum =0,max=0;
        int j=0,i=0;
        HashSet<Integer> set = new HashSet<>();
        while(i< nums.length){
            if(set.contains(nums[i])){
                sum = 0;
                j=i;
                set.clear();
            }
            else{
                set.add(nums[i]);
                sum+=nums[i];
                if(i-j+1>k){
                    sum-=nums[j];
                    j++;
                }
                if(i-j+1==k){
                    max = Math.max(sum,max);
                }
                i++;
            }
        }

        return max;
    }


    public static long maximumSubarraySum(int[] nums, int k) {
        if (nums.length < k) return 0;

        long sum = 0;
        long max = 0;

        int j = 0;

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            // Duplicate found
            while (set.contains(nums[i])) {
                set.remove(nums[j]);
                sum -= nums[j];
                j++;
            }

            // Add current element
            set.add(nums[i]);
            sum += nums[i];

            // Keep window size <= k
            if (i - j + 1 > k) {
                set.remove(nums[j]);
                sum -= nums[j];
                j++;
            }

            // Valid window
            if (i - j + 1 == k) {
                max = Math.max(max, sum);
            }
        }

        return max;
    }


}
