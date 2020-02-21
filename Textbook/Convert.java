import java.util.Scanner;
public class Convert {
  
   public static void main(String[] args) {
   
      int quarters;   
      int dimes;      
      int nickels;    
      double dollars; 
      
      Scanner coins = new Scanner( System.in );
	  
      System.out.print("\nEnter the number of quarters: ");
      quarters = coins.nextInt();
      coins.nextLine();
      
      System.out.print("\nEnter the number of dimes: ");
      dimes = coins.nextInt();
      coins.nextLine();
      
      System.out.print("\nEnter the number of nickels: ");
      nickels = coins.nextInt();
      coins.nextLine();
      
      dollars = (0.25 * quarters) + (0.10 * dimes)+ (0.05 * nickels);                               
      System.out.print("\nThe total in dollars is "+dollars+" $");
     
   
   }  
 
}  