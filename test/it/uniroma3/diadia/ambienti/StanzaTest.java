package it.uniroma3.diadia.ambienti;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.attrezzi.Attrezzo;

class StanzaTest {
	Stanza ingresso;
	Stanza salotto;

	@BeforeEach
	public void setUp() throws Exception {
		this.ingresso= new Stanza("ingresso");
		this.salotto= new Stanza("salotto");
	}

	@Test
	public void testImpostaStanzaAdiacente() {
		this.ingresso.impostaStanzaAdiacente("nord", salotto);
		assertEquals(this.salotto, this.ingresso.getStanzaAdiacente("nord"));
	}
	
	@Test
	public void testNessunaStanzaAdiacente() {
		assertNull(this.salotto.getStanzaAdiacente("nord"));
	}
	
	@Test
	public void testAggiungiTreAttrezzi() {
		Attrezzo osso = new Attrezzo("osso", 1);
		Attrezzo cappello = new Attrezzo("cappello", 5);
		Attrezzo biberon = new Attrezzo("biberon", 2);
		
		this.salotto.addAttrezzo(biberon);
		this.salotto.addAttrezzo(cappello);
		this.salotto.addAttrezzo(osso);
		
		assertEquals(biberon, this.salotto.getAttrezzo("biberon"));
		assertEquals(osso, this.salotto.getAttrezzo("osso"));
		assertEquals(cappello, this.salotto.getAttrezzo("cappello"));
	}

	@Test
	public void testRimuoviUnAttrezzo() {
		Attrezzo biberon = new Attrezzo("biberon", 2);
		
		this.salotto.addAttrezzo(biberon);
		assertEquals(biberon, this.salotto.getAttrezzo("biberon"));
		
		this.salotto.removeAttrezzo(biberon);
		assertNull(this.salotto.getAttrezzo("biberon"));
	}
	
	@Test
	public void testStanzaVuota() {
		assertNull(this.salotto.getAttrezzo("osso"));
	}
	
}
