import java.util.Scanner;

public class Currencyfinal {

    public static void main(String[] args) {
		
        double currency;
        double currencyUSD;
        final double factor = 0.75;
		double currencyEUR;
        final double factor2 = 0.60;
		
		Scanner c = new Scanner(System.in);
		System.out.println("Enter an amount in CAD");
		currency = c.nextDouble();
      
  
		currencyUSD = factor * currency;
		currencyEUR = factor2 * currency;
			

	    System.out.println( + currency + " CAD is equal to " + currencyUSD + " USD.");
		System.out.println( + currency + " CAD is equal to " + currencyEUR + " EUR.");
		


    }

}
