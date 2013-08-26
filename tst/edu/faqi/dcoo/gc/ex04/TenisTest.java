package edu.faqi.dcoo.gc.ex04;

import static org.junit.Assert.*;

import org.junit.Test;

public class TenisTest {

	@Test
	public void testInstaciacaoManoAMano() {

		//1 - Atribuir valores
		
		Pessoa jog1 = new Pessoa();
		Pessoa jog2 = new Pessoa();
		
		//2 - Acionar metodos
		
		Tenis tenis = new Tenis(jog1, jog2);
		boolean dupla = tenis.isDuple();
		int pontosJoga1 = tenis.getPontuacao1();
		int pontosJoga2 = tenis.getPontuacao2();
		
		//3 - Avaliar resultados
		
		assertTrue("Deveria ser mano a mano", dupla == false);
		assertTrue("Jogador 1 deveria começar com Zero", pontosJoga1 == 0);
		assertTrue("Jogador 2 deveria começar com Zero", pontosJoga2 == 0);
	}
	
	public void testInstaciacaoDupla() {

		//1 - Atribuir valores
		
		Pessoa jog1 = new Pessoa("guga", 13);
		Pessoa jog2 = new Pessoa("joao", 14);
		Pessoa jog3 = new Pessoa("Pedro", 13);
		Pessoa jog4 = new Pessoa("Juca", 15);
		
		//2 - Acionar metodos
		
		Tenis tenis = new Tenis(jog1, jog2, jog3, jog4);
		boolean dupla = tenis.isDuple();
		int pontosJoga1 = tenis.getPontuacao1();
		int pontosJoga2 = tenis.getPontuacao2();
		
		//3 - Avaliar resultados
		
		assertTrue("Deveria ser Dupla", dupla == true);
		assertTrue("Jogador 1 deveria começar com Zero", pontosJoga1 == 0);
		assertTrue("Jogador 2 deveria começar com Zero", pontosJoga2 == 0);
	}

}
