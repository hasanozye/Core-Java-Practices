package BasicLevelProblemSolvings.arrays;

public class Program {
    public static void main(String[] args) {

        int[] numbers = {3, 5, 7, 9, 11};
        /*System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
*/
        /*int sum = numbers[0] + numbers[1] + numbers[2];
        System.out.println(sum);*/

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");

        }

    }
}
