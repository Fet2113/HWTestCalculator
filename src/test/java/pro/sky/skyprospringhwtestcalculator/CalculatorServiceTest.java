package pro.sky.skyprospringhwtestcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceTest {
    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    void greetings_success() {
        //Подготовка ожидаемого результата
        String expectedResult = "Добро пожаловать в калькулятор!";

        //Начало теста
        String actualResult = calculatorService.greetings();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void plus_success() {
        //Подготовка входных данных
        int num1 = 5;
        int num2 = 5;

        //Подготовка ожидаемого результата
        String expectedResult = TestUtils.formatResult(num1, num2, "+", "10");

        //Начало теста
        String actualResult = calculatorService.plus(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void plus_success2() {
        //Подготовка входных данных
        int num1 = 5;
        int num2 = 10;

        //Подготовка ожидаемого результата
        String expectedResult = TestUtils.formatResult(num1, num2, "+", "15");

        //Начало теста
        String actualResult = calculatorService.plus(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void minus_success() {
        //Подготовка входных данных
        int num1 = 10;
        int num2 = 5;

        //Подготовка ожидаемого результата
        String expectedResult = TestUtils.formatResult(num1, num2, "-", "5");

        //Начало теста
        String actualResult = calculatorService.minus(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void multiply_success() {
        //Подготовка входных данных
        int num1 = 5;
        int num2 = 5;

        //Подготовка ожидаемого результата
        String expectedResult = TestUtils.formatResult(num1, num2, "*", "25");

        //Начало теста
        String actualResult = calculatorService.multiply(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void divide_success() {
        //Подготовка входных данных
        int num1 = 5;
        int num2 = 5;

        //Подготовка ожидаемого результата
        String expectedResult = TestUtils.formatResult(num1, num2, "/", "1.0");

        //Начало теста
        String actualResult = calculatorService.divide(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void divide_withNum2IsZero() {
        //Подготовка входных данных
        int num1 = 5;
        int num2 = 0;

        //Подготовка ожидаемого результата
        String expectedErrorMessage = "На ноль делить нельзя!";

        //Начало теста
        Exception exception = assertThrows(ZeroDivideException.class, () -> calculatorService.divide(num1, num2));
        assertEquals(expectedErrorMessage, exception.getMessage());
    }
}

