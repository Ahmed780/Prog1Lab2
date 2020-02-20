import java.util.Scanner;
public class Bmifinale {

    public static void main(String[] args) {
      
        double weight;
        double height;
        double bmi;
        double meters;
        double kg;

        Scanner wg= new Scanner(System.in);
        System.out.println("Type your weight in pounds");
        weight = wg.nextDouble();
        Scanner h=new Scanner(System.in);
        System.out.println("Type your height in feet");
        height = h.nextDouble();
        

       meters=0.3048*height;
       kg=0.453592*weight;
       
       bmi= Math.round(kg/(meters*meters));
       System.out.println("your BMI is "+bmi);
    }
}