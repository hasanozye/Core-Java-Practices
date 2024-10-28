package BasicLevelProblemSolvings.booleanProblems;

public class FizzBuzzString2 {
    public static void main(String[] args) {
        System.out.println(fizzString2(1));  // Output: "1!"
        System.out.println(fizzString2(2));  // Output: "2!"
        System.out.println(fizzString2(3));  // Output: "Fizz!"
    }

    public static String fizzString2(int n) {
        // Check if the number is divisible by both 3 and 5
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz!";
        } else if (n % 3 == 0) {
            return "Fizz!";
        } else if (n % 5 == 0) {
            return "Buzz!";
        } else {
            // If not divisible by 3 or 5, return the string form of the number followed by "!"
            return n + "!";
        }
    }
}

