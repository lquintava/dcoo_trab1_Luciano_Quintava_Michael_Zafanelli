package edu.faqi.dcoo.trab1.ex02;

import static org.junit.Assert.*;

import org.junit.Test;



public class MeioComuncacaoTest {

	@Test
	public void testTv() {
		// 1 - Atribuo valores
		TV tv = new TV();
		
	
		// 2 - Aciono metodos
		tv.trocaNome("LG");
		tv.trocaCanal(12);
		int canalAtual = tv.getCanal();
		String nomeTv = tv.getNome();
		ControleRemoto controle = new ControleRemoto(tv);
			
		// 3 - Avalio resultado
		assertTrue("Informaçoes erradas", controle.info().equals("Canal - " + canalAtual + "Nome - " + nomeTv));
		
		
	}
	
	@Test (expected = TvInfomaErradoException.class)
	public void testTvInformaErrado(){
		
		TV tv = new TV();
		
		
		// 2 - Aciono metodos
		tv.trocaNome("LG");
		tv.trocaCanal(12);
		int canalAtual = tv.getCanal();
		String nomeTv = tv.getNome();
		ControleRemoto controle = new ControleRemoto(tv);
			
		// 3 - Avalio resultado
		assertTrue("Informaçoes erradas", controle.info().equals("Canal - " + 1 + "Nome - " + nomeTv));
		
	}
	
	@Test
	public void testRadio() {
		// 1 - Atribuo valores
		Radio radio = new Radio();
	
		// 2 - Aciono metodos
		radio.trocaNome("Panasonic");
		radio.trocaEstacao(93.7);
		radio.trocaBanda("FM");
		ControleRemoto controle = new ControleRemoto(radio);
		
		String nomeRadio = radio.getNome();
		double estacaoAtual = radio.getEstacao();
		String bandaAtual = radio.getBanda();
			
		// 3 - Avalio resultado
		assertTrue("Informaçoes erradas", controle.info().equals("Nome - " + nomeRadio  +"Estação - "+estacaoAtual + "Banda - " + bandaAtual));
		
	}
	
	@Test(expected = RadioInfomaErradoException.class)
	public void testRadioInformaErrado(){
		
		//AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA
		// 1 - Atribuo valores
				Radio radio = new Radio();
			
				// 2 - Aciono metodos
				radio.trocaNome("Panasonic");
				radio.trocaEstacao(93.7);
				radio.trocaBanda("FM");
				ControleRemoto controle = new ControleRemoto(radio);
				
				String nomeRadio = radio.getNome();
				double estacaoAtual = radio.getEstacao();
				String bandaAtual = radio.getBanda();
					
				// 3 - Avalio resultado
				assertTrue("Informaçoes erradas", controle.info().equals("Nome - " + "aaa"  +"Estação - "+estacaoAtual + "Banda - " + bandaAtual));
		
	}
	
	

}
