package exercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class programLeituraCSV {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o caminho: ");
		String path = sc.nextLine();
		File file = new File(path);
		
		try (BufferedReader br = new BufferedReader(new FileReader(path)))  {
			String newPath = file.getParent() + "\\out";
			boolean sucesso = new File(newPath).mkdir();
			if(sucesso) System.out.println("Arquivo criado com Sucesso");
			String nameFile = "\\summary.csv";
			
			String line = br.readLine();
			

			while(line != null) {
				String[] words = line.split(",");
				escreverArquivo(words, newPath+nameFile);
				line = br.readLine();
			}
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("\nFim do programa");
		sc.close();
	}
	
	public static void escreverArquivo(String[] line, String path) {
		String produto = line[0];
		Double preco = Double.parseDouble(line[1]);
		Integer quantidade = Integer.parseInt(line[2]);
		
		Double total = preco * quantidade;
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			bw.write(produto + ",");
			bw.write(String.format("%.2f", total));
			bw.newLine();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
