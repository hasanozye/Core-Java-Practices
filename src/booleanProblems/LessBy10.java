package booleanProblems;

public class LessBy10 {
    public static void main(String[] args) {
        System.out.println(lessBy10(1, 7, 11));  // Output: true
        System.out.println(lessBy10(1, 7, 10));  // Output: false
        System.out.println(lessBy10(11, 1, 7));  // Output: true
    }

    public static boolean lessBy10(int a, int b, int c) {
        // Check if one of the numbers is 10 or more less than one of the others
        return (Math.abs(a - b) >= 10 || Math.abs(b - c) >= 10 || Math.abs(c - a) >= 10);
    }
}

