package edu.faqi.dcoo.trab1.ex02;

public class RadioException extends RuntimeException {
	
	public RadioException(){
		super("Aconteceu alguma coisa");
	}
	
	public RadioException(String msg){
		super(msg);
	}
	
	public RadioException(String msg, Throwable t){
		super(msg,t);
	}

}
