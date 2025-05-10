package it.uniroma3.diadia.comandi;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.attrezzi.Attrezzo;

class ComandoPosaTest {

	ComandoPosa posa;
	Partita partita;

	@BeforeEach
	void setUp() throws Exception {
		this.posa = new ComandoPosa();
		this.partita = new Partita();
	}

	@Test
	void testAttrezzoNonPresente() {
	    posa.setParametro("lanterna");
	    posa.esegui(this.partita);

	    // Verifica che l'attrezzo non sia nella stanza corrente (non è stato posato)
	 assertNull(this.partita.getLabirinto().getStanzaCorrente().getAttrezzo("lanterna"));
	}


	@Test
	void testUnAttrezzoPosato() {
		Attrezzo a = new Attrezzo("osso", 1);
		this.partita.getGiocatore().getBorsa().addAttrezzo(a);
		this.posa.setParametro("osso");
		this.posa.esegui(this.partita);
	
		assertNotNull(this.partita.getLabirinto().getStanzaCorrente().getAttrezzo("osso"));
	}


}
