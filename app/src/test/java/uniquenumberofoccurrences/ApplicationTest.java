package uniquenumberofoccurrences;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;
import org.junit.jupiter.params.provider.ArgumentsSource;

import static org.assertj.core.api.Assertions.*;

import questions.uniquenumberofoccurrences.Solution;

import java.util.stream.Stream;

public class ApplicationTest {
    static class CustomArgumentProvider implements ArgumentsProvider {
        @Override
        public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
            return Stream.of(
                    Arguments.of(new int[] { 1, 2, 2, 1, 1, 3 }, true),
                    Arguments.of(new int[] { 1, 2 }, false),
                    Arguments.of(new int[] { -3, 0, 1, -3, 1, 1, 1, -3, 10, 0 }, true));
        }
    }

    @ParameterizedTest
    @ArgumentsSource(CustomArgumentProvider.class)
    void uniqueOccurrences(int[] testArr, boolean expected) {
        // given
        Solution solution = new Solution();
        // when
        boolean result = solution.uniqueOccurrences(testArr);
        // then
        assertThat(result).isEqualTo(expected);

    }
}
