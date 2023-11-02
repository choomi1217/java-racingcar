package study.calculator;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.stream.Collectors;

public class StringSeperator {

    private final Delimiter delimiter;

    public StringSeperator(Delimiter delimiter) {
        this.delimiter = delimiter;
    }

    public List<String> filteredString(String target) {
        Matcher matcher = Delimiter.DELIMITER_PATTERN.matcher(target);
        if (matcher.find()) {
            String[] numbers = matcher.group(2).split(delimiter.delimiter());
            return Arrays.stream(numbers).collect(Collectors.toList());
        }
        return Arrays.stream(target.split(delimiter.delimiter())).collect(Collectors.toList());
    }
}
