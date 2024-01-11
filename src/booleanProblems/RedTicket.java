package booleanProblems;

public class RedTicket {
    public static void main(String[] args) {
        System.out.println(redTicket(2, 2, 2));  // Output: 10
        System.out.println(redTicket(2, 2, 1));  // Output: 0
        System.out.println(redTicket(0, 0, 0));  // Output: 5
    }

    public static int redTicket(int a, int b, int c) {
        // Check if they are all the value 2
        if (a == 2 && b == 2 && c == 2) {
            return 10;
        }

        // Check if they are all the same
        if (a == b && b == c) {
            return 5;
        }

        // Check if both b and c are different from a
        if (a != b && a != c) {
            return 1;
        }

        // Otherwise, the result is 0
        return 0;
    }
}

