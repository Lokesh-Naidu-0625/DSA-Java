package Main.Core_Java;

import java.util.Scanner;
import java.util.Arrays;

public class Arays {
    public static void main(String[] args) {
        int[] nums = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i =0; i<nums.length ; i++){
            nums[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(nums));

        System.out.println(Arrays.stream(nums).max());


    }
}
