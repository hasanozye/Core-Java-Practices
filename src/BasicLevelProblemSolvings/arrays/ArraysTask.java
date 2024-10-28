package BasicLevelProblemSolvings.arrays;

public class ArraysTask {
    public static void main(String[] args) {
        int[] array1 = {1, 1, 2, 3, 1};
        int[] array2 = {1, 1, 2, 4, 1};
        int[] array3 = {1, 1, 2, 1, 2, 3};
        int[] array4 = new int[0];

        System.out.println(array123(array1)); // Output: true
        System.out.println(array123(array2)); // Output: false
        System.out.println(array123(array3)); // Output: true
        System.out.println(array123(array4)); // Output: true
    }

    public static boolean array123(int[] nums) {
        // Iterate through the array up to the third-to-last element
        for (int i = 0; i <= nums.length - 3; i++) {
            // Check if the current three consecutive elements are 1, 2, 3
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                return true; // Found the sequence, return true
            }
        }
        // If the loop completes without finding the sequence, return false
        return false;
    }

}
//In this example, the array123 method takes an array of integers (nums) as input and iterates through the array. It checks at each position if the sequence 1, 2, 3 appears. If it finds the sequence, it returns true; otherwise, it returns false. The main method demonstrates how to use this function with different BasicLevelProblemSolvings.arrays.