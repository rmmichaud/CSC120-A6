/* This is a stub for the Cafe class */
public class Cafe extends Building {
    private int nCoffeeOunces;
    private int nSugarPackets;
    private int nCreams;
    private int nCups;
    public Cafe() {
        super.Building("Compass", "Chapin Way", "2");
        this.nCoffeeOunces = 60;
        this.nSugarPackets = 60;
        this.nCreams = 60;
        this.nCups = 60;
        System.out.println("You have built a cafe: ☕");
    }
    public void sellCoffee(int size, int nSugarPackets, int nCreams) {
        this.nCoffeeOunces -= size;
        this.nSugarPackets -= nSugarPackets;
        this.nCreams -= nCreams;
        this.nCups -= 1;
        restock(60, 60, 60, 60);
    }
    private void restock(int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups) {
        this.nCoffeeOunces = nCoffeeOunces;
        this.nSugarPackets = nSugarPackets;
        this.nCreams = nCreams;
        this.nCups = nCups;
    }
    public static void main(String[] args) {
        new Cafe();
    }
    
}
