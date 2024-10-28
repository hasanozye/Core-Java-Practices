package BasicLevelProblemSolvings.strings;

public class Stringx {
    public static String stringX(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'x' && i != 0 && i != s.length() - 1) {
                continue;
            } else {
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(stringX("xxHxix"));  // Output: "xHix"
        System.out.println(stringX("abxxxcd"));  // Output: "abcd"
        System.out.println(stringX("xabxxxcdx"));  // Output: "xabcdx"
    }
}
