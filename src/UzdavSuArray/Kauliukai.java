package UzdavSuArray;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Kauliukai {

	public static void main(String[] args) throws IOException {
		String filePath = "C:\\Program Files (x86)\\Ampps\\www\\Vytautas Naudzius\\JavaProject\\res\\tekstai\\Kauliukai.txt";
		File file = new File(filePath);
		Scanner scanner = new Scanner(file);
		int diceNumber = scanner.nextInt();
		int[] array = new int [diceNumber];
		int[] pipCount = {0,0,0,0,0,0};
		int i = 0;
		array[i]= scanner.nextInt();
		switch(array[i]) {
		case 1:
		    pipCount[0]++;
		    break;
		case 2:
		   pipCount[1]++;
		   break;
		case 3:
			pipCount[2]++;
		    break;
		case 4:
			pipCount[3]++;
		    break;
		case 5:
			pipCount[4]++;
		    break;
		case 6:
			pipCount[5]++;
		    break;
        default: 
            System.out.println("Tokio pasirinkimo nera");
            break; 
			
	}
		System.out.println("Skaicius " + pipCount[i] +"");
	}
		
		
}

		


