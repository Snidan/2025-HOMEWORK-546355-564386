package it.uniroma3.diadia.comandi;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.IOConsole;
/*verifica il corretto riconoscimento dei comandi*/
public class FabbricaDiComandiFisarmonicaTest {
	
	Scanner scannerDiLinee;
	private IO io = new IOConsole(scannerDiLinee);
	private FabbricaDiComandiFisarmonica fc = new FabbricaDiComandiFisarmonica(io);
	private Comando expected;
	
	@Test
	public void testComandoNonValido() {
		expected = new ComandoNonValido();
		assertEquals(expected.getNome(), fc.costruisciComando("pluto").getNome());
	}
	
	@Test
	public void testComandoConParametro() {
		expected = new ComandoVai();
		expected.setParametro("sud");
		Comando current = fc.costruisciComando("vai sud");
		assertEquals(expected.getNome(), current.getNome());
		assertEquals(expected.getParametro(), current.getParametro());
	}

}
