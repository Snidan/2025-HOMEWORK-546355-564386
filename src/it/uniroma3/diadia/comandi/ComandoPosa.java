package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.attrezzi.Attrezzo;

public class ComandoPosa implements Comando{

	String attrezzoPosato;
	
	public ComandoPosa() {}
	
	
	@Override
	public void esegui(Partita partita) {
		// TODO Auto-generated method stub
		Attrezzo a = partita.getGiocatore().getBorsa().getAttrezzo(attrezzoPosato);
		if(a!=null) {
			partita.getLabirinto().getStanzaCorrente().addAttrezzo(a);
			partita.getGiocatore().getBorsa().removeAttrezzo(attrezzoPosato);
			System.out.println("\nHai preso l'attrezzo "+ a.getNome());
		}
		else {
			System.out.println("\nQuest'attrezzo non è nella borsa!");
		}
	}

	@Override
	public void setParametro(String attrezzo) {
		this.attrezzoPosato = attrezzo;
	}
	
	@Override
	public String getNome() {
		return "posa";
	}
	
	@Override
	public String getParametro() {
		return this.attrezzoPosato;
	}

}
