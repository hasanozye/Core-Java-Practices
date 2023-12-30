package booleanProblems;

public class DateFashion {

    public static int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2) { // If either person's style is 2 or less, return 0 (no).
            return 0;
        } else if (you >= 8 || date >= 8) { // If either person's style is 8 or more, return 2 (yes).
            return 2;
        } else { // Otherwise, return 1 (maybe).
            return 1;
        }
    }

    public static void main(String[] args) {
        System.out.println(dateFashion(5, 10)); // Output: 2
        System.out.println(dateFashion(5, 2));  // Output: 0
        System.out.println(dateFashion(5, 5));  // Output: 1
    }
}

