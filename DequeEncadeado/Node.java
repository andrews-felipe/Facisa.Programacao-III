package br.unifacisa.p3.deque.encadeado;

/**
 * @author Andrews
 *
 */
public class Node{
	
	private NodePessoa first;
	private int inserts = 0;
	
	/**
	 * Inicio do n� � nulo.
	 */
	public Node(){
		first = null;
	}
	
	/**
	 * Insere uma nova pessoa no in�cio.
	 * @param object
	 */
	public void insertFront(String object){
		/* 
		 * Se n�o houver um objeto, cria-se um primeiro.
		 */
		if(first == null){
			first = new NodePessoa(object);
		}
		/* 
		 * Se houver.Guarda o primeiro, cria um novo, o novo torna-se o primeiro
		 * e tamb�m, aponta o proximo do novo para o que guardou(primeiro antigo).
		 */
		else{
			NodePessoa guardado = first;
			NodePessoa newPessoa = new NodePessoa(object);
			first = newPessoa;
			newPessoa.next = guardado;
		}
		inserts++;
	}
	public void removeFront(){
		first = first.next;
		inserts--;
		
	}
	
	
	/**
	 * Insere uma nova pessoa no fim.
	 * @param object
	 */
	public void insertLast(String object){
		/* 
		 * Se n�o houver um objeto, cria-se um primeiro.
		 */
		if(first == null){
			first = new NodePessoa(object);
		}
		/*
		 * Se houver.Guarda o primeiro elemento para n�o perd�-lo, percorre 
		 * os objetos at� o �ltimo, quando achar ele ser� apontado para o �ltimo atual.
		 */ 
		else{
			NodePessoa guardado = first; 
			for(int i = 0; i < inserts ; i++){
				if(first.next == null){
					first.next = new NodePessoa(object);
				}else{
					first = first.next;
				}
			}
			first = guardado;
		}
		inserts++;
	}
	
	public void removeLast(){
		
		NodePessoa guardado = first;
		for(int i = 0 ; i < inserts-1 ; i++){
			if(first.next.next == null){
				first.next = null;
			}
			else {
				first = first.next;
			}
		}
		first = guardado;
		inserts--;
	}
	
	/**
	 * Fornece a primeira pessoa do N�.
	 * @return primeira pessoa
	 */
	public String getFirst(){
		return first.getPessoa();
	}
	
	/**
	 * Fornece a �ltima pessoa do N�.
	 * @return ult�ma pessoa
	 */
	public String getLast(){
		/*
		 *  faz uma c�pia do primeiro elemento(First to last), cria um la�o 
		 *  para percorrer at� o �ltimo. Enquanto n�o chegar a c�pia recebe o pr�ximo elemento. 
		 */
		
		NodePessoa last = first;
		while(last.next != null){
			last = last.next;
		}
		return last.getPessoa();
	}
	
	/**
	 * Fornece quantas pessoas foram inseridas no n�.
	 * @return quantidade de inseridos
	 */
	public int getSize(){
		return inserts;
	}

}
