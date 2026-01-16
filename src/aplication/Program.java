package aplication;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		File file = new File("C:\\Users\\leleg\\OneDrive\\Documents\\tpj.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally{
			System.out.print("Programa finalizado.");
		}
		sc.close();
	}
}
