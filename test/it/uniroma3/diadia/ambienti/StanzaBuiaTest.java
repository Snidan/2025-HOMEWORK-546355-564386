package it.uniroma3.diadia.ambienti;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.attrezzi.Attrezzo;

class StanzaBuiaTest {
	StanzaBuia buia;

	@BeforeEach
	void setUp() throws Exception {
		this.buia = new StanzaBuia("polvere fatata");
	}

	@Test
	void testStanzaBuiaAttrezzoPresente() {
		Attrezzo a = new Attrezzo("polvere fatata", 10);
		this.buia.addAttrezzo(a);
		assertEquals(this.buia.toString(), buia.getDescrizione());
	}
	
	@Test
	void testStanzaBuiaAttrezzoMancante() {
		assertNotEquals(buia.toString(), buia.getDescrizione());
	}

}
