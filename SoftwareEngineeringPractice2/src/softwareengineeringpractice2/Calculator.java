
package softwareengineeringpractice2;

/**
 *
 * @author Mario Cobos Maestre
 */
public class Calculator {

    public double sigmoid(double x)
    {
        return (1/(1 + Math.pow(Math.E, (-1*x))));
    }
    
    public double logistic(double l, double k, double x, double x0)
    {
        return (l/(1+Math.pow(Math.E, getExp(k, x, x0))));
    }
    
    private double getExp(double k, double x, double x0)
    {
        return -k*(x-x0);
    }
}
