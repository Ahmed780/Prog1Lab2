import java.util.Scanner;
public class Circlearea{

  public static void main(String args[]) {
	
	Scanner rad = new Scanner(System.in);
	System.out.println("\nType the radius: ");
     	double radius = rad.nextDouble();
      
    	double area = Math.PI * (radius * radius);
    	System.out.println("\nThe area of circle = " + area);
      
	double circum = Math.PI * 2*radius;
    	System.out.println( "\nThe circumference of circle = "+circum) ;

  }
  
}
