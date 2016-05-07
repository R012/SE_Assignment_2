
package exceptions;

/**
 *
 * @author Mario Cobos Maestre
 */
public class InvalidInputException extends Exception{
    
    public InvalidInputException()
    {
        super("The inserted input is not valid");
    }
    
    public InvalidInputException(String text)
    {
        super(text);
    }
}
