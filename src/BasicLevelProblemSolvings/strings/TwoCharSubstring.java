package BasicLevelProblemSolvings.strings;

public class TwoCharSubstring {
    public static String twoChar(String str, int index) {
        // Check if the index is within the valid range
        if (index >= 0 && index + 1 < str.length()) {
            // If within range, return a substring of length 2 starting at the given index
            return str.substring(index, index + 2);
        } else {
            // If the index is too big or too small, use the first 2 characters
            return str.substring(0, 2);
        }
    }

    public static void main(String[] args) {
        // Example 1
        System.out.println(twoChar("java", 0));  // Output: "ja"

        // Example 2
        System.out.println(twoChar("java", 2));  // Output: "va"

        // Example 3
        System.out.println(twoChar("java", 3));  // Output: "ja"
    }
}

