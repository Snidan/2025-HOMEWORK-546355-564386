package it.uniroma3.diadia.giocatore;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.attrezzi.Attrezzo;

class BorsaTest {
	Giocatore giocatore;

	@BeforeEach
	void setUp() throws Exception {
		this.giocatore = new Giocatore();
	}

	@Test
	void testAggiungiTreAttrezzi() {
		Attrezzo a1 = new Attrezzo("osso", 1);
		Attrezzo a2 = new Attrezzo("penna", 5);
		Attrezzo a3 = new Attrezzo("matita", 2);
		
		this.giocatore.getBorsa().addAttrezzo(a1);
		this.giocatore.getBorsa().addAttrezzo(a3);
		this.giocatore.getBorsa().addAttrezzo(a2);
		
		assertEquals(a1.getNome(), this.giocatore.getBorsa().getAttrezzo("osso").getNome());	
		assertEquals(a2.getNome(), this.giocatore.getBorsa().getAttrezzo("penna").getNome());	
		assertEquals(a3.getNome(), this.giocatore.getBorsa().getAttrezzo("matita").getNome());	
	}
	
	@Test
	public void testRimuoviUnAttrezzo() {
		Attrezzo tappo = new Attrezzo("tappo", 2);
		
		this.giocatore.getBorsa().addAttrezzo(tappo);
		assertEquals(tappo.getNome(), this.giocatore.getBorsa().getAttrezzo("tappo").getNome());
		
		this.giocatore.getBorsa().removeAttrezzo("tappo");
		assertNull(this.giocatore.getBorsa().getAttrezzo("tappo"));
	}

}
