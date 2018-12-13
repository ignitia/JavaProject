package lt.bt;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Kontrolinis {
	public static void main(String[] args) throws  IOException{
		 String filePath = "C:\\Program Files (x86)\\Ampps\\www\\Vytautas Naudzius\\JavaProject\\res\\tekstai\\marsrutaiKontr.txt";
		File file = new File(filePath);
  	  Scanner scanner = new Scanner(file); 
		int filestops = scanner.nextInt();
      int[] array = new int[filestops];
      BufferedReader br = new BufferedReader(new FileReader(file));
      String st;
      int sum = 0;
	   for (int i = 0; i<array.length; i++) {
      	array[i]=scanner.nextInt();
      	
      	sum = sum+array[i];
       } 	
    
     System.out.println(sum);
    int bigStop =array[0];
			int smallStop = array[0];
 for (int i=0;i<array.length;i++) {
			
			//kazkas negerai;
			if(array[i]<smallStop){
				smallStop=array[i];
			
			}else if (array[i]>bigStop) {
				bigStop = array[i];
				}	
		System.out.println(" " + bigStop);	
	}
 
	
	}
}
