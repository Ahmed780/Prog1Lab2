import java.util.Scanner;
 public class Time {
 
	public static void main(String[] args) {
		
		int seconds;
		int mins;
		int secs;
		
        Scanner sec = new Scanner(System.in);
        System.out.println("Type time in sec");
		seconds = sec.nextInt(); 
        	
		mins = seconds / 60;
        secs = seconds % 60;
		
		System.out.println(+ mins + ":" + secs);
		
    }    
}