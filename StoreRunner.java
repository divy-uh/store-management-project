import java.util.Scanner;

/* 
 * StoreRunner class:
 * This is the tester class for the TacoBell store
 * management system. It created and prints multiple
 * examples of TacoBell items and its subclasses.
 * Demonstrates inheritance, constructors, and toString() methods.
 */
public class StoreRunner {
  public static void main(String[] args) {

TacoBell a = new TacoBell();
    System.out.println(a);

TacoBell b= new TacoBell("Quesadilla", 450, 6.49);
    System.out.println(b);

Burrito c= new Burrito();
    System.out.println(c);

Burrito d= new Burrito("Burrito", 1200, 12.49, true, "Guac");
    System.out.println(d);

Water e= new Water();
    System.out.println(e);

Water f= new Water("Water", 0, 4.50, true, "Medium");
    System.out.println(f);

  }
}