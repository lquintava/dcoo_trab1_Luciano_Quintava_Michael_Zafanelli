package edu.faqi.dcoo.gc.ex04;

public class Tenis {
	
	private Pessoa jogador1;
	private Pessoa jogador2;
	private Pessoa jogador3;
	private Pessoa jogador4;
	private int pontuacao1;
	private int pontuacao2;
	
	
	public Tenis(Pessoa jogador1, Pessoa jogador2) {
	this.jogador1 = jogador1;
	this.jogador2 = jogador2;
	
	this.pontuacao1 = 0;
	this.pontuacao2 = 0;
		
		
	}
	
	public Tenis(Pessoa jogador1, Pessoa jogador2, Pessoa jogador3, Pessoa jogador4) {
		
		this(jogador1, jogador2);
		this.jogador1 = jogador3;
		this.jogador2 = jogador4;
					
			
		}

}
