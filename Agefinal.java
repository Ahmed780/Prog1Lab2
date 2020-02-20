import java.util.Scanner;
public class Agefinal {

    public static void main(String[] args) {

   int currentyear = 2020;
   int yearofbirth;
   int age;

  Scanner year= new Scanner(System.in);

  System.out.println("\nEnter your year of birth");

  yearofbirth =year.nextInt();

  age = currentyear - yearofbirth;

  	System.out.println("\nYou are " + age);

    }

}
