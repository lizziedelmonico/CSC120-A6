import java.util.Hashtable;
/* This is a stub for the Library class */
public class Library extends Building{
  
  private Hashtable<String, Boolean> collection;

  /**
   * The constructor that initializes various variables that will be used in the Library.
   * @param name: The name of the library.
   * @param address: The address of the library.
   * @param nFloors: The number of floors the library has. 
   */
  public Library(String name, String address, int nFloors){
    super(name, address, nFloors);
    this.collection = new Hashtable<String, Boolean>();
  }
  
  /**
   * Adds a book to the library. 
   * @param title: The title and author of the book.
   */
  public void addTitle(String title){
    collection.put(title, true);
  }

  /**
   * Removes a specific book from the library and returns its title.
   * @param title: The title and author of the book.
   * @return: The title and author of the book being removed. 
   */
  public String returnTitle(String title){
    collection.remove(title, false);
    return title;
  }

  /**
   * Checks out a book from the library.
   * @param title: The title and author of the book being checked out.
   */
  public void checkOut(String title){
    collection.replace(title, false);
  }

  /**
   * Returns a book to the library. 
   * @param title: The title and author of the book being returned. 
   */
  public void returnBook(String title){
    collection.replace(title, true);
  }

  /**
   * Checks if a specific book is in the library's collection.
   * @param title: The title and author of the book.
   * @return: Whether or not the book is in the library's collection.
   */
  public boolean containsTitle(String title){
    return collection.containsKey(title);
  }

  /**
   * Checks if a specific book is available to check out.
   * @param title: The title and author of the book.
   * @return: Whether or not the book is available to check out.
   */
  public boolean isAvailable(String title){
    return collection.containsKey(title);
  }

  /**
   * Prints the library's entire collection. 
   */
  public void printCollection(){
    System.out.println("Library: " + collection);
  }

  /**
   * Prints out the specific information of the user-input library.
   * @param args: The various variables used in the class. 
   */
  public static void main(String[] args) {
    Library neilson = new Library("Neilson", "7 Neilson Drive", 5);
    System.out.println(neilson);
  }
  
}