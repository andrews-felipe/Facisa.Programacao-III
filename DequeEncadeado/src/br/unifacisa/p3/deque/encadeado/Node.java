package br.unifacisa.p3.deque.encadeado;

/**
 * @author Andrews
 *
 */
public class Node{
	
	private NodePessoa first;
	private int inserts = 0;
	
	/**
	 * Inicio do nó é nulo.
	 */
	public Node(){
		first = null;
	}
	
	/**
	 * Insere uma nova pessoa no início.
	 * @param object
	 */
	public void insertFront(String object){
		/* 
		 * Se não houver um objeto, cria-se um primeiro.
		 */
		if(first == null){
			first = new NodePessoa(object);
		}
		/* 
		 * Se houver.Guarda o primeiro, cria um novo, o novo torna-se o primeiro
		 * e também, aponta o proximo do novo para o que guardou(primeiro antigo).
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
		 * Se não houver um objeto, cria-se um primeiro.
		 */
		if(first == null){
			first = new NodePessoa(object);
		}
		/*
		 * Se houver.Guarda o primeiro elemento para não perdê-lo, percorre 
		 * os objetos até o último, quando achar ele será apontado para o último atual.
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
	 * Fornece a primeira pessoa do Nó.
	 * @return primeira pessoa
	 */
	public String getFirst(){
		return first.getPessoa();
	}
	
	/**
	 * Fornece a última pessoa do Nó.
	 * @return ultíma pessoa
	 */
	public String getLast(){
		/*
		 *  faz uma cópia do primeiro elemento(First to last), cria um laço 
		 *  para percorrer até o último. Enquanto não chegar a cópia recebe o próximo elemento. 
		 */
		
		NodePessoa last = first;
		while(last.next != null){
			last = last.next;
		}
		return last.getPessoa();
	}
	
	/**
	 * Fornece quantas pessoas foram inseridas no nó.
	 * @return quantidade de inseridos
	 */
	public int getSize(){
		return inserts;
	}

}
