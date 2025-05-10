package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.ambienti.Stanza;

public class ComandoVai implements Comando{

	
	/**
	 * Cerca di andare in una direzione. Se c'e' una stanza ci entra 
	 * e ne stampa il nome, altrimenti stampa un messaggio di errore
	 */
	private String direzione;

	public ComandoVai() {
	}

	/**
	 * esecuzione del comando
	 */
	@Override
	public void esegui(Partita partita) {
		
		// qui il codice per cambiare stanza ...
		Stanza stanzaCorrente = partita.getLabirinto().getStanzaCorrente();
		Stanza prossimaStanza = null;
		
		if(this.direzione==null) {
			System.out.println("Dove vuoi andare? Devi specificare una direzione!");
			return;
		}
		
		prossimaStanza = stanzaCorrente.getStanzaAdiacente(this.direzione);
		if (prossimaStanza == null) {
			System.out.println("Direzione inesistente");
			return;
		}
		else {
			partita.getLabirinto().setStanzaCorrente(prossimaStanza);
			int cfu = partita.getGiocatore().getCfu();
			partita.getGiocatore().setCfu(--cfu);
		}
		System.out.println("\n"+partita.getLabirinto().getStanzaCorrente().getDescrizione());
	}
	
	@Override
	public void setParametro(String parametro) {
		this.direzione = parametro;
	}
	
	@Override
	public String getNome() {
		return "vai";
	}
	
	@Override
	public String getParametro() {
		return this.direzione;
	}
}
