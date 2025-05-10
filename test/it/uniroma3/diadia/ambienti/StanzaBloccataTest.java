package it.uniroma3.diadia.ambienti;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.attrezzi.Attrezzo;

class StanzaBloccataTest {

	StanzaBloccata bloccata;
	Partita partita;
	
	@BeforeEach
	void setUp() throws Exception {
		this.bloccata = new StanzaBloccata("polvere fatata");
		this.partita = new Partita();
	}

	@Test
	void testStanzaBloccataAttrezzoMancante() {
		assertNotEquals(this.bloccata.toString(), this.bloccata.getDescrizione());
		assertNotEquals(this.bloccata.getStanzaAdiacente("est"), this.partita.getLabirinto().getStanzaCorrente().getStanzaAdiacente("est"));
	}
	
	@Test
	void testStanzaBloccataAttrezzoPresente() {
		Attrezzo a = new Attrezzo("polvere fatata", 5);
		this.bloccata.addAttrezzo(a);
		this.bloccata.impostaStanzaAdiacente("est", this.partita.getLabirinto().getStanzaCorrente().getStanzaAdiacente("est"));
		assertEquals(this.bloccata.toString(), this.bloccata.getDescrizione());
		assertEquals(this.bloccata.getStanzaAdiacente("est"), this.partita.getLabirinto().getStanzaCorrente().getStanzaAdiacente("est"));
	}	
	
}
