package strings;

public class DeFrontExample {

    public static void main(String[] args) {
        System.out.println(deFront("Hello")); // Output: llo
        System.out.println(deFront("java"));  // Output: va
        System.out.println(deFront("away"));  // Output: aay
    }

    public static String deFront(String str) {
        // Check if the first character is 'a'
        boolean isFirstA = !str.isEmpty() && str.charAt(0) == 'a';

        // Check if the second character is 'b'
        boolean isSecondB = str.length() > 1 && str.charAt(1) == 'b';

        // If both conditions are true, keep the first two characters
        if (isFirstA && isSecondB) {
            return str;
        }

        // If the first character is 'a', keep it and return the substring starting from index 2
        if (isFirstA) {
            return str.substring(0, 1) + str.substring(2);
        }

        // If the second character is 'b', skip the first character and return the substring starting from index 1
        if (isSecondB) {
            return str.substring(1);
        }

        // If neither condition is true, skip the first two characters
        return str.substring(2);
    }
}

