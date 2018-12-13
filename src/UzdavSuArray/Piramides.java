package UzdavSuArray;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Piramides {
	public static void main(String[] args) throws IOException {
		String filePath = "C:\\Program Files (x86)\\Ampps\\www\\Vytautas Naudzius\\JavaProject\\res\\tekstai\\Piramides.txt";
		File file = new File (filePath);
		Scanner scanner = new Scanner (file);
		int number = scanner.nextInt();
		int[] array = new int[number];
		//System.out.println(number);
		int sum = 0;
		for (int i =0; i<number; i++) {
		array[i]=i+1;
			
			sum = sum + array[i];
			String text = String.valueOf(sum);// pakeiciam i stringa inta
			System.out.println(text);
			//String text=sum;
			 WriteFile(text);
		}
	}
	
	private static void  WriteFile( String text) throws IOException {
		String fileName = "C:\\Program Files (x86)\\Ampps\\www\\Vytautas Naudzius\\JavaProject\\res\\tekstai\\rezultataiPiramid.txt";
		//int count = sum;
		FileWriter fw = new FileWriter(fileName, true);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(text);
		bw.newLine();
		System.out.println("Done");
		bw.close();
	    fw.close();
	}
}
