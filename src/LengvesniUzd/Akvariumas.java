package LengvesniUzd;

import java.util.Scanner;

public class Akvariumas {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("kiek zuvu gyvena akve");
		int gyvena = scanner.nextInt();
		System.out.println("kiek idedama kasdien zuvu");
		int idedama = scanner.nextInt();
		System.out.println ("po kiek dienu zuvu yra");
		int dienos = scanner.nextInt();
		
		
		int result = (idedama*dienos)+gyvena;
		System.out.println(result);
		System.out.println("Po " +  dienos + " dienu akvariume gyvens "  + result + " zuvu");
	}
}
