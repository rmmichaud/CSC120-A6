/* This is a stub for the House class */
import java.lang.reflect.Array;
import java.util.*;

import javax.management.RuntimeErrorException;
public class House extends Building {
  private ArrayList<String> residents;
  private boolean hasDiningRoom;
  super.Building("Northrop", "Prospect", 5);
  public House (ArrayList<String> residents, boolean hasDiningRoom) {
    System.out.println("You have built a house: 🏠");
    this.residents = new ArrayList<String>(nResidents(null));
    this.hasDiningRoom = hasDiningRoom;
  }

  public int nResidents(Array residents) {
    int size = residents.size();
    return size;
  }

  public boolean hasDiningRoom(){
    return hasDiningRoom;
  } 

  public void moveIn(String Resident) {
    if (this.residents.contains(Resident)) {
      throw new RuntimeException("This resident already lives here.")
    } else {
      this.residents.add(Resident);
    }
  }

  public String moveOut(String Resident) {
    if (this.residents.contains(Resident)) {
      this.residents.remove(Resident);
    } else {
      throw new RuntimeException("This resident does not live here.")
  }

  private boolean isResident(String Resident) {
    if (this.residents.contains(Resident)) {
      return true;
    } else {
      return false;
    }
  }
  public static void main(String[] args) {
    new House();
  }

  }
}