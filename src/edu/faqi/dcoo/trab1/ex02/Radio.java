package edu.faqi.dcoo.trab1.ex02;

public class Radio extends MeioComunicacao {
	
	private String nome;
	private double estacao;
	private String banda;


	public String getNome() {
		return nome;
	}

	public double getEstacao() {
		return estacao;
	}

	public String getBanda() {
		return banda;
	}

	public void trocaEstacao(double estacao) {
		this.estacao = estacao;
	};

	public void trocaNome(String nome) {
		this.nome = nome;
	};

	public void trocaBanda(String banda) {
		this.banda = banda;
	};

	@Override
	public String imprime() {
		return "Nome - " + this.nome  +"Esta��o - "+this.estacao + "Banda - " + this.banda;
	}
	
	//oookmmc
	// teste
	// teste1
}
