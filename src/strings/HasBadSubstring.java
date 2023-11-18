package strings;

public class HasBadSubstring {
    public static boolean hasBad(String str) {
        // Check if "bad" appears starting at index 0 or 1
        return str.length() >= 3 && (str.substring(0, 3).equals("bad") || (str.length() >= 4 && str.substring(1, 4).equals("bad")));
    }

    public static void main(String[] args) {
        // Example 1
        System.out.println(hasBad("badxx"));  // Output: true

        // Example 2
        System.out.println(hasBad("xbadxx"));  // Output: true

        // Example 3
        System.out.println(hasBad("xxbadxx"));  // Output: false
    }
}

