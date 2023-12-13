package regexstuff;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("^[a|A]gent (\\d{3,4})$");
        Matcher matcher = pattern.matcher("agent 007");

        if (matcher.find()) {
            System.out.println(matcher.group());
            System.out.println(matcher.group(1));
        }
    }
}
