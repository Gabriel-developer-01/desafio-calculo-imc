package View;

import java.text.DecimalFormat;
import java.util.List;

import Model.DadosPessoais;
import Model.GerarArquivoService;
import Model.LerArquivoService;

public class calculoImc {

	public static void main(String[] args) {
		
		List<DadosPessoais> list = LerArquivoService.calcularIMC();
			
		/*System.out.println("Resultados:");
		 //caso deseje imprimir o resultado no console do java.
			for (DadosPessoais d : list) {
				double imc = d.getPeso() / Math.pow(d.getAltura(), 2);
				System.out.println(d.getNome().toUpperCase() 
						+ " " + d.getSobrenome().toUpperCase() 
						+ " " 
						+ new DecimalFormat(".##").format(imc));
			}*/
			
			GerarArquivoService.gerarArquivoIMC(list);
		}
	}