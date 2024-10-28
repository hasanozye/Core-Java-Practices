package BasicLevelProblemSolvings.strings;

public class StringYakRemover {
    public static void main(String[] args) {
        System.out.println(stringYak("yakpak"));   // Output: "pak"
        System.out.println(stringYak("pakyak"));   // Output: "pak"
        System.out.println(stringYak("yak123ya")); // Output: "123ya"
    }

    public static String stringYak(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            // Check for "yak" sequence and skip those characters
            if (i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k') {
                i += 2; // Skip "yak" characters
            } else {
                result.append(str.charAt(i));
            }
        }

        return result.toString();
    }
}

