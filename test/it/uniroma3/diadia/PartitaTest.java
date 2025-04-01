package it.uniroma3.diadia;


import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.Partita;

class PartitaTest {
	Partita partita;

	@BeforeEach
	public void setUp() throws Exception {
		this.partita = new Partita();
	}
	
	@Test
	public void testZeroCFU() {
		this.partita.getGiocatore().setCfu(0);
		assertTrue(this.partita.isFinita());
	}
	
	@Test
	public void testVinta() {
		this.partita.getLabirinto().setStanzaCorrente(this.partita.getLabirinto().getStanzaVincente());
		assertTrue(this.partita.vinta());
	}
	
	@Test
	public void testSetFinita() {
		this.partita.setFinita();
		assertTrue(this.partita.isFinita());
	}

}
