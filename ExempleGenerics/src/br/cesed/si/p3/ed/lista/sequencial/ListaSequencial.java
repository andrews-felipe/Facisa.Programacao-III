package br.cesed.si.p3.ed.lista.sequencial;

public class ListaSequencial 	<T> {

	private static final int ALOCACAO = 3;
	
	private T[]arrayInterno = (T[]) new Object[ALOCACAO];
	
	private int inseridos = 0;
	
	public void inserir(T objeto) {
		

	if(inseridos == arrayInterno.length) {
			
			T[] arrayNovo = (T[]) new Object[arrayInterno.length * 2];
			
			for (int i = 0; i < arrayInterno.length; i++) {
				arrayNovo[i] = arrayInterno[i];
			}
			
			arrayInterno = arrayNovo;
		}
		
		arrayInterno[inseridos] = objeto;
		inseridos++;
	}

	public int tamanho() {
		return inseridos;
	}
	
	public void excluir(T objeto) throws InvalidObjectException {
		
		int posicaoObjeto = obterPosicao(objeto);
		
		if(posicaoObjeto == -1)
			throw new InvalidObjectException();
		
		excluirPorPosicao(posicaoObjeto);
	}
	
	public void excluirPorPosicao(int posicaoObjeto) throws InvalidObjectException {

		if(posicaoObjeto == -1)
			throw new InvalidObjectException();

		for(int i = posicaoObjeto; i < inseridos - 1; i++) {
			arrayInterno[i] = arrayInterno[i+1]; 
		}
		
		arrayInterno[inseridos - 1] = null;
		inseridos--;
	}
	
	public int obterPosicao(T objeto) {
		
		int posicao = -1;
		
		for (int i = 0; i < arrayInterno.length; i++) {
			if(arrayInterno[i] != null && arrayInterno[i].equals(objeto)) {
				posicao = i;
				break;
			}
		}
		
		return posicao;
		
	}
	
	public void inserir(int posicao) {
		
	}
	
	public Object obter(int posicao) {
		
		return posicao;
	}
	
	public boolean isEmpty(int posicao) {
		
		return false;
	}
}
