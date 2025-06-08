package it.uniroma3.diadia.comandi;

import java.util.Scanner;

import it.uniroma3.diadia.IO;

public class FabbricaDiComandiRiflessiva implements FabbricaDiComandi{

	private IO io; 
	
	public FabbricaDiComandiRiflessiva(IO io) {
	      this.io = io;
	   }
	
	public Comando costruisciComando(String istruzione) {
	    Scanner scannerDiParole = new Scanner(istruzione);
	    String nomeComando = null;
	    String parametro = null;
	    Comando comando = null;

	    if (scannerDiParole.hasNext())
	        nomeComando = scannerDiParole.next();
	    if (scannerDiParole.hasNext())
	        parametro = scannerDiParole.next();

	    StringBuilder nomeClasse = new StringBuilder("it.uniroma3.diadia.comandi.Comando");
	    nomeClasse.append(Character.toUpperCase(nomeComando.charAt(0)));
	    nomeClasse.append(nomeComando.substring(1));

	    try {
	        comando = (Comando) Class.forName(nomeClasse.toString()).getDeclaredConstructor().newInstance();
	    } catch (Exception e) {
	        comando = new ComandoNonValido();
	    }

	    comando.setParametro(parametro);
	    comando.setIo(this.io);
	    return comando;
	}

}
