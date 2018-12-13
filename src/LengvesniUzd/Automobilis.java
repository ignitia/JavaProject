package LengvesniUzd;

import java.util.Scanner;

public class Automobilis {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("koks automobilio greitis?");
		int speed = scanner.nextInt();
		double road = 0.264;
		double time =speed*road;
		System.out.println(time);
	}
}
