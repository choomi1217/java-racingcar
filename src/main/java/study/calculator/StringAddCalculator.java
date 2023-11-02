package study.calculator;

import java.util.List;

public class StringAddCalculator {
    public static int splitAndSum(String origin) {
        if(origin == null || origin.isBlank()){
            return 0;
        }
        StringSeperator stringSeperator = new StringSeperator(new Delimiter(origin));
        List<String> strings = stringSeperator.filteredString(origin);
        return UserNumbers.from(strings).sum();
    }
}
