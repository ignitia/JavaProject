package LengvesniUzd;

import java.util.Scanner;

public class Gimtadienis {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Kiek sausainiu iskepe Tautvydas: ");
        int cookies= scanner.nextInt();
        System.out.println("Kiek draugu atsnese sausainiu: ");
        int friends= scanner.nextInt();
        int sum =( cookies*friends)+cookies;
        System.out.println("Kiek is viso dalyvavo zmoniu: ");
        int people= scanner.nextInt();
        int cookieForPerson=sum/people;
        System.out.println("Sventes dalyviai gavo po: " + cookieForPerson);
        System.out.println("Tautvydui lieka: " + sum%people);  

	}
}
