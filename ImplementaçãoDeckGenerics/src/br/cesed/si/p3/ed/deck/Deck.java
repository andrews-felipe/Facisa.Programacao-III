package br.cesed.si.p3.ed.deck;

public class Deck <T>{
	
	private int arraySize;
	private T[]arrayInterno = (T[]) new Object[arraySize];
	private int inseridos = 0;
	
	
	
	/**Recebe o tamanho do array interno
	 * @param tamanho
	 */
	public void arraySize(T tamanho){
		arraySize = (int)tamanho;
	}
	
	
	
	
	/**Insere um objeto no inicio do Array  
	 * @param objeto
	 * @throws DequeFullException Lança uma exceção caso o array estoure.
	 */
	public void inserirInicio(T objeto) throws DequeFullException{
		if(inseridos == arrayInterno.length){
			throw new DequeFullException();
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
	
	
	
	
	/**Insere um objeto no fim do array
	 * @param objeto
	 * @throws DequeFullException Lança uma Exceção
	 */
	public void inserirFim(T objeto) throws DequeFullException{
		if(inseridos == arrayInterno.length){
			 throw new DequeFullException();
		}
		
		arrayInterno[inseridos] = objeto;
		inseridos++;
		
	}
	
	/**
	 * Remove o primeiro objeto do array.
	 */
	public void removerInicio(){
		for (int i = 0; i < inseridos; i++) {
			arrayInterno[i] = arrayInterno[i+1];
		}
		
	}
	
	/**
	 * Remove o último objeto do array.
	 */
	public void removerFinal(){
		arrayInterno[inseridos] = null;	
		
	}
	
	/**
	 * @return primeiro elemento do array
	 */
	public Object first(){
		return arrayInterno[0];
	}
	
	/**
	 * @return último elemento do array.
	 */
	public Object last(){
		
		return arrayInterno[inseridos];
	}
	
	/**
	 * @return Retorna a quantidade de objetos inseridos.
	 */
	public int size(){
		return inseridos;
	}




}
	
	
	
		
	
