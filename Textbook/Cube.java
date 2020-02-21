import java.util.*;
public class Cube {

	public static void main(String args[]){
		double num;
		
		Scanner no=new Scanner(System.in);		
		System.out.print("\nEnter a number: ");
		num=no.nextInt();

		System.out.println("\nCube of "+ num + " = "+ Math.pow(num, 3));
		
	}
}