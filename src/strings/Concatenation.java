package strings;

public class Concatenation {
    public static String conCat(String str1, String str2) {
        // Check if the last character of str1 is equal to the first character of str2
        if (str1.length() > 0 && str2.length() > 0 && str1.charAt(str1.length() - 1) == str2.charAt(0)) {
            // If there is a double-char, omit one of them
            return str1 + str2.substring(1);
        } else {
            // If no double-char, simply concatenate the strings
            return str1 + str2;
        }
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(conCat("abc", "cat"));  // Output: "abcat"
        System.out.println(conCat("dog", "cat"));  // Output: "dogcat"
        System.out.println(conCat("abc", ""));     // Output: "abc"
    }
}
