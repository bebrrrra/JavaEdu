package block2.lab14;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {

        String text = "25.98 USD, 100 RUB, 45 EU, 44 ERR, 0.004 EU";

        String regex = "(?<![\\w.])\\d+(\\.\\d{1,2})? (USD|RUB|EU)\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
