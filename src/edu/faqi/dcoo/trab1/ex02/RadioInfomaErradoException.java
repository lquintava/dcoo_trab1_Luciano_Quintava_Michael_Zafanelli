package edu.faqi.dcoo.trab1.ex02;

public class RadioInfomaErradoException extends RadioException {
	
public RadioInfomaErradoException(String nomeRadio, String estacao, String  banda){
		
		super(String.format("informacoes erradas o nome e %s a estacao e %s e a banda e %s", nomeRadio, estacao, banda));
	}

}
