
package rechner;

/**
 *
 * @author Alex
 */
public class Hauptstrategie {
    
    private IKalkulation kalkulation;
    
    public Hauptstrategie(IKalkulation kalkulation)
    {
        this.kalkulation = kalkulation;
    }
    
    public double berechne(double a,double b)
    {
        return kalkulation.rechnen(a,b);
    }
}
