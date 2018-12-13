package LengvesniUzd;

import java.util.Scanner;

public class Pamoka {
	

		public static void main(String[] args) {
			System.out.println("iveskite diena");
			Scanner scanner = new Scanner(System.in);
			int pir = scanner.nextInt();
			int ant= scanner.nextInt();
			int tre =scanner.nextInt();
			int ket = scanner.nextInt();
			int pen = scanner.nextInt();
			int pamokuLaikas = 45;
			
			int sum = pir+ant+tre+ket+pen;
			System.out.println(sum);
			int result = sum*pamokuLaikas;
			System.out.println(result);
		}
	}


