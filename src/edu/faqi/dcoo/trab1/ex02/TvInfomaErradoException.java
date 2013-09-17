package edu.faqi.dcoo.trab1.ex02;

public class TvInfomaErradoException extends TvException {
	
public TvInfomaErradoException( int canal, String nomeTv){
		
		super(String.format("informacoes erradas o nome e %s a o canal e %d", nomeTv, canal));
	}

}
