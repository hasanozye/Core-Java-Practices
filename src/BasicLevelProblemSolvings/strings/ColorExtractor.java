package BasicLevelProblemSolvings.strings;

public class ColorExtractor {
    public static String seeColor(String s) {
        if (s.startsWith("red")) {
            return "red";
        } else if (s.startsWith("blue")) {
            return "blue";
        } else {
            return "";
        }
    }

    public static void main(String[] args) {
        // Example usage:
        System.out.println(seeColor("redxx"));      // Output: "red"
        System.out.println(seeColor("xxred"));      // Output: ""
        System.out.println(seeColor("blueTimes"));  // Output: "blue"
    }
}

