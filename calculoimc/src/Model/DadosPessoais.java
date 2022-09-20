package Model;

public class DadosPessoais {
	private String nome;
	private String sobrenome;
	private double peso;
	private double altura;
	
	public DadosPessoais(String nome, String sobrenome, double peso, double altura) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.peso = peso;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
}