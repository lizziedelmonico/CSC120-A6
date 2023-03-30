import java.util.ArrayList;

/* This is a stub for the House class */
public class House extends Building{

  private ArrayList<String> residents;
  private boolean hasDiningRoom;
  public int hasResidents;

 /**
  * A constructor that initializes various variables. 
  * @param name: The name of the house. 
  * @param address: The address of the house. 
  * @param nFloors: The number of floors in the house.
  * @param hasDiningRoom: If the house has a dining room. 
  */
  public House(String name, String address, int nFloors, boolean hasDiningRoom) {
    super(name, address, nFloors);
    this.residents = new ArrayList<String>();
    this.hasDiningRoom = hasDiningRoom;
  }

  /**
   * Adds a resident to the array list of names.
   * @param name: the name of the resident moving in.
   */
  public void moveIn(String name){
    this.residents.add(name);
  }

  /**
   * Removes a resident from the array list of names. 
   * @param name: The name of the resident moving out. 
   * @return: name of the resident moving out.
   */
  public String moveOut(String name){
    this.residents.remove(name);
    return name;
  }

  /**
   * States whether or not a specific person lives in the house. 
   * @param person: The name of a person whom the user wants to search for. 
   * @return: Whether or not the person lives in the house.
   */
  public boolean isResident(String person){
    return this.residents.contains(person);
  }

  /**
   * Gives a description of the house (number of residents and if it has a dining room).
   * @return: The description stating the number of residents in the house and whether or not it has a dining room.
   */
  public String toString() {
    String description = super.toString();
    description += ". This house currently has " + this.residents.size() + " residents.";
    if (this.hasDiningRoom) {
      description += " This house has a dining room.";
    } else {
    description += "This house does not have a dining room.";
    }
    return description;
  }
  
  /**
   * Prints out the information of a specific house. 
   * @param args: The various variables used in the class. 
   */
  public static void main(String[] args) {
    House scales = new House("Scales", "170 Elm Street", 4, true);
    System.out.println(scales);
  }

}
