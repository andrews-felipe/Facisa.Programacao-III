package br.cesed.si.p3.ed.deck;

public class Deck <T>{
	
	
	private static final int TAMANHO = 4;
	private T[]arrayInterno = (T[]) new Object[TAMANHO];
	private int inseridos = 0;
	
	
	private void arrayOverflow(){
		
		T[] arrayNovo = (T[]) new Object[arrayInterno.length * 2];
		for (int i = 0; i < arrayInterno.length; i++) {
			arrayNovo[i] = arrayInterno[i];
		}
		arrayInterno = arrayNovo;
	}
	
	
	
	
	public void inserirInicio(T objeto){
		if(inseridos == arrayInterno.length){
			arrayOverflow();
		}
		
		if(arrayInterno[0] != null){
			for (int i = 0; i < inseridos; i++) {
				arrayInterno[i+1] = arrayInterno[i]; 
			}
			arrayInterno[0] = null;
			
		}
		
		arrayInterno[0] = objeto;
		inseridos++;
	}
	
	
	
	public void inserirFim(T objeto){
		if(inseridos == arrayInterno.length){
			arrayOverflow();
		}
		
		arrayInterno[inseridos] = objeto;
		inseridos++;
		
	}
	
	public void removerInicio(){
		for (int i = 0; i < inseridos; i++) {
			arrayInterno[i] = arrayInterno[i+1];
		}
		
	}
	
	public void removerFinal(){
		arrayInterno[inseridos] = null;	
		
	}
	
	public Object first(){
		return arrayInterno[0];
	}
	
	public Object last(){
		
		return arrayInterno[inseridos];
	}
	
	public int size(){
		return inseridos;
	}




}
	
	
	
		
	
