package LengvesniUzd;

import java.util.Scanner;

public class Statybininkas {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sienos ilgis");
		int a = scanner.nextInt();
		System.out.println("Sienos aukstis");
		int h = scanner.nextInt();
		System.out.println ("Plytos kaina?");
		double k = scanner.nextDouble();
		double sum = a*h;
		System.out.println(sum);
		double plytPl=0.2*0.1;
        double plyta=sum/plytPl;
        System.out.println("Plytu kiekis"+Math.round(plyta));
        double plytuKaina=plyta*k;
        System.out.println("Plytu kaina"+Math.round(plytuKaina));
        
		
	}
}
