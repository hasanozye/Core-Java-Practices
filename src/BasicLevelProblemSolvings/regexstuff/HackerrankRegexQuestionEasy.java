package BasicLevelProblemSolvings.regexstuff;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HackerrankRegexQuestionEasy {

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }

    static class UsernameValidator {
        /*
         * Write regular expression here.
         */
        Pattern pattern = Pattern.compile("");
        Matcher matcher = pattern.matcher("");


        public static final String regularExpression = null;
    }
}
