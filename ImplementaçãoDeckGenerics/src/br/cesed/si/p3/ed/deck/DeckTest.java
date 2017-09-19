package br.cesed.si.p3.ed.deck;


import org.junit.Assert;
import org.junit.Test;


public class DeckTest {

	@Test (expected=DequeFullException.class) 
	public void inserirInicioTest() throws DequeFullException {	
		Deck<String> deck = new Deck<>();
		deck.inserirInicio("a");
		deck.inserirInicio("a");
		Assert.assertEquals(2, deck.size());
	}
	
	@Test (expected=DequeFullException.class) 
	public void inserirInicioFim() throws DequeFullException {	
		Deck<String> deck = new Deck<>();
		deck.inserirInicio("b");
		deck.inserirInicio("b");
		Assert.assertEquals(2, deck.size());
	}
	
	@Test (expected=DequeFullException.class) 
	public void removeFim() throws DequeFullException {	
		Deck<String> deck = new Deck<>();
		deck.inserirFim("a");
		deck.removerFinal();
		Assert.assertEquals(null, deck.last());
	}
	
	@Test (expected=DequeFullException.class) 
	public void removeInicio() throws DequeFullException {	
		Deck<String> deck = new Deck<>();
		deck.inserirInicio("a");
		deck.removerInicio();
		Assert.assertEquals(null, deck.first());
	}
	
	
	

}
