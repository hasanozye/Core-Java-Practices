package booleanProblems;

public class MaxMod5 {
        public static void main(String[] args) {
            System.out.println(largerValue(8, 3));   // Output: 8
            System.out.println(largerValue(7, 12));  // Output: 7
            System.out.println(largerValue(10, 5));  // Output: 0
            System.out.println(largerValue(5, 10));  // Output: 0
        }

        public static int largerValue(int a, int b) {
            // Check if the two values are the same
            if (a == b) {
                return 0;
            }

            // Check if the two values have the same remainder when divided by 5
            if (a % 5 == b % 5) {
                // Return the smaller value
                return (a < b) ? a : b;
            }

            // Return the larger value
            return (a > b) ? a : b;
        }
    }
