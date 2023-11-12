package strings;

public class StringPractices {

    public static void main(String[] args) {
        System.out.println(stringMatch("xxcaazz", "xxbaaz")); // Output: 3
        System.out.println(stringMatch("abc", "abc"));       // Output: 2
        System.out.println(stringMatch("abc", "axc"));       // Output: 0
    }

    public static int stringMatch(String a, String b) {
        // Determine the length of the shorter string
        int len = Math.min(a.length(), b.length());
        int count = 0;

        // Iterate through substrings of length 2
        for (int i = 0; i < len - 1; i++) {
            String subA = a.substring(i, i + 2);
            String subB = b.substring(i, i + 2);

            // Compare substrings
            if (subA.equals(subB)) {
                count++;
            }
        }

        return count;
    }

}
