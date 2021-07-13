package TddStudy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalculator {


    public static int splitAndSum(String text) {

        if (text == null || text.isEmpty())
            return 0;

        if (text.length() == 1)
            return Integer.parseInt(text);

        if (text.contains(",") || text.contains(";") || text.contains(":")) {
            String[] texts = text.split(",|:|;");

            int result = sum(texts);
            return result;
        }

        return 1;
    }

    public static int sum(String[] texts) {
        int result = 0;

        for (String digit : texts) {
            result += Integer.parseInt(digit);
        }
        return result;
    }


    public static void isMinus(String text) {
        if (text.contains("-")){
            throw new IllegalArgumentException();
        }
    }


    public static int isCustom(String text) {
        Matcher matcher = Pattern.compile("//;\n").matcher(text);
        System.out.println(matcher);

        int result = 0;
        if(matcher.find()){
            String customDelimiter = matcher.group(1);
            String[] texts = matcher.group(2).split(customDelimiter);
            result = sum(texts);
            System.out.println(texts);
        }

        return result;
    }
}
