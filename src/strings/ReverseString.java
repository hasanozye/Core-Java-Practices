package strings;

public class ReverseString {

    public static void main(String[] args) {
        String str = "Hasan";

        // Method 1: Using String concatenation
        String result = reverseWithStringConcatenation(str);
        System.out.println("Method 1: " + result);

        // Method 2: Using char array
        String reversedCharArray = reverseWithCharArray(str);
        System.out.println("Method 2: " + reversedCharArray);

        // Method 3: Using StringBuffer
        String reversedStringBuffer = reverseWithStringBuffer(str);
        System.out.println("Method 3: " + reversedStringBuffer);

        // Method 4: Using StringBuilder
        String reversedStringBuilder = reverseWithStringBuilder(str);
        System.out.println("Method 4: " + reversedStringBuilder);
    }

    // Method 1: Using String concatenation
    private static String reverseWithStringConcatenation(String str) {
        String result = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    // Method 2: Using char array
    private static String reverseWithCharArray(String str) {
        char[] strChar = str.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = strChar.length - 1; i >= 0; i--) {
            result.append(strChar[i]);
        }
        return result.toString();
    }

    // Method 3: Using StringBuffer
    private static String reverseWithStringBuffer(String str) {
        StringBuffer buffer = new StringBuffer(str);
        return buffer.reverse().toString();
    }

    // Method 4: Using StringBuilder
    private static String reverseWithStringBuilder(String str) {
        StringBuilder reverse = new StringBuilder(str);
        return reverse.reverse().toString();
    }
}
