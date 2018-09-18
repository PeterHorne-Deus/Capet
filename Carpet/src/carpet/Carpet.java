/*
 * Peter Horne-Deus
 * Carpet.java
 * This program calculates the cost of a carpet with a length of 8.5m and 6m at a cost of $19.95 per square meter
 * September 18, 2018
 */

package carpet;

/**
 *
 * @author pehor9164
 */
public class Carpet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double length = 8.5;
        double width = 6;
        double price = 19.95;
        double total = (length*width)*19.95;
        System.out.println("The price of the carpet will be $" + total);
    }
    
}
