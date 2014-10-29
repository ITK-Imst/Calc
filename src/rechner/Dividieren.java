
package rechner;

/**
 *
 * @author Alex
 */
public class Dividieren implements IKalkulation {

    @Override
    public double rechnen(double a, double b) {
        
        if (b == 0)
        {
            System.out.println("Mit 0 keine Divsion möglich.");
            return -1;
        }
        else 
        {
            return a / b;
        }
    }
    
}
