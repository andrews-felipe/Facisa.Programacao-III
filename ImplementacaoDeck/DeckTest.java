package br.cesed.si.p3.ed.deck;


import org.junit.Assert;
import org.junit.Test;


public class DeckTest {

	@Test
	public void inserirInicioTest() {	
		Deck<String> deck = new Deck<>();
		deck.inserirInicio("a");
		deck.inserirInicio("a");
		Assert.assertEquals(2, deck.size());
	}
	
	@Test
	public void inserirInicioFim() {	
		Deck<String> deck = new Deck<>();
		deck.inserirInicio("b");
		deck.inserirInicio("b");
		Assert.assertEquals(2, deck.size());
	}
	
	@Test
	public void removeFim() {	
		Deck<String> deck = new Deck<>();
		deck.inserirFim("a");
		deck.removerFinal();
		Assert.assertEquals(null, deck.last());
	}
	
	@Test
	public void removeInicio() {	
		Deck<String> deck = new Deck<>();
		deck.inserirInicio("a");
		deck.removerInicio();
		Assert.assertEquals(null, deck.first());
	}
	
	
	

}
