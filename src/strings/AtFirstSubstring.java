package strings;

public class AtFirstSubstring {
    public static String atFirst(String str) {
        // Check if the string length is at least 2
        if (str.length() >= 2) {
            // If so, return the first 2 characters
            return str.substring(0, 2);
        } else {
            // If the string length is less than 2, use '@' for the missing characters
            return str.length() == 1 ? str + "@" : "@@";
        }
    }

    public static void main(String[] args) {
        // Example 1
        System.out.println(atFirst("hello"));  // Output: "he"

        // Example 2
        System.out.println(atFirst("hi"));  // Output: "hi"

        // Example 3
        System.out.println(atFirst("h"));  // Output: "h@"
    }
}

