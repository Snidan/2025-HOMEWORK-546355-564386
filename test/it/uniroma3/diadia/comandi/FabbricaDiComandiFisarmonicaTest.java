package it.uniroma3.diadia.comandi;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FabbricaDiComandiFisarmonicaTest {


	FabbricaDiComandiFisarmonica factory;
	
	@BeforeEach
	void setUp() throws Exception {
		factory = new FabbricaDiComandiFisarmonica();
	}

	@Test
	void testComandoVai() {
		Comando comando = factory.costruisciComando("vai sud");
		assertEquals("sud", comando.getParametro());
	}
	
	@Test
	void testComandoPrendi() {
		Comando comando = factory.costruisciComando("prendi osso");
		assertEquals("osso", comando.getParametro());
	}
	
	@Test
	void testComandoNonValido() {
		Comando comando = factory.costruisciComando("ippogrifo");
		assertTrue(comando instanceof ComandoNonValido);
	}

}
