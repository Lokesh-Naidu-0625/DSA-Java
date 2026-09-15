package Main.Leetcode.SlidingWindow;

public class MaxAverage_643 {
    public static void main(String[] args) {
        int[] nums = {-1};
        int k=1;
        System.out.println(findMaxAverage(nums,k));
    }


//    // IMPORTANT:

    /// / Double.MIN_VALUE is NOT the most negative double.
    /// / It is the smallest POSITIVE double (~4.9e-324).
    /// / So for finding maximum when values can be negative, use:
    /// / double max = -Double.MAX_VALUE;
    /// /
    /// / Also, keep `sum` as the WINDOW SUM.
    /// / Don't do `sum /= k` because that changes the sum.
    /// / Instead calculate: double average = sum / k;
    public static double findMaxAverage(int[] nums, int k) {
        double max = -Double.MIN_VALUE, sum=0,average =0;
        int j=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(i-j+1>k){
                sum-=nums[j];
                j++;
            }
            if(i-j+1==k){
                average= sum/k;
                max = Math.max(max,average);
            }
        }
        return max;
    }
}
