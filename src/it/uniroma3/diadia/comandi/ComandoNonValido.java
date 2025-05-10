package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.Partita;

public class ComandoNonValido implements Comando{

static final private String[] elencoComandi = {"vai", "prendi", "posa", "guarda", "aiuto", "fine"};
	
	public ComandoNonValido() {
	}

	@Override
	public void esegui(Partita partita) {
		// TODO Auto-generated method stub
		System.out.print("Comando non valido!");
	}

	@Override
	public void setParametro(String parametro) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String getNome() {
		return "";
	}
	
	@Override
	public String getParametro() {
		return "";
	}

}
