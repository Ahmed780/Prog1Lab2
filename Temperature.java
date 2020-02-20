import java.util.Scanner;
public class Temperature{

  public static void main(String[]args){
	  
  double temp1;
  double temp2;
  double temp3;
  double avg;

  Scanner tp= new Scanner(System.in);
  System.out.println("Type temperature for day 1 ");
  temp1=tp.nextDouble();
  Scanner tp2 = new Scanner(System.in);
  System.out.println("Type temperature for day 2 ");
  temp2=tp2.nextDouble();
  Scanner t3 = new Scanner(System.in);
  System.out.println("Type temperature for day 3 ");
  temp3=t3.nextDouble();

  avg=((temp1+temp2+temp3)/(3));
  
  System.out.println( "\nAvg temp is " + avg + " C.");

  }
  
}