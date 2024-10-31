package AdvancedConcepts.OOP2.TrainingStudent;

import java.util.Arrays;

public class Student {

    String firstName;
    String lastName;
    int age;
    int[] grades = new int[3];

    public void showInfo() {
        System.out.printf("%s %s %s", firstName, lastName, Arrays.toString(grades));
    }

    public double getGPA() {
        double sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        sum = sum / grades.length;
        return sum;
    }


}
