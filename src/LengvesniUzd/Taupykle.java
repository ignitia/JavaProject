package LengvesniUzd;

import java.util.Scanner;

public class Taupykle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kiek yra monetu po 5 ct?");
		int a = scanner.nextInt();
		System.out.println("Kiek yra monetu po 20 ct?");
		int b = scanner.nextInt();
		System.out.println ("Kiek yra monetu po 2 lt?");
		int c = scanner.nextInt();
		double sum = (a*0.05)+(b*0.20)+(c*2);
		System.out.println(sum + " lt");
		
		

	}

}
