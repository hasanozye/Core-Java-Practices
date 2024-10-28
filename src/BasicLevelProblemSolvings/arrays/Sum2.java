package BasicLevelProblemSolvings.arrays;

public class Sum2 {
    public static int sum2(int[] nums) {
        if (nums.length >= 2) {
            return nums[0] + nums[1];
        } else if (nums.length == 1) {
            return nums[0];
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        int result1 = sum2(array1);
        System.out.println(result1);

        int[] array2 = {1, 1};
        int result2 = sum2(array2);
        System.out.println(result2);

        int[] array3 = {1, 1, 1, 1};
        int result3 = sum2(array3);
        System.out.println(result3);

        int[] array4 = {5};
        int result4 = sum2(array4);
        System.out.println(result4);

        int[] array5 = {};
        int result5 = sum2(array5);
        System.out.println(result5);
    }
}
