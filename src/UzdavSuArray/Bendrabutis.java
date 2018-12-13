package UzdavSuArray;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

	public class Bendrabutis {

		public static void main(String[] args) throws IOException  {
			
			Info();
			
			}
		public static void Info() throws IOException {	
			String filePath = "C:\\Program Files (x86)\\Ampps\\www\\Vytautas Naudzius\\JavaProject\\res\\tekstai\\Bendrabutis.txt";
			File file = new File(filePath);
			// System.out.println(filePath);
			Scanner scanner = new Scanner(file);

			int numberOfApp = scanner.nextInt();

			double electricPr = scanner.nextDouble();
			// System.out.println(electricPr);

			double[] array = new double[numberOfApp];

			double electr = electricPr;

			int k = 0;
			double total =0;
			double total1 =0;
			
			for (int i = 0; i < numberOfApp; i++) {
				array[i] = scanner.nextInt();
				k++;

				double sum = array[i] * electr;
				total+= sum;
				total1+=sum/5;
				String text = k + ". " + sum + "Lt" + ".";
				
				System.out.println(text);
				
				 WriteToFile (text);
			}
			String text1 = "Iš viso sunaudota: uz "+ total+"Lt";
			String text2 = "Vieno kambario gyventojai mokės: "+total1+"Lt";
			 WriteToFile (text1);
			 WriteToFile (text2);
			
			System.out.println(text1);
			System.out.println(text2);
		}
		
	 public static  void WriteToFile (String text) throws IOException{
		 //System.out.println("labas ");
		 String fileName = "C:\\Program Files (x86)\\Ampps\\www\\Vytautas Naudzius\\JavaProject\\res\\tekstai\\rezultataiBen.txt";
		 //String homeNum = k + ". " + sum + "Lt" + ".";
		 //String allTot = "Iš viso sunaudota: uz "+ total+"Lt";
		 //String ForOnR = "Vieno kambario gyventojai mokės: "+total1+"Lt";
		 FileWriter fw = new FileWriter(fileName, true);
		 BufferedWriter bw = new BufferedWriter(fw);
		 bw.write(text);
		 bw.newLine();
		 //bw.write(allTot);
		 //bw.newLine();
		 //bw.write(ForOnR);
		 bw.close();
	     fw.close();
		// System.out.println("done");
	 }

	}


