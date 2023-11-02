package study.calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Delimiter {

    public static final String DEFAULT_DELIMITER = ",|:";
    private static final int DELIMITER_INDEX = 1;
    public static final Pattern DELLIMITER_PATTERN = Pattern.compile("//(.)\n(.*)");

    private final String delimiter;

    public Delimiter(String target) {
        this.delimiter = parsingDelimiter(target);
    }

    private String parsingDelimiter(String target) {
        Matcher matcher = DELLIMITER_PATTERN.matcher(target);
        if (matcher.find()) {
            return Pattern.quote(matcher.group(DELIMITER_INDEX));
        }
        return DEFAULT_DELIMITER;
    }

    public String delimiter(){
        return delimiter;
    }
}
