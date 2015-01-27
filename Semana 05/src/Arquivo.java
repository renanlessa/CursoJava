import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.Scanner;


public class Arquivo {
	public static void main(String[] args) throws IOException {
//		//Ler dados de um arquivo
		
		
		//InputStream le bytes
		InputStream is = new FileInputStream("leitura.txt");
		//Reader le caracteres
		InputStreamReader isr = new InputStreamReader(is);
		//Faz a leitura da linha toda não só caractere por caracter como faz o reader acima
		BufferedReader br = new BufferedReader(isr);
		/*
		String linha = br.readLine();
		while(linha != null){
			System.out.println(linha);
			linha = br.readLine();
		}
		
		br.close();
		
		System.out.println("----");
		
		Scanner scan = new Scanner(new FileInputStream("leitura.txt"));
		while(scan.hasNextLine()) {
			System.out.println(scan.nextLine());
		}
		scan.close();
		*/
		
		/*
		OutputStream os = new FileOutputStream("saida.txt");
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);
		
		String linha = br.readLine();		
		while(linha != null) {
			bw.append(linha);
			bw.newLine();
			//System.out.println(linha);
			linha = br.readLine();
		}
		br.close();
		bw.close();
		*/
			
		/*
		Scanner scan = new Scanner(new FileInputStream("leitura.txt"));
		PrintStream ps = new PrintStream("saida.txt");
		
		while(scan.hasNextLine()) {
			ps.println(scan.nextLine());
		}
		
		ps.close();
		scan.close();
		*/
		
	}
}