import java.util.*;
public class Name{

	public static void main(String[] args){

		Scanner in = new Scanner(System.in);
		System.out.println("Enter your full name(firstname, lastname)" );

		String firstFormat = in.nextLine();
		int indexComma = firstFormat.indexOf(',');

		String last = firstFormat.substring(0,indexComma);
		last = last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase(); 

		String first = firstFormat.substring(indexComma+2);
		first = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase(); 

		System.out.printf("\nFull name is %s %s",first,last);
 

 }

}