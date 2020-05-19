package task2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void shouldAddTwoNumbers() {
        //given
        int a = 10;
        int b = 15;
        Calculator calculator = new Calculator();
        //when
        int sum = calculator.sum(a, b);

        //then
        assertEquals(25, sum);
    }

    @Test
    public void shouldSubtractTwoNumbers() {
        //given
        int a = 20;
        int b = 10;
        Calculator calculator = new Calculator();

        //when
        int subtract = calculator.subtract(a, b);

        //then
        assertEquals(10, subtract);
    }

    @Test
    public void shouldMultiplyTwoNumbers() {
        //given
        int a = 5;
        int b = 6;
        Calculator calculator = new Calculator();

        //when
        int multiply = calculator.multiply(a, b);

        //then
        assertEquals(30, multiply);
    }

    @Test
    public void shouldDivideTwoNumbers() {
        //given
        double a = 15;
        double b = 2;
        Calculator calculator = new Calculator();

        //when
        double divide = calculator.divide(a, b);

        //then
        assertEquals(7.5, divide);
    }
}