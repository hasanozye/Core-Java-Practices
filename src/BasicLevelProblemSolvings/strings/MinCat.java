package BasicLevelProblemSolvings.strings;

public class MinCat {

    public static String minCat(String a, String b) {
        // Check if the length of string 'a' is greater than string 'b'
        if (a.length() > b.length()) {
            // Return the concatenation of the substring of 'a' (starting from the difference in lengths) and 'b'
            return a.substring(a.length() - b.length()) + b;
        } else if (b.length() > a.length()) {
            // Return the concatenation of 'a' and the substring of 'b' (starting from the difference in lengths)
            return a + b.substring(b.length() - a.length());
        } else {
            // If the lengths are equal, simply return the concatenation of 'a' and 'b'
            return a + b;
        }
    }

    public static void main(String[] args) {
        // Example usage:
        System.out.println(minCat("Hello", "Hi"));    // Output: "loHi"
        System.out.println(minCat("Hello", "java"));  // Output: "ellojava"
        System.out.println(minCat("java", "Hello"));  // Output: "javaello"
    }
}

