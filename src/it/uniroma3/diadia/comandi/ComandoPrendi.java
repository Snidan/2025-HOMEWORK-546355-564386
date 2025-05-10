package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.attrezzi.Attrezzo;

public class ComandoPrendi implements Comando{

	String attrezzoPreso;
	
	public ComandoPrendi() {}
	
	@Override
	public void esegui(Partita partita) {
		// TODO Auto-generated method stub
		Attrezzo a = partita.getLabirinto().getStanzaCorrente().getAttrezzo(attrezzoPreso);
		if(a!=null) {
			partita.getLabirinto().getStanzaCorrente().removeAttrezzo(a);
			partita.getGiocatore().getBorsa().addAttrezzo(a);
			System.out.println("\nHai preso l'attrezzo "+ a.getNome());
		}
		else {
			System.out.println("\nQuest'attrezzo non è nella stanza!");
		}
	}

	@Override
	public void setParametro(String parametro) {
		// TODO Auto-generated method stub
		this.attrezzoPreso=parametro;
	}

	@Override
	public String getNome() {
		return "prendi";
	}
	
	@Override
	public String getParametro() {
		return this.attrezzoPreso;
	}
}
