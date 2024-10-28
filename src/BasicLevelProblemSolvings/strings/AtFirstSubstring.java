package BasicLevelProblemSolvings.strings;

public class AtFirstSubstring {
    public static String atFirst(String str) {

        return str.length()>=2 ? str.substring(0,2) : str.isEmpty() ? "@@" : str+"@";
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

