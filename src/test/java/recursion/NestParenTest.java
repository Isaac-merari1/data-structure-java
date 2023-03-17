package recursion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.Assertions.assertThat;
class NestParenTest {

    @ParameterizedTest
    @MethodSource(value = "nestParen")
    @Test
    void nestParen(String input, boolean expected) {
        NestParen nestParenTest = new NestParen();
        boolean actual = nestParenTest.nestParen(input);

        assertThat(actual).isEqualTo(expected);
    }

    static Stream<Arguments> nestParen(){
        return Stream.of(
                Arguments.of("(())", true),
                Arguments.of("((()))", true),
                Arguments.of("(((x))", false),
                Arguments.of("((())", false),
                Arguments.of("((()()", false),
                Arguments.of("()", true),
                Arguments.of("", true),
                Arguments.of("(yy)", false),
                Arguments.of("(())", true),
                Arguments.of("(((y))", false),
                Arguments.of("((y)))", false),
                Arguments.of("((()))", true),
                Arguments.of("(())))", false),
                Arguments.of("((yy())))", false),
                Arguments.of("(((())))", true)
        );
    }

}