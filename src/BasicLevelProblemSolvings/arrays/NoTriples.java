package BasicLevelProblemSolvings.arrays;

public class NoTriples {
    public static void main(String[] args) {
        int[] array1 = {1, 1, 2, 2, 1};
        int[] array2 = {1, 1, 2, 2, 2, 1};
        int[] array3 = {1, 1, 1, 2, 2, 2, 1};

        System.out.println(noTriples(array1)); // Output: true
        System.out.println(noTriples(array2)); // Output: false
        System.out.println(noTriples(array3)); // Output: false
    }

    public static boolean noTriples(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++) {
            int currentNum = nums[i];
            if (currentNum == nums[i + 1] && currentNum == nums[i + 2]) {
                return false; // Found a triple
            }
        }
        return true; // No triples found
    }
}

