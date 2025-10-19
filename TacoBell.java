/* 
* TacoBell class:
* Represents a general product sold at Taco Bell.
* This is a superclass for other more specific items (like Burrito and Water)
* Includes shared instance variables (name, calories, price), constructors,
* accessor / mutator methods, and a toString() method.
*/


public class TacoBell{

  //instance variables shared with subclasses
  private String name;
  private int calories;
  private double price;


/*
* No-argument constructor:
* Initializes a TacoBell product with default values.
*/
  public TacoBell(){
    this("undefined", 300, 6.70);
  }

/*
* Parameterized constructor:
* initialized a TacoBell product with the given name, calories, and price
*/
  public TacoBell(String name, int calories, double price) {
    this.name = name;
    this.calories = calories;
    this.price = price;
  }

/*
* Accessor method:
* Returns the product's name.
  */
 public String getName() {
    return name;
  }

/*
* Accessor method:
* Returns the product's price.
 */
   public double getPrice() {
    return price;
  }

/*
* Mutator method:
* Returns the product's calorie count.
*/
  public int getCalories(){
    return calories;
  }

/*
* Mutator method:
* Updates the product's price. 
 */
 public void setName(String newName){
    name=newName;
  }

/* 
*Mutator method:
* Updates the product's name.
*/
   public void setPrice(double newPrice){
    price=newPrice;
  }

/* 
* Muator method: 
* Updates the product's calorie count.
  */
  public void setCalories(int newCalories){
    calories=newCalories;
  }

/*
* toString()method:
* Returns a formatted string containing product information.
  */
  public String toString() {
    return "Product: " + name + "\nNumber of calories: " + calories + "\nPrice: $" + price;
  }
}