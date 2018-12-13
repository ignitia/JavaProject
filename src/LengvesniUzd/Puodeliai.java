package LengvesniUzd;

import java.util.Scanner;

public class Puodeliai {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Puodeliu skaicius");
		int cup = scanner.nextInt();
		int box = cup/3;
		System.out.println("kiek pilnu dezuciu " + box );
		int lastcup = cup%3;
		System.out.println("kiek liko puodeliu nesupakuota "+lastcup);
				
		

	}
}
