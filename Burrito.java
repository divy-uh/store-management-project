/*
 * Represents a burrito that can be sold at Taco Bell
 * Inherits common instance variables from TacoBell (name, calories, price)
 * and adds different instance variables like hasMeat and salsa.
 */

public class Burrito extends TacoBell{

//instance variables unique to Burrito
  private boolean hasMeat; //whether or not a burrit has meat 
  private String salsa; //the salsa of a burrito 

/*
* No-argument constructor:
* Calls the TacoBell constructor and sets default Burrito values.
*/
  public Burrito(){
    super();
    this.hasMeat= true;
    this.salsa= "red";
  }

    /*
   * Parameterized constructor:
   * Sets unique Burrito fields(hasMeat, salsa)
   * inherits previous instance variables from superclass
   */
  public Burrito(String name, int calories, double price, boolean hasMeat, String salsa){
    super(name, calories, price);
    this.hasMeat=hasMeat;
    this.salsa=salsa;
  }

  /*
  * Accessor method:
  * Returns true if the burrito contains meat.
  */
  public boolean getHasMeat() {
    return hasMeat;
  }
  
 /*
  * Acessor method:
   * Returns the value assigned to salsa
   */
  public String getSalsa(){
    return salsa;
  }

   /*
   * Mutator method:
   * Updates whether the burrito has meat.
   */
  public void setMeat(boolean newMeat) {
    hasMeat= newMeat;
  }

   /*
   * Mutator methpd:
   * Updates the type of salsa used in the burrito
   */
  public void setSalsa(String newSalsa){
    salsa= newSalsa;
  }

  /*
  * toString()method:
  * Combines superclass and subclass information into one output.
  */
  public String toString() {
    return super.toString() + "\nDoes it have meat? " + hasMeat + "\nSalsa: " + salsa;
  }
}