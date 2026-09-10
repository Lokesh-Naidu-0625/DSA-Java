package Main.Leetcode.Two_Pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-100,-70,-60,110,120,130,160};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) {
            return new ArrayList<>(Arrays.asList());
        }
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum== 0) {
                    list.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;

                    // Skip duplicate j
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }

                    // Skip duplicate k
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                } else if (sum<0) {
                    j++;
                }else {
                    k--;
                }
            }
        }
        return list;
    }
}
