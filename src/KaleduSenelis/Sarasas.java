package KaleduSenelis;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Sarasas {

	public static void main(String[] args) throws IOException {
		String filePath = "C:\\Program Files (x86)\\Ampps\\www\\Vytautas Naudzius\\JavaProject\\res\\tekstai\\ElfuSandelis.txt";
		File file = new File(filePath); 
		BufferedReader br = new BufferedReader(new FileReader(file));
		System.out.println(file);
		
		String fileName = "C:\\Program Files (x86)\\Ampps\\www\\Vytautas Naudzius\\JavaProject\\res\\tekstai\\VaikuNorai.txt";
		File file1 = new File(fileName);
		BufferedReader br1 = new BufferedReader(new FileReader(file1));
		System.out.println(file1);
		
		String fileWish = "C:\\Program Files (x86)\\Ampps\\www\\Vytautas Naudzius\\JavaProject\\res\\tekstai\\VaikuCharakteristika.txt"; 
		File file2 = new File(fileWish);
		BufferedReader br2 = new BufferedReader(new FileReader(file2));
		System.out.println(file2);

	}

}
