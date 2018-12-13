package lt.bt;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;



public class Mainas {

	public static void main(String[] args)throws IOException {
		failas();
	}

	public static void failas() throws IOException {
		String filePath = "C:\\Program Files (x86)\\Ampps\\www\\Vytautas Naudzius\\JavaProject\\res\\tekstai\\padangos.txt";
		File file = new File(filePath);
		// 185 65 HR13 
		Scanner scanner = new Scanner(file);
		int heigth = scanner.nextInt(); //185
		int width = scanner.nextInt();//65
		String speed = scanner.next();//HR13
		
		
		Padangos padangos = new Padangos();
		padangos.setHeigth(heigth);
		padangos.setWidth(width);
		padangos.setSpeed(speed);
	//5
		int padanguIlgis = scanner.nextInt();
		
		Padangos[] padangos1 = new Padangos[padanguIlgis];
		for (int i=0; i<padanguIlgis; i++  ) {
			Padangos padangosSandelyje = new Padangos();
			heigth = scanner.nextInt(); //185
			width = scanner.nextInt();//65
			speed = scanner.next();//HR13
			padangosSandelyje.setHeigth(heigth);
			padangosSandelyje.setWidth(width);
			padangosSandelyje.setSpeed(speed);
			padangosSandelyje.setPrice(scanner.nextDouble());
			padangos1[i] = padangosSandelyje;
			//System.out.println(padangos1);
			System.out.println(padangosSandelyje);
		}
	
		//System.out.println(padangos1);
	}		

}
