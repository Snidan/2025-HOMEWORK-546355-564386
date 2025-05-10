package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.Partita;

public class ComandoGuarda implements Comando{

	public ComandoGuarda() {}
	
	
	@Override
	public void esegui(Partita partita) {
		// TODO Auto-generated method stub
		System.out.println("\n"+partita.getLabirinto().getStanzaCorrente().getDescrizione()+"\n"+partita.getGiocatore().getBorsa().toString());
	}

	@Override
	public void setParametro(String parametro) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String getNome() {
		return "guarda";
	}
	
	@Override
	public String getParametro() {
		return "guarda";
	}

}
