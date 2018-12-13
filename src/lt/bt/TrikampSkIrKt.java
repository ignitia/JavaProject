package lt.bt;

import java.util.Scanner;

public class TrikampSkIrKt {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		System.out.println("Trikampis - 1");
		System.out.println("Staciakampis - 2");
		System.out.println("Skritulys - 3");
		System.out.println("Pasirinkite, kurios figuros plota norite skaiciuoti (nurodykite skaiciu):");
		int number = reader.nextInt();
		
		if (number == 1) {
			System.out.println("Nurodykite trikampio krastine:");
			int krastine = reader.nextInt();
			System.out.println("Nurodykite trikampio aukstine:");
			int aukstine = reader.nextInt();
			int trikampioPlotas = (krastine * aukstine) /2;
			System.out.println("Trikampio plotas: " + trikampioPlotas);
		} else if (number == 2) {
			System.out.println("Nurodykite staciakampio ilgi:");
			int ilgis = reader.nextInt();
			System.out.println("Nurodykite staciakampio ploti:");
			int plotis = reader.nextInt();
			int staciakampioPlotas = ilgis * plotis;
			System.out.println("StaciakampioPlotas: " + staciakampioPlotas);			
		} else if (number == 3) {
			System.out.println("Nurodykite skirtulio spinduli:");
			int spindulys = reader.nextInt();
			double skritulioPlotas = Math.pow(spindulys, 2)*Math.PI;
			System.out.println("StaciakampioPlotas: " + skritulioPlotas);				
		} else {
			System.out.println("Nurodytas neteisingas skaicius");
		}
		
		reader.close();
	}
}


 class Exercise2 {

    
  public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

            System.out.print("Input a: ");
            double a = input.nextDouble();
            System.out.print("Input b: ");
            double b = input.nextDouble();
            System.out.print("Input c: ");
            double c = input.nextDouble();

            double result = b * b - 4.0 * a * c;

            if (result > 0.0) {
                double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
                double r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
                System.out.println("The roots are " + r1 + " and " + r2);
            } else if (result == 0.0) {
                double r1 = -b / (2.0 * a);
                System.out.println("The root is " + r1);
            } else {
                System.out.println("The equation has no real roots.");
            }

    }
}
 class OddOrEven
 {
    public static void main(String args[])
    {
       int x;
       System.out.println("Enter an integer to check if it is odd or even");
       Scanner in = new Scanner(System.in);
       x = in.nextInt();
      
       if (x % 2 == 0)
          System.out.println("The number is even.");
       else
          System.out.println("The number is odd.");
    }
}
