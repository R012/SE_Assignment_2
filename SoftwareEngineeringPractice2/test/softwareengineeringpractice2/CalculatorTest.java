
package softwareengineeringpractice2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Mario Cobos Maestre
 */
public class CalculatorTest {
    
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
    public void testSigmoid() {
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
    public void testSigmoid2() {
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
    public void testSigmoid3() {
        System.out.println("sigmoid");
        double x = -1.0;
        Calculator instance = new Calculator();
        double expResult = 0.2689414213699951;
        double result = instance.sigmoid(x);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of logistic method, of class Calculator.
     */
    @Test
    public void testLogistic() {
        System.out.println("logistic");
        double l = 0.0;
        double k = 0.0;
        double x = 0.0;
        double x0 = 0.0;
        Calculator instance = new Calculator();
        double expResult = 0.0;
        double result = instance.logistic(l, k, x, x0);
        assertEquals(expResult, result, 0.0);
    }
}
