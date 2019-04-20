package br.unifacisa.p3.deque.encadeado;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author Andrews
 *
 */
public class NodePessoaTest {
	/*
	 * Testes de inserir pela frente.
	 */
	@Test
	public void insertFrontTest0() {
		Node pessoa = new Node();
		pessoa.insertFront("Andrews");
		
		// Testando o primeiro e o último //
		assertEquals("Andrews", pessoa.getFirst());
		assertEquals("Andrews", pessoa.getLast());
	}
	
	
	@Test
	public void insertFrontTest1() {
		Node pessoa = new Node();
		pessoa.insertFront("Andrews");
		pessoa.insertFront("Yahweh");
		pessoa.insertFront("Yeshua");
		
		assertEquals("Yeshua", pessoa.getFirst());
	}
	
	
	
	@Test
	public void insertFrontTest2() {
		Node pessoa = new Node();
		pessoa.insertFront("Andrews");
		pessoa.insertFront(null);
		
		assertEquals(null, pessoa.getFirst());
	}
	
	
	
	@Test (expected = NullPointerException.class)
	public void insertFrontTest3() {
		Node pessoa = new Node();		
		
		assertEquals(null, pessoa.getFirst());
	}
	
	
	
	@Test
	public void insertFrontTest4() {
		Node pessoa = new Node();
		pessoa.insertFront("Andrews");
		pessoa.insertFront("Yahweh");
		pessoa.insertFront("Yeshua");
		
		// Testando o primeiro e o último //
		assertEquals("Yeshua", pessoa.getFirst());
		assertEquals("Andrews", pessoa.getLast());
	}
	
	
	/*
	 * Testes de inserir por trás.
	 */
	
	@Test
	public void insertLastTest1() {
		Node pessoa = new Node();
		pessoa.insertLast(null);
		
		// Testando o primeiro e o último //
		assertEquals(null, pessoa.getFirst());
		assertEquals(null, pessoa.getLast());
	}
	
	
	@Test
	public void insertLastTest2() {
		Node pessoa = new Node();
		pessoa.insertLast("Andrews");
		
		// Testando o primeiro e o último //
		assertEquals("Andrews", pessoa.getFirst());
		assertEquals("Andrews", pessoa.getLast());
	}
	
	
	@Test
	public void insertLastTest3() {
		Node pessoa = new Node();
		pessoa.insertLast("Andrews");
		pessoa.insertLast("Yeshua");
		
		// Testando o primeiro e o último //
		assertEquals("Andrews", pessoa.getFirst());
		assertEquals("Yeshua", pessoa.getLast());
	}
	
	
	
	@Test
	public void insertFrontLastTest1() {
		Node pessoa = new Node();
		pessoa.insertLast("Andrews");
		// Inserindo front e last //
		pessoa.insertFront("Yeshua");
		pessoa.insertLast("Yahweh");
		// Testando o primeiro e o último //
		
		assertEquals("Yeshua", pessoa.getFirst());
		assertEquals("Yahweh", pessoa.getLast());
	}
	
	
	
	@Test
	public void removeFrontTest1() {
		Node pessoa = new Node();
		pessoa.insertFront("Andrews");
		pessoa.insertFront("Yeshua");
		pessoa.insertFront("Yahweh");
		
		pessoa.removeFront();
		
		assertEquals("Yeshua", pessoa.getFirst());
		assertEquals("Andrews", pessoa.getLast());
	}
	
	
	@Test
	public void removeFrontTest2() {
		Node pessoa = new Node();
		pessoa.insertFront("Andrews");
		pessoa.insertFront("Yeshua");
		pessoa.insertFront("Yahweh");
		pessoa.insertLast("Matusalem");
		
		pessoa.removeFront();
		pessoa.removeFront();
		
		assertEquals("Andrews", pessoa.getFirst());
		assertEquals("Matusalem", pessoa.getLast());
	}
	
	
	@Test
	public void removeLastTest2() {
		Node pessoa = new Node();
		pessoa.insertFront("Andrews");
		pessoa.insertFront("Yeshua");
		pessoa.insertFront("Yahweh");
		
		pessoa.removeLast();
		
		assertEquals("Yahweh", pessoa.getFirst());
		assertEquals("Yeshua", pessoa.getLast());
	}
	
	
	@Test
	public void removeLastTest3() {
		Node pessoa = new Node();
		pessoa.insertFront("Andrews");
		pessoa.insertFront("Yeshua");
		pessoa.insertFront("Yahweh");
		pessoa.insertLast("Matusalem");
		
		pessoa.removeLast();
		pessoa.removeLast();

		
		assertEquals("Yahweh", pessoa.getFirst());
		assertEquals("Yeshua", pessoa.getLast());
	}
	
	
	@Test
	public void getSizeTest1() {
		Node pessoa = new Node();
		pessoa.insertFront("Andrews");
		pessoa.insertFront("Yeshua");
		pessoa.insertLast("Yahweh");
		pessoa.insertLast("Matusalem");
		

		assertEquals(4, pessoa.getSize());
	}
	
	
	@Test
	public void getSizeTest2() {
		Node pessoa = new Node();
		
		assertEquals(0, pessoa.getSize());
	}
	
	@Test
	public void getSizeTest3() {
		Node pessoa = new Node();
		pessoa.insertFront("Andrews");
		pessoa.insertFront("Yeshua");
		pessoa.insertLast("Yahweh");
		
		pessoa.removeLast();
		
		assertEquals(2, pessoa.getSize());
	}
	
	
	
	

}
