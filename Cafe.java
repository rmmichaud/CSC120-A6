/* This is a stub for the Cafe class */
public class Cafe extends Building {
    private int nCoffeeOunces;
    private int nSugarPackets;
    private int nCreams;
    private int nCups;
    public Cafe(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        super("Compass", "Chapin Way", 2);
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
        System.out.println("You have built a cafe: ☕");
    }
    public void sellCoffee(int size, int nSugarPackets, int nCreams) {
        if (this.nCoffeeOunces < size) {
            restock(100, 0, 0, 0);
        }
        this.nCoffeeOunces -= size;
        if (this.nSugarPackets < nSugarPackets) {
            restock(0, 60, 0, 0);
        }
        this.nSugarPackets -= nSugarPackets;
        if (this.nCreams < nCreams) {
            restock(0, 0, 60, 0);
        }
        this.nCreams -= nCreams;
        if (this.nCups == 0) {
            restock(0, 0, 0, 60);
        }
        this.nCups -= 1;
        System.out.println(String.valueOf(nCoffeeOunces) + " ounces, " + String.valueOf(nCups) + " cups, "
         + String.valueOf(nCreams) + " creams, and " + String.valueOf(nSugarPackets) + " sugar packets remain in stock.");
    }
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        if (nCoffeeOunces != 0) {
            this.nCoffeeOunces = nCoffeeOunces;
        }
        if (nSugarPackets != 0) {
            this.nSugarPackets = nSugarPackets;
        }
        if (nCreams != 0) {
            this.nCreams = nCreams;
        }
        if (nCups != 0) {
            this.nCups = nCups;
        }
    }
    public static void main(String[] args) {
        Cafe compass = new Cafe(20, 10, 5, 30);
        compass.sellCoffee(12, 02, 03);
        compass.sellCoffee(25, 03, 05);
        compass.sellCoffee(12, 03, 05);
        
    }
    
}
