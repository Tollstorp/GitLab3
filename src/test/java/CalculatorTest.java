package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {

    org.example.Calculator calculator;


    @BeforeEach // Initializes a new Calculator instance before each test
    public void beforeTests() {
        System.out.println("Setting up a new Calculator instance");
        calculator = new Calculator();
    }



    @Test
    @DisplayName("Calculate adding 4 to 1 is 5")
    public void testAdd2() {
        /*        Calculator calculator = new Calculator();*/
        int result = calculator.add(4, 1);
        assertEquals(5, result, "4 + 1 should equal 1");
        // test too se if I can run the Calculator from the BeforeEach command
        // so I can keep test code DRY (don't repeat yourself)
    }


    @Test
    @DisplayName("Calculate adding 5 to 3 is 8")
    public void testAdd() {
        int result = calculator.add(5,3);
        assertEquals(8, result, "5 + 3 should equal 8");
        //same test as above just different values, just verifying I understand what's going on..
    }

    @Test
    @DisplayName("Calculate 4 minus 3 is 1")
    public void testSubtract() {
        int result = calculator.subtract(4, 3);
        assertEquals(1, result, "4-3 should result in 1");
        //basic subtraction
    }

    @Test
    @DisplayName("Calculate 15 divided by 3 is 5")
    public void testDivide() {
        int result = (int) calculator.divide(15, 3);
        assertEquals(5, result, "15 / 3 should result 5");
        //basic division
    }

    @Test
    @DisplayName("Calculate 5 multiplied by 3 is 15")
    public void testMultiply() {
        int result = calculator.multiply(5, 3);
        assertEquals(15, result, "5 * 3 should result in 15");

    }

    @Test
    @DisplayName("Calculate 5 * 4 is not 15")
    public void testMultiplyIncorrect() {
        int result = calculator.multiply(5, 4);
        assertNotEquals(15, result, "5 * 4 should NOT equal 15");
        //verifying that incorrect results are handled properly
        // just because a test passes with the "correct data", doesn't mean
        // we shouldn't test incorrect data. I want to see that my test that my tests
        //catches when the Calulators result differs from my assertion without throwing a fail in the report
        //Hence the NotEquals assertion
    }

    @Test
    @DisplayName("Calculate square root of 16")
    public void testSquareRootOf() {
        double result = calculator.squareRootOf(16);
        assertEquals(4.0, result, "square root of 16 should be 4");
        //figuring out the lossy conversion thing... was having problems with
        // asserting  value "4" instead of "4.0"
    }

    @Test
    @DisplayName("Calculate square root of 16 is not 6")
    public void testSquareRootOfIncorrect() {
        double result = calculator.squareRootOf(16);
        assertNotEquals(6.0, result, "square root of 16 should not equal 6.0");
        //verifying not correct results won't pass, I messed up the assertion type at first...
    }
/*        @Test
        @DisplayName("8 -4 = 4")
        public void testEightMinusFourEqualFour(){
            Calculator calculator = new Calculator();
            int actual = calculator.subtractTwonumbers(4,8);
            assert
        }*/

    @Test
    @DisplayName("Verify if 7 is odd")
    public void ifNumberIsOddThenTrue(){
        Calculator calculator1 = new Calculator();
        assertTrue(calculator.isOdd(7));
        //case from class, learning the True assertion

    }

    @Test
    @DisplayName("Calculate area of a circle with radius 5")
    public void testGetArea() {
        double result = calculator.getArea(5);
        assertEquals(78.54, result, "Area of a circle with radius 5 should be 78.54");
        //Had to google the math for radius sinces its been a while
    }

    @Test
    @DisplayName("Veryfi worng result of area won't pass")
    public void testIncorrectGetArea() {
        double result = calculator.getArea(5);
        assertNotEquals(5.0, result, "Area of a circle with radius 5 should not be 5");
    }

    @Test
    @DisplayName("Calculate area of a circle with negative radius")
    public void testGetAreaNegative() {
        double result = calculator.getArea(-5);
        assertTrue(Double.isNaN(result), "Area of a circle with negative radius should be NaN");
        //Since figuring out the True assertion earlier, I wanted to try it in an edge case
    }




}
