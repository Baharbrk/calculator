package pt.ipp.isep.dei.examples.tdd.basic.domain;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class CalculatorTest {

    @BeforeAll
    public static void classSetUp() {
        //HACK: for demonstration purposes only
        System.out.println(
                "This is a CalculatorTest class method and takes place before any @Test is executed");
    }

    @AfterAll
    public static void classTearDown() {
        //HACK: for demonstration purposes only
        System.out.println(
                "This is a CalculatorTest class method and takes place after all @Test are executed");
    }

    @BeforeEach
    public void setUp() {
        //HACK: for demonstration purposes only
        System.out.println(
                "\tThis call takes place before each @Test is executed");
    }

    @AfterEach
    public void tearDown() {
        //HACK: for demonstration purposes only
        System.out.println(
                "\tThis call takes place after each @Test is executed");
    }

    @Test
    @Disabled
    public void failingTest() {
        fail("a disabled failing test");
    }

    /**
     * Test to ensure two positive numbers are summed correctly.<p>
     * <p>
     * For demonstration purposes the Arrange/Act/Assert syntax is used:<p>
     * Arrange: one positive number (three) and another positive number (two).<p>
     * Act: sum both numbers (three and two).<p>
     * Assert: the result is five.
     */
    @Test
    public void ensureThreePlusTwoEqualsFive() {

        //HACK: for demonstration purposes only
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int expectedResult = 5;
        int firsOperand = 3;
        int secondOperand = 2;
        int result = 3;

        // Act
        result = new Calculator().sum(firsOperand, secondOperand);

        // Assert
        assertEquals(expectedResult, result);
    }

    /**
     * Test to ensure positive and negative numbers are summed correctly.<p>
     * <p>
     * For demonstration purposes the Arrange/Act/Assert syntax is used:<p>
     * Arranje a positive number (three) and a negative number (minus two)<p>
     * Act I sum three to minus two<p>
     * Assert the sum result should be one.
     */
    @Test
    public void ensureThreePlusMinusTwoEqualsOne() {
        //HACK: for demonstration purposes only
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int firsOperand = 3;
        int secondOperand = -2;
        int expectedResult = 1;
        int result = 3;

        // Act
        result = new Calculator().sum(firsOperand, secondOperand);

        // Assert
        assertEquals(expectedResult, result);
    }

    /**
     * Test for two positive operands
     **/
    @Test
    public void ensureFourPlusTwoIsSix() {
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int firsOperand = 4;
        int secondOperand = 2;
        int expectedResult = 6;
        int result = 0;

        // Act
        result = new Calculator().sum(firsOperand, secondOperand);

        // Assert
        assertEquals(expectedResult, result);
    }

    /**
     * Test for two negative operands
     **/
    @Test
    public void ensureMinusFourPlusMinusTwoIsMinusSix() {
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int firsOperand = -4;
        int secondOperand = -2;
        int expectedResult = -6;
        int result = 0;

        // Act
        result = new Calculator().sum(firsOperand, secondOperand);

        // Assert
        assertEquals(expectedResult, result);
    }

    /**
     * Test for one positive operand and one negative one when positive operand is bigger than the negative one
     **/
    @Test
    public void ensureFourPlusMinusTwoIsTwo() {
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int firsOperand = 4;
        int secondOperand = -2;
        int expectedResult = 2;
        int result = 0;

        // Act
        result = new Calculator().sum(firsOperand, secondOperand);

        // Assert
        assertEquals(expectedResult, result);
    }

    /**
     * Test for one positive operand and one negative one when negative operand is bigger than the positive one
     **/
    @Test
    public void ensureMinusFourPluTwoIsMinusTwo() {
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int firsOperand = -4;
        int secondOperand = 2;
        int expectedResult = -2;
        int result = 0;

        // Act
        result = new Calculator().sum(firsOperand, secondOperand);

        // Assert
        assertEquals(expectedResult, result);
    }

    /**
     * Test for one positive operand and one negative one when negative operand is bigger than the positive one
     **/
    @Test
    public void ensureFourPlusZeroIsFour() {
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int firsOperand = 4;
        int secondOperand = 0;
        int expectedResult = 4;
        int result = 0;

        // Act
        result = new Calculator().sum(firsOperand, secondOperand);

        // Assert
        assertEquals(expectedResult, result);
    }

    /**
     * Test for two positive operands when first operand is bigger than the second one
     **/
    @Test
    public void ensureFourSubTwoIsTwo() {
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int firsOperand = 4;
        int secondOperand = 2;
        int expectedResult = 2;
        int result = 0;

        // Act
        result = new Calculator().subtract(firsOperand, secondOperand);

        // Assert
        assertEquals(expectedResult, result);
    }

    /**
     * Test for two positive operands when first operand is smaller than the second one
     **/
    @Test
    public void ensureTwoSubFourIsMinusTwo() {
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int firsOperand = 2;
        int secondOperand = -4;
        int expectedResult = -2;
        int result = 0;

        // Act
        result = new Calculator().subtract(firsOperand, secondOperand);

        // Assert
        assertEquals(expectedResult, result);
    }

    /**
     * Test for two negative numbers
     **/
    @Test
    public void ensureMinusFourSubMinusTwoIsTwo() {
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int firsOperand = -4;
        int secondOperand = -2;
        int expectedResult = 2;
        int result = 0;

        // Act
        result = new Calculator().subtract(firsOperand, secondOperand);

        // Assert
        assertEquals(expectedResult, result);
    }

    /**
     * Test for one positive operand and one negative one
     **/
    @Test
    public void ensureTwoSubMinusFourIsSix() {
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int firsOperand = 2;
        int secondOperand = -4;
        int expectedResult = 6;
        int result = 0;

        // Act
        result = new Calculator().subtract(firsOperand, secondOperand);

        // Assert
        assertEquals(expectedResult, result);
    }

    /**
     * Test for one number with 0
     **/
    @Test
    public void ensureFourSubZeroIsFour() {
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int firsOperand = 4;
        int secondOperand = 0;
        int expectedResult = 4;
        int result = 0;

        // Act
        result = new Calculator().subtract(firsOperand, secondOperand);

        // Assert
        assertEquals(expectedResult, result);
    }

    /**
     * Test for two positive operands
     **/
    @Test
    public void ensureFourMultipliesTwoIsEight() {
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int firsOperand = 4;
        int secondOperand = 2;
        int expectedResult = 8;
        int result = 0;

        // Act
        result = new Calculator().multiply(firsOperand, secondOperand);

        // Assert
        assertEquals(expectedResult, result);
    }

    /**
     * Test for two negative numbers
     **/
    @Test
    public void ensureMinusFourMultipliesMinusTwoIsEight() {
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int firsOperand = -4;
        int secondOperand = -2;
        int expectedResult = 8;
        int result = 0;

        // Act
        result = new Calculator().multiply(firsOperand, secondOperand);

        // Assert
        assertEquals(expectedResult, result);
    }

    /**
     * Test for one positive operand and one negative one
     **/
    @Test
    public void ensureMinusFourMultipliesTwoIsMinusEight() {
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int firsOperand = -4;
        int secondOperand = 2;
        int expectedResult = -8;
        int result = 0;

        // Act
        result = new Calculator().multiply(firsOperand, secondOperand);

        // Assert
        assertEquals(expectedResult, result);
    }

    /**
     * Test for one operand with 0
     **/
    @Test
    public void ensureFourMultipliesZeroIsZeo() {
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int firsOperand = 4;
        int secondOperand = 0;
        int expectedResult = 0;
        int result = 0;

        // Act
        result = new Calculator().multiply(firsOperand, secondOperand);

        // Assert
        assertEquals(expectedResult, result);
    }

    /**
     * Test for two positive operands
     **/
    @Test
    public void ensureFourDividedByTwoIsTwo() {
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int firsOperand = 4;
        int secondOperand = 2;
        int expectedResult = 2;
        int result = 0;

        // Act
        result = new Calculator().divide(firsOperand, secondOperand);

        // Assert
        assertEquals(expectedResult, result);
    }

    /**
     * Test for two negative numbers
     **/
    @Test
    public void ensureMinusFourDividedByMinusTwoIsTwo() {
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int firsOperand = -4;
        int secondOperand = -2;
        int expectedResult = 2;
        int result = 0;

        // Act
        result = new Calculator().divide(firsOperand, secondOperand);

        // Assert
        assertEquals(expectedResult, result);
    }

    /**
     * Test for one positive operand and one negative one
     **/
    @Test
    public void ensureMinusFourDividedByTwoIsMinusTwo() {
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int firsOperand = -4;
        int secondOperand = 2;
        int expectedResult = -2;
        int result = 0;

        // Act
        result = new Calculator().divide(firsOperand, secondOperand);

        // Assert
        assertEquals(expectedResult, result);
    }

    /**
     * Test for  0 as first operand
     **/
    @Test
    public void ensureZeroDividedByFourIsZero() {
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int firsOperand = 0;
        int secondOperand = 4;
        int expectedResult = 0;
        int result = 0;

        // Act
        result = new Calculator().divide(firsOperand, secondOperand);

        // Assert
        assertEquals(expectedResult, result);
    }

    /**
     * Test for  0 as second operand
     **/
    @Test
    public void ensureFourDividedByZeroThrowsError() {
        System.out.println("\t\tExecuting " + new Object() {
        }.getClass().getEnclosingMethod().getName() + " Test");

        // Arrange
        int firsOperand = 4;
        int secondOperand = 0;
        int expectedResult = Error;
        int result = 0;

        // Act
        result = new Calculator().divide(firsOperand, secondOperand);

        // Assert
        assertEquals(expectedResult, result);
    }

}



