
package softwareengineeringpractice2;

import exceptions.InvalidInputException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

/**
 *
 * @author Mario Cobos Maestre
 */
public class CalculatorTest {
    
    @Rule
    public final ExpectedException exception = ExpectedException.none();
    
    public CalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of sigmoid method, of class Calculator.
     */
    @Test
    public void testSigmoid() throws InvalidInputException {
        System.out.println("sigmoid");
        double x = 10.0;
        Calculator instance = new Calculator();
        double expResult = 0.9999546021312976;
        double result = instance.sigmoid(x);
        assertEquals(expResult, result, 0.0);
    }
    
    /**
     * Test of sigmoid method, of class Calculator.
     */
    @Test
    public void testSigmoid2() throws InvalidInputException {
        System.out.println("sigmoid");
        double x = 15.0;
        Calculator instance = new Calculator();
        double expResult = 0.999999694097773;
        double result = instance.sigmoid(x);
        assertEquals(expResult, result, 0.0);
    }
    
    /**
     * Test of sigmoid method, of class Calculator.
     */
    @Test
    public void testSigmoid3() throws InvalidInputException {
        System.out.println("sigmoid");
        double x = 1.0;
        Calculator instance = new Calculator();
        double expResult = 0.73105857863000487925115924182184;
        double result = instance.sigmoid(x);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of logistic method, of class Calculator.
     */
    @Test
    public void testLogistic() {
        System.out.println("logistic");
        double l = 12.0;
        double k = 5.0;
        double x = 10.0;
        double x0 = 7.0;
        Calculator instance = new Calculator();
        double expResult = 12.0;
        double result = instance.logistic(l, k, x, x0);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of sigmoidDerivative method, of class Calculator.
     */
    @Test
    public void testSigmoidDerivative() {
        System.out.println("sigmoidDerivative");
        double x = 3.0;
        Calculator instance = new Calculator();
        double expResult = 0.04517665973091213264936002843565;
        double result = instance.sigmoidDerivative(x);
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testInvalidInputException() throws InvalidInputException
    {
        System.out.println("InvalidInputException");
        double x = -5;
        Calculator instance = new Calculator();
        exception.expect(InvalidInputException.class);
        double result = instance.sigmoid(x);
    }

    /**
     * Test of getExpInterface method, of class Calculator.
     */
    @Test
    public void testGetExpInterface() {
        System.out.println("getExpInterface");
        double k = 5.0;
        double x = 10.0;
        double x0 = 7.0;
        Calculator instance = new Calculator();
        double expResult = -15.0;
        double result = instance.getExpInterface(k, x, x0);
        assertEquals(expResult, result, 0.0);
    }
}
