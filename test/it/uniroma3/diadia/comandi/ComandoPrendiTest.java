package it.uniroma3.diadia.comandi;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.attrezzi.Attrezzo;

class ComandoPrendiTest {
	Partita partita;
	ComandoPrendi prendi;

	@BeforeEach
	void setUp() throws Exception {
		this.partita = new Partita();
		this.prendi = new ComandoPrendi();
	}

	@Test
	void testAttrezzoNonPresente() {
	    prendi.setParametro("osso");
	    prendi.esegui(this.partita);
	 assertNull(this.partita.getLabirinto().getStanzaCorrente().getAttrezzo("osso"));
	 assertNotNull(this.partita.getGiocatore().getBorsa().getAttrezzo("osso"));
	}


	@Test
	void testUnAttrezzoPreso() {
		Attrezzo a = new Attrezzo("anello", 1);
		this.partita.getLabirinto().getStanzaCorrente().addAttrezzo(a);
		this.prendi.setParametro("anello");
		this.prendi.esegui(this.partita);
	
		assertNull(this.partita.getLabirinto().getStanzaCorrente().getAttrezzo(a.getNome()));
		assertNotNull(this.partita.getGiocatore().getBorsa().getAttrezzo("anello"));
	}

}
