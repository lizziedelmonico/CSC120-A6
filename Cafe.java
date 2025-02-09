/* This is a stub for the Cafe class */
public class Cafe extends Building{

    private int nCoffeeOunces;
    private int nsugarPackets;
    private int nCream;
    private int nCups;

   /**
    * The constructor that initializes various variables that will be used in the cafe.
    * @param name: The name of the cafe. 
    * @param address: The address of the cafe. 
    * @param nFloors: The number of floors the cafe has. 
    */
    public Cafe(String name, String address, int nFloors){
        super(name, address, nFloors);
        this.nCoffeeOunces = 100;
        this.nsugarPackets = 40;
        this.nCream = 40;
        this.nCups = 50;
    }
    
    /**
     * Decreases the values of certain variables when a coffee is sold.
     * @param size: The number of ounces of coffee being ordered.
     * @param nSugarPackets: The number of sugar packets being ordered. 
     * @param nCreams: The number of cream splashes being ordered.
     */
    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        if (nCoffeeOunces > 0){
            nCoffeeOunces = nCoffeeOunces - size;
        }
        if (nsugarPackets > 0){
            nsugarPackets = nsugarPackets - nSugarPackets;
        }
        if (nCreams > 0){
            nCream = nCream - nCreams;
        }
        if (nCups > 0){
            nCups -= 1;
        }
        else restock(size, nSugarPackets, nCreams, nCreams);
        System.out.println("Remaining inventory is: " + nCoffeeOunces + " ounces of coffee, " + nsugarPackets + " sugar packets, " + nCreams + " splashes of cream, " + nCups + " cups.");
    }

    /**
     * Returns the values of the variables to their maximum amount.
     * @param nCoffeeOunces: Ounces of coffee.
     * @param nsugarPackets: Sugar packets.
     * @param nCream: Number of cream splashes.
     * @param nCups: Number of cups.
     */
    private void restock(int nCoffeeOunces, int nsugarPackets, int nCream, int nCups){
        if (nCoffeeOunces <= 0){
            nCoffeeOunces = 100;
        }
        if (nsugarPackets <= 0){
            nsugarPackets = 40;
        }
        if (nCream <= 0){
            nCream = 40;
        }
        if (nCups <= 0){
            nCups = 50;
        }
    }

    /**
     * Prints out the information provided for the specific cafe. 
     * @param args: The various variables used in the class. 
     */
    public static void main(String[] args) {
        Cafe Lizzie = new Cafe("Lizzie's Cafe", "34 Main Street", 1);
        System.out.println(Lizzie);
    }
    
}
