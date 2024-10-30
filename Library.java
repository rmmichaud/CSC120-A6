/* This is a stub for the Library class */
import java.util.*;
public class Library extends Building {
    private Hashtable<String, Boolean> collection;
    public Library() {
      super("Nielson", "Chapin Way", 5);
      this.collection = new Hashtable<String, Boolean>();
      System.out.println("You have built a library: 📖");
    }
    
    public void addTitle(String title) {
      this.collection.put(title, true);
      System.out.println(title + " is added to the collection.");
    }
    public String removeTitle(String title) {
      this.collection.remove(title, true);
      System.out.println(title + " is removed from the collection.");
      return title;
    }

    public void checkOut(String title) {
      boolean defVal = this.collection.getOrDefault(title, false);
      if (defVal == true) {
        this.collection.replace(title, true, false);
        System.out.println(title +  " is now checked out.");
      } else {
        System.out.println(title + " is not available.");
      }
    }
    public void returnBook(String title) {
      this.collection.replace(title, false, true);
      System.out.println(title + " has been returned.");
    }

    public boolean containsTitle(String title) {
      if (this.collection.getOrDefault(title, false) == true) {
        System.out.println(title + " is available in the collection.");
        return true;
      } else {
        System.out.println(title + " is currently checked out or unavailable.");
        return false;
      }
    }
    public boolean isAvailable(String title) {
      boolean defVal = this.collection.getOrDefault(title, false);
      if (defVal == true) {
        return true;
      } else {
        return false;
      }
    }
    public void printCollection(){
      System.out.println(this.collection.toString());
    }
    public static void main(String[] args) {
      Library neilson = new Library();
      String title1 = "Great Gatsby";
      String title2 = "The Art of War";
      String title3 = "Moby Dick";
      String title4 = "War and Peace";
      neilson.addTitle(title1);
      neilson.addTitle(title2);
      neilson.addTitle(title3);
      neilson.addTitle(title4);
      neilson.printCollection();
      neilson.checkOut(title1);
      neilson.containsTitle(title1);
      neilson.checkOut(title4);
      neilson.returnBook(title1);
      neilson.containsTitle(title4);
      neilson.printCollection();
      neilson.returnBook(title4);
      neilson.removeTitle(title3);
      neilson.removeTitle(title1);
      neilson.printCollection();

    }
  
  }