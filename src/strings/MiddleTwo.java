
package strings;

public class MiddleTwo {
    public static void main(String[] args) {
        System.out.println(middleTwo("string"));    // Output: "ri"
        System.out.println(middleTwo("code"));      // Output: "od"
        System.out.println(middleTwo("Practice"));  // Output: "ct"
    }

    public static String middleTwo(String s) {
        int middleIndex = s.length() / 2;
        return s.substring(middleIndex - 1, middleIndex + 1);
    }
}
