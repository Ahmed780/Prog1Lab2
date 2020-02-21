import java.util.Scanner;
public class Feet {

  public static void main (String [] args) {   
  Scanner input = new Scanner (System.in);

  System.out.println ("Enter distance in m: ");
  
  double distance = input.nextDouble();
  double meters = distance*3.280;
  
  System.out.println (distance + " m is " + meters + " feet ");

    }
}