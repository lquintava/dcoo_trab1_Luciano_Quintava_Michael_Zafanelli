package edu.faqi.dcoo.trab1.ex02;

public class ControleRemoto {
	MeioComunicacao meioCom;
	
	
	public ControleRemoto(MeioComunicacao meio){
	
		meioCom = meio;			
		
	}
	
	
	public String info(){
		
		return meioCom.imprime();
	}
}
