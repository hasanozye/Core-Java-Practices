package strings;

public class FrontAgain {
    public static boolean frontAgain(String str) {
        // Check if the length of the string is at least 2
        if (str.length() >= 2) {
            // Extract the first two characters
            String front = str.substring(0, 2);

            // Extract the last two characters
            String end = str.substring(str.length() - 2);

            // Check if the first two characters are equal to the last two characters
            return front.equals(end);
        }

        // If the length is less than 2, it's not possible to have the same characters at the beginning and end
        return false;
    }

    public static void main(String[] args) {
        // Example usage:
        System.out.println(frontAgain("edited"));  // Output: true
        System.out.println(frontAgain("edit"));    // Output: false
        System.out.println(frontAgain("ed"));       // Output: true
    }
}

