package Model;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.List;

public class GerarArquivoService {

	public static void gerarArquivoIMC(List<DadosPessoais> list) {

		try {
			FileWriter arquivo = new FileWriter("c:\\dados\\GABRIEL MENDES DE SOUZA.csv");
		    PrintWriter gravarArq = new PrintWriter(arquivo);

		    gravarArq.printf("======================Resultado======================%n");
		    
		    for(DadosPessoais d : list) {
		    	double imc = d.getPeso() / Math.pow(d.getAltura(), 2);
		    	gravarArq.println(d.getNome().toUpperCase() 
		    			+ " " + d.getSobrenome().toUpperCase() 
		    			+ " " 
		    			+ new DecimalFormat(".##").format(imc));
		    }
		    gravarArq.printf("==========================================%n");
		    gravarArq.close();
		    
		    System.out.printf("Arquivo foi gerado com sucesso em c:\\dados\\GABRIEL MENDES DE SOUZA.csv");
		}catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}