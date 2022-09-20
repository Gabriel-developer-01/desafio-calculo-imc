package Model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LerArquivoService {

	public static List<DadosPessoais> calcularIMC() {
		String path = "c:\\dados\\dados-imc.csv";
		
		List<DadosPessoais> list = new ArrayList<DadosPessoais>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			String line = br.readLine();
			line = br.readLine();
			while (line != null) {
				String linhaNova = line.replace(",", ".");
				String[] vect = linhaNova.split(";");
				
				String nome = vect[0].trim();
				String sobrenome = vect[1].trim();
				Double peso = Double.parseDouble(vect[2]);
				Double altura = Double.parseDouble(vect[3]);
				
				DadosPessoais dados = new DadosPessoais(nome, sobrenome, peso, altura);
				list.add(dados);
				
				line = br.readLine();
			}	
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		return list;
	}
}
