package it.uniroma3.diadia.ambienti;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LabirintoTest {
	Labirinto lab;

	@BeforeEach
	void setUp() throws Exception {
		this.lab = new Labirinto();
		this.lab.creaStanze();
	}

	@Test
	void testAtrioStanzaCorrente() {
		assertEquals(this.lab.getStanzaCorrente().getNome(), "Atrio");
	}
	
	@Test
	public void testAtrioAdiacenzaEst() {
		assertEquals(this.lab.getStanzaCorrente().getStanzaAdiacente("est").getNome(), "Aula N11");
	}
	
	@Test
	public void testStanzaVincente() {
		assertEquals(this.lab.getStanzaVincente().getNome(), "Biblioteca");
	}

}
