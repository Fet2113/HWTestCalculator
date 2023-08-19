package pro.sky.skyprospringhwtestcalculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorServiceParametrizedTest {
    private final CalculatorService calculatorService = new CalculatorService();

    public static Stream<Arguments> plusParams() {
        return Stream.of(
                Arguments.of(5, 5, "5 + 5 = 10"),
                Arguments.of(10, 5, "10 + 5 = 15"),
                Arguments.of(15, 5, "15 + 5 = 20")
        );
    }

    @ParameterizedTest
    @MethodSource("plusParams")
    void plus(int num1, int num2, String result) {
        assertEquals(result, calculatorService.plus(num1, num2));
    }

    public static Stream<Arguments> minusParams() {
        return Stream.of(
                Arguments.of(5, 5, "5 - 5 = 0"),
                Arguments.of(10, 5, "10 - 5 = 5"),
                Arguments.of(15, 5, "15 - 5 = 10")
        );
    }

    @ParameterizedTest
    @MethodSource("minusParams")
    void minus(int num1, int num2, String result) {
        assertEquals(result, calculatorService.minus(num1, num2));
    }

    public static Stream<Arguments> multiplyParams() {
        return Stream.of(
                Arguments.of(5, 5, "5 * 5 = 25"),
                Arguments.of(10, 5, "10 * 5 = 50"),
                Arguments.of(15, 5, "15 * 5 = 75")
        );
    }

    @ParameterizedTest
    @MethodSource("multiplyParams")
    void multiply(int num1, int num2, String result) {
        assertEquals(result, calculatorService.multiply(num1, num2));
    }

    public static Stream<Arguments> divideParams() {
        return Stream.of(
                Arguments.of(5, 5, "5 / 5 = 1.0"),
                Arguments.of(10, 5, "10 / 5 = 2.0"),
                Arguments.of(15, 5, "15 / 5 = 3.0")
        );
    }

    @ParameterizedTest
    @MethodSource("divideParams")
    void divide(int num1, int num2, String result) {
        assertEquals(result, calculatorService.divide(num1, num2));
    }
}
