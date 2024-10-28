package BasicLevelProblemSolvings.strings;

public class WithoutEnd2 {
    public static void main(String[] args) {
        System.out.println(withoutEnd2("Hello"));  // Output: "ell"
        System.out.println(withoutEnd2("abc"));    // Output: "b"
        System.out.println(withoutEnd2("ab"));     // Output: ""
    }

    public static String withoutEnd2(String str) {
        // Check if the string has at least two characters
        if (str.length() >= 2) {
            // Return the substring excluding the first and last characters
            return str.substring(1, str.length() - 1);
        } else {
            // If the string has fewer than two characters, return an empty string
            return "";
        }
    }
}

