package BasicLevelProblemSolvings.booleanProblems;

public class SumLimit {
    public static void main(String[] args) {
        System.out.println(sumLimit(2, 3));  // Output: 5
        System.out.println(sumLimit(8, 3));  // Output: 8
        System.out.println(sumLimit(8, 1));  // Output: 9
    }

    public static int sumLimit(int a, int b) {
        // Calculate the sum of a and b
        int sum = a + b;

        // Check if the sum has the same number of digits as a
        if (String.valueOf(sum).length() == String.valueOf(a).length()) {
            return sum;
        } else {
            return a;
        }
    }
}

