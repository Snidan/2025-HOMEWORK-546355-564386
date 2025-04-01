package it.uniroma3.diadia.giocatore;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GiocatoreTest {

	Giocatore giocatore;
	
	@BeforeEach
	public void setUp() throws Exception {
		this.giocatore = new Giocatore();
	}

	@Test
	public void testGetCFU() {
		assertEquals(20, this.giocatore.getCfu());
	}

	@Test
	public void testGetBorsa() {
		Borsa borsa = new Borsa();
		assertNotNull(this.giocatore.getBorsa());
	}
}
