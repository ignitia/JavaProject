package LengvesniUzd;

import java.util.Scanner;

public class Parasiutai {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		  System.out.println("is kokio aukscio: ");
	       double h= scanner.nextDouble();
	        System.out.println("per kiek sekundziu issiskleidzia ");
	       double  t=  scanner.nextDouble();
	       double time = Math.sqrt(2*h/9.8);
	       System.out.println(Math.round(time));
	       if (t<time) {
	    	   System.out.println("isssiskleis ");
	       }
	        
	       else {
	    	   System.out.println("neissiskleis");
	       }
	}

}
