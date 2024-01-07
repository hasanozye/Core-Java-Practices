package booleanProblems;

public class TeenSum {
    public static void main(String[] args) {
        System.out.println(teenSum(3, 4));   // Output: 7
        System.out.println(teenSum(10, 13)); // Output: 19
        System.out.println(teenSum(13, 2));  // Output: 19
    }

    public static int teenSum(int a, int b) {
        // Check if either value is a teen (in the range 13..19 inclusive)
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) {
            return 19;
        } else {
            // If neither value is a teen, return their sum
            return a + b;
        }
    }
}

