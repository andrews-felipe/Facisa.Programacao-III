package br.unifacisa.p3.deque.encadeado;

/**
 * 
 * @author Andrews
 *  
*/
public class NodePessoa {
	
	private String nome;
	protected NodePessoa next;

	
	public NodePessoa(String nome){
		this.nome = nome;
		next = null;
	}
	
	public String getPessoa(){
		return nome;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public void setNext(NodePessoa next){
		this.next = next;
	}
	
	
	
}
