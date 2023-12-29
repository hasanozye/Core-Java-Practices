package arrays;

import java.util.Arrays;

public class Front11 {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3};
        int[] b1 = {7, 9, 8};
        int[] result1 = front11(a1, b1);

        System.out.println(Arrays.toString(result1));  // Output: [1, 7]

        int[] a2 = {1};
        int[] b2 = {2};
        int[] result2 = front11(a2, b2);
        System.out.println(Arrays.toString(result2));  // Output: [1, 2]

        int[] a3 = {1, 7};
        int[] b3 = {};
        int[] result3 = front11(a3, b3);
        System.out.println(Arrays.toString(result3));  // Output: [1]
    }

    public static int[] front11(int[] a, int[] b) {
        // Check if both arrays are non-empty
        if (a.length > 0 && b.length > 0) {
            return new int[]{a[0], b[0]};
        } else if (a.length > 0) {
            // If only the first array is non-empty
            return new int[]{a[0]};
        } else if (b.length > 0) {
            // If only the second array is non-empty
            return new int[]{b[0]};
        } else {
            // If both arrays are empty
            return new int[]{};
        }
    }
}

