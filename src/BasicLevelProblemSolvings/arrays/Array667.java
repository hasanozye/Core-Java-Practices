package BasicLevelProblemSolvings.arrays;

public class Array667 {
    public static void main(String[] args) {
        int[] array1 = {6, 6, 2};
        int[] array2 = {6, 6, 2, 6};
        int[] array3 = {6, 7, 2, 6};

        System.out.println(array667(array1)); // Output: 1
        System.out.println(array667(array2)); // Output: 1
        System.out.println(array667(array3)); // Output: 1
    }

    public static int array667(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7)) {
                count++;
            }
        }
        return count;
    }
}

