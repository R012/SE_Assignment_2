
package softwareengineeringpractice2;

import exceptions.InvalidInputException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mario Cobos Maestre
 */
public class Calculator {

    //Will be limited to positive values to test exceptions
    public double sigmoid(double x) throws InvalidInputException
    {
        if(x<0) throw new InvalidInputException();
        return (1/(1 + Math.pow(Math.E, (-1*x))));
    }
    
    public double sigmoidDerivative(double x)
    {
        return (Math.exp(x)/Math.pow((1+Math.exp(x)), 2));
    }
    
    public double logistic(double l, double k, double x, double x0)
    {
        return (l/(1+Math.pow(Math.E, getExp(k, x, x0))));
    }
    
    private double getExp(double k, double x, double x0)
    {
        return -k*(x-x0);
    }
    
    public double getExpInterface(double k, double x, double x0)
    {
        return -k*(x-x0);
    }
    
    //Main method created for the profiler
    public static void main(String[] args)
    {
        Calculator c = new Calculator();
        double x = 25.7, x0 = 12.37, k=15.0, l=11.17;
        System.out.println("X="+x+"; X0="+x0+"; K="+k+"; L="+l);
        try {
            System.out.println("Sigmoid(X) = "+c.sigmoid(x));
        } catch (InvalidInputException ex) {
            Logger.getLogger(Calculator.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("SigmoidDerivative(X) = "+c.sigmoidDerivative(x));
        System.out.println("Logistic(X, X0, K, L) = "+c.logistic(l, k, x, x0));
    }
}
