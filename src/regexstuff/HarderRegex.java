package regexstuff;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HarderRegex {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("^(\\d+)\\s+[a-z]+\\s+[a-z]+\\s+(\\d+)$");
        Matcher matcher = pattern.matcher("10 divided by 2");

        // 10 divided by 2
        // 10/2
        if (matcher.find()){
            String simplified = "result = " + matcher.replaceFirst("$1/$2");
            System.out.println(simplified);

            int result = Integer.parseInt(matcher.group(1)) / Integer.parseInt(matcher.group(2));
            System.out.println("result = " + result);
        }

    }
}
