package br.cesed.si.p3.ed.lista.sequencial;

import org.junit.Assert;
import org.junit.Test;

public class ListaSequencialTest {

	@Test
	public void tamanho1() {
			ListaSequencial ls = new ListaSequencial();
			Assert.assertEquals(0, ls.tamanho());
	}

	@Test
	public void inserir1() {	
			ListaSequencial<Double> ls = new ListaSequencial<>();
			ls.inserir(0.0);
			ls.inserir(1.0);
			Assert.assertEquals(1, ls.tamanho());
	}

	@Test
	public void inserir2() {	
			ListaSequencial <Long>ls = new ListaSequencial<>();
			ls.inserir(20000000000000000L);
			Assert.assertEquals(1, ls.tamanho());
	}

	@Test
	public void inserir3() {	
			ListaSequencial <String>ls = new ListaSequencial<>();
			ls.inserir("humberto não fique nervoso não");
			Assert.assertEquals(1, ls.tamanho());
	}

	@Test
	public void excluir1() throws InvalidObjectException {	
			ListaSequencial<Double> ls = new ListaSequencial<>();
			ls.inserir(0.0);
			ls.inserir(1.0);
			ls.excluir(0.0);
			
			Assert.assertEquals(1, ls.tamanho());
	}

	@Test
	public void excluir2() throws InvalidObjectException {	
			ListaSequencial ls = new ListaSequencial();
			ls.inserir(new Conta(1,1));
			ls.inserir(new Conta(2,2));
			Conta c = new Conta(3,3);
			ls.inserir(c);
			ls.inserir(new Conta(4,4));
			ls.excluir(c);
			
			Assert.assertEquals(3, ls.tamanho());
	}
	
	@Test
	public void excluir3() throws InvalidObjectException {	
			ListaSequencial ls = new ListaSequencial();
			Conta c = new Conta(1,1);
			ls.inserir(c);
			ls.inserir(new Conta(2,2));
			ls.inserir(new Conta(3,3));			
			ls.inserir(new Conta(4,4));
			ls.excluir(c);
			
			Assert.assertEquals(3, ls.tamanho());
	}

	@Test(expected=InvalidObjectException.class)
	public void excluir4() throws InvalidObjectException {	
			ListaSequencial ls = new ListaSequencial();
			Conta c = new Conta(1,1);
			ls.inserir(c);
			ls.inserir(new Conta(2,2));
			ls.inserir(new Conta(3,3));			
			ls.inserir(new Conta(4,4));
			ls.excluir(new Conta(5,5));
			
			Assert.assertEquals(3, ls.tamanho());
	}
	
}
