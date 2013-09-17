package edu.faqi.dcoo.trab1.ex02;

public class TvException extends RuntimeException {

	public TvException(){
		super("Aconteceu alguma coisa");
	}
	
	public TvException(String msg){
		super(msg);
	}
	
	public TvException(String msg, Throwable t){
		super(msg,t);
	}
}
