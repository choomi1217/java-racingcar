package study.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.*;

public class UserNumbersTest {

    @DisplayName("사용자의 문자열을 덧셈합니다.")
    @ParameterizedTest
    @MethodSource
    void sum(String target, int expected){
        StringSeperator stringSeperator = new StringSeperator(new Delimiter(target));
        List<String> strings = stringSeperator.filteredString(target);

        int result = UserNumbers.from(strings).sum();
        assertThat(result).isEqualTo(expected);
    }

    private static Stream<Arguments> sum() {
        return Stream.of(
                Arguments.of("//;\n1;2;3", 6),
                Arguments.of("//&\n7&8&9", 24),
                Arguments.of("//+\n5+36+21", 62)
        );
    }
}
