
package rechner;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Rechner {
    double erste, zweite;
    String operator;
    Scanner scan = new Scanner(System.in);

    private void einholer()
    {
        System.out.println("Bitte geben Sie die erste Zahl ein: ");
        erste = scan.nextDouble();
        System.out.println("+ - * /");
        operator = scan.nextLine();
        System.out.println("Bitte geben Sie die zweite Zahl ein: ");
        zweite = scan.nextDouble();
    }
    
    public double kalkulation(double erste, double zweite, String operator)
    {
        Hauptstrategie hauptStrategie = null;
        if (operator.equals("+"))
        {
            hauptStrategie = new Hauptstrategie(new Addieren());
        }
        if (operator.equals("-"))
        {
            hauptStrategie = new Hauptstrategie(new Subtrahieren());
        }
        if (operator.equals("*"))
        {
            hauptStrategie = new Hauptstrategie(new Multiplizieren());
        }
        if (operator.equals("/"))
        {
            hauptStrategie = new Hauptstrategie(new Dividieren());
        }
        return hauptStrategie.berechne(erste, zweite);
    }
}
