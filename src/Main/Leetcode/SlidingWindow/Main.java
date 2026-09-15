package Main.Leetcode.SlidingWindow;

public class Main {
    public static void main(String[] args) {

        int[] nums = {2, 1, 5, 1, 3, 2};
        int k = 3;
        System.out.println(maxelement(nums,k));
    }

    public static int maxelement(int[] nums,int k){
        int left = 0;
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int right = 0; right < nums.length; right++) {

            sum += nums[right];

            // window size > k
            if (right - left + 1 > k) {
                sum -= nums[left];
                left++;
            }

            // window size == k
            if (right - left + 1 == k) {
                max = Math.max(max, sum);
            }
        }

        return max;
    }
}
