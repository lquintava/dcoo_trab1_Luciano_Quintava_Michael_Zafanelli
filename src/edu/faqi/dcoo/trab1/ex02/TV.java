package edu.faqi.dcoo.trab1.ex02;

public class TV extends MeioComunicacao {

	private String nome;
	private int canal;

	
	
		
	public String getNome() {
		return nome;
	}
	public int getCanal() {
		return canal;
	}
	public void trocaCanal(int canal){
		this.canal = canal;
	}
	public void trocaNome(String nome){
		this.nome = nome;
	}
	
	@Override
	public String imprime() {
	    return  "Canal - " + this.canal + "Nome - " + this.nome;
	}
	

}
