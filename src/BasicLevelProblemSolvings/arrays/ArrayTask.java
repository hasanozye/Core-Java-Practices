package BasicLevelProblemSolvings.arrays;

public class ArrayTask {

    /*
    Store grades of twelve students in an integer array variable. Write a Java program that finds the sum of these grades.

grades: 56, 75, 90, 47, 83, 58, 33, 86, 92, 65, 90, 45

sum?
     */
    public static void main(String[] args) {

        int[] grades = {56, 75, 90, 47, 83, 58, 33, 86, 92, 65, 90, 45};
        int average = 0;
        int sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];

        }
        average = sum / grades.length;
        System.out.println("average = " + average);


    }


}
