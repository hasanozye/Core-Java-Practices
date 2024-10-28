package BasicLevelProblemSolvings.hackerrankstuff;

import java.util.Scanner;

public class NegativeSubArrays {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        scanner.close();

        int count = 0;  // Initialize a counter variable to keep track of the number of negative subarrays.

        // Outer loop iterates through each element of the array.
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;  // Initialize a variable to store the sum of the subarray.

            // Inner loop iterates through subsequent elements starting from i.
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];  // Calculate the sum of the subarray from i to j.

                // Check if the subarray sum is negative.
                if (sum < 0) {
                    count++;  // Increment the counter if the sum is negative.
                }
            }
        }
        System.out.println(count);
    }
}
