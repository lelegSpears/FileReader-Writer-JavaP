package aplication;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ProgramFrBr {

	public static void main(String[] args) {
		String StPath = "C:\\Users\\leleg\\OneDrive\\Documents\\tpj.txt";
		System.out.println("Programa iniciado");
		
		try(BufferedReader br = new BufferedReader(new FileReader(StPath))){
			String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
		}
		catch(FileNotFoundException e) {
			System.out.print("Arquivo não encontrado");
		}
		catch(IOException e) {
			System.out.print("Problema no input");
		}
		finally {
			System.out.println("Programa Finalizado");
		}

	}

}
