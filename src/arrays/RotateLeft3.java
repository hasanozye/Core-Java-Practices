package arrays;

import java.util.Arrays;

public class RotateLeft3 {

    public static void main(String[] args) {
        int[] result1 = rotateLeft3(new int[]{1, 2, 3});
        int[] result2 = rotateLeft3(new int[]{5, 11, 9});
        int[] result3 = rotateLeft3(new int[]{7, 0, 0});

        // Print results
        System.out.println(Arrays.toString(result1));
        System.out.println(Arrays.toString(result2));
        System.out.println(Arrays.toString(result3));
    }

    public static int[] rotateLeft3(int[] nums) {
        int first = nums[0];

        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }

        nums[nums.length - 1] = first;

        return nums;
    }
}