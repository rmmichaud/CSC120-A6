/* This is a stub for the House class */
//import java.lang.reflect.Array;
import java.util.*;
//import javax.management.RuntimeErrorException;
public class House extends Building {
  private ArrayList<String> residents;
  private boolean hasDiningRoom;
  /**
   * initializes variables 
   * @param residents
   * @param hasDiningRoom
   */
  public House (ArrayList<String> residents, boolean hasDiningRoom) {
    super("Northrop", "Prospect", 5);
    System.out.println("You have built a house: 🏠");
    this.residents = new ArrayList<String>(residents);
    this.hasDiningRoom = hasDiningRoom;
  }
  /**
   * returns number of residents in a house 
   * @param residents
   * @return
   */
  public int nResidents(ArrayList<String> residents) {
    return this.residents.size();
  }
  /**
   * returns boolean depending on whether the house has a dining room
   * @return
   */
  public boolean hasDiningRoom(){
    return hasDiningRoom;
  } 
  /**
   * moves a student into a house if they don't already live there
   * @param Resident
   */
  public void moveIn(String Resident) {
    if (this.residents.contains(Resident)) {
      System.out.println(Resident + " already lives here.");
    } else {
      this.residents.add(Resident);
    } 
  }
  /**
   * moves a student out of the house if they already live there
   * @param Resident
   * @return
   */
  public String moveOut(String Resident) {
    if (this.residents.contains(Resident)) {
      this.residents.remove(Resident);
    } else {
      System.out.println(Resident + " does not live here.");
    } 
    return Resident;
  }
  /**
   * returns a boolean depending on whether a student lives in the house 
   * @param Resident
   * @return
   */
  private boolean isResident(String Resident) {
    return this.residents.contains(Resident);
    }
  /**
   * testing out the different methods 
   * @param args
   */
  public static void main(String[] args) {
    ArrayList<String> residents1 = new ArrayList<String>();
    residents1.add("Rachel");
    residents1.add("Lily");
    residents1.add("Marybella");
    residents1.add("Angelina");
    House sessions = new House(residents1, false);
    System.out.println(sessions);
    sessions.moveOut("Rachel");
    sessions.moveOut("Rachel");
    System.out.println(sessions.isResident("Rachel"));
    sessions.moveIn("Rachel");
    System.out.println(sessions.nResidents(residents1));
  }

}
