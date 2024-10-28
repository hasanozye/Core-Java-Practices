package BasicLevelProblemSolvings.arrays;

public class sum3 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int[] array2 = {5, 11, 2};
        int[] array3 = {7, 0, 0};

        System.out.println(sumArray(array1)); // Output: 6
        System.out.println(sumArray(array2)); // Output: 18
        System.out.println(sumArray(array3)); // Output: 7
    }

    public static int sumArray(int[] nums) {
        int sum = 0;

        // Loop through the array and add each element to the sum
        for (int num : nums) {
            sum += num;
        }

        return sum;
    }
}
