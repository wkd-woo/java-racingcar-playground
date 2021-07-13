package TddStudy;

public class StringAddCalculator {


    public static int splitAndSum(String text) {

        if (text == null || text.isEmpty())
            return 0;

        if (text.length() == 1)
            return Integer.parseInt(text);

        if (text.contains(",") || text.contains(";") || text.contains(":")) {
            int result = 0;
            String[] texts = text.split(",|:|;");

            for (String digit : texts) {
                result += Integer.parseInt(digit);
            }
            return result;
        }

        return 1;
    }




}
