/*
 * Represents water that can be sold at Taco Bell
 * Water is a type of Taco Bell item
 * Inherits from TacoBell and adds different vriables bottled and size.
 */

public class Water extends TacoBell{


//instance variables unique to Water
  private boolean bottled;
  private String size;

/*
* No-argument constructor:
* Calls superclass constructor and sets default values.
  */
  public Water(){
    super();
    this.bottled = true;
    this.size = "large";
     }  

/*
* Parameterized constructor:
* Calls superclass constructor and sets all instance variables.
*/
  public Water(String name, int calories, double price, boolean bottles, String size ) {
    super(name, calories, price);
    this.bottled = bottled;
    this.size = size;
  }

/*
* Accessor method:
* Returns whether the water is bottled
  */
   public boolean bottled() {
    return bottled;
  }
  
/*
* Accessor method:
* Returns the size of the water
  */
  public String size(){
    return size;
  }

/*
* Mutator method:
* Updates whether the water is bottled
*/
   public void setBottled(boolean newBottled){
    bottled= newBottled;
   }

/* 
* Mutator method:
* Updates the size of the water
*/
   public void setSize(String newSize){
    size=newSize;
   }
  
/*
* tString()method:
* Combines superclass information with subclass specific details.
  */
  public String toString() {
    return super.toString() + "\nBottled: " + bottled + "\nSize: " + size;
  }
}