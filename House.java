/* This is a stub for the House class */
//import java.lang.reflect.Array;
import java.util.*;
//import javax.management.RuntimeErrorException;
public class House extends Building {
  private ArrayList<String> residents;
  private boolean hasDiningRoom;
  public House (ArrayList<String> residents, boolean hasDiningRoom) {
    super("Northrop", "Prospect", 5);
    System.out.println("You have built a house: 🏠");
    this.residents = new ArrayList<String>(residents);
    this.hasDiningRoom = hasDiningRoom;
  }

  public int nResidents(ArrayList<String> residents) {
    return this.residents.size();
  }

  public boolean hasDiningRoom(){
    return hasDiningRoom;
  } 

  public void moveIn(String Resident) {
    if (this.residents.contains(Resident)) {
      System.out.println(Resident + " already lives here.");
    } else {
      this.residents.add(Resident);
    } 
  }

  public String moveOut(String Resident) {
    if (this.residents.contains(Resident)) {
      this.residents.remove(Resident);
    } else {
      System.out.println(Resident + " does not live here.");
    } 
    return Resident;
  }
  private boolean isResident(String Resident) {
    return this.residents.contains(Resident);
    }
  public static void main(String[] args) {
    ArrayList<String> residents1 = new ArrayList<String>();
    residents1.add("Rachel");
    residents1.add("Lily");
    residents1.add("Marybella");
    residents1.add("Angelina");
    House sessions = new House(residents1, false);
    sessions.moveOut("Rachel");
    sessions.moveOut("Rachel");
    System.out.println(sessions.isResident("Rachel"));
    sessions.moveIn("Rachel");
    System.out.println(sessions.nResidents(residents1));
  }

}
