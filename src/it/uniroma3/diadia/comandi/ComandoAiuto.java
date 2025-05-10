package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.Partita;

public class ComandoAiuto implements Comando{

	static final private String[] elencoComandi = {"vai", "prendi", "posa", "guarda", "aiuto", "fine"};
	
	
	public ComandoAiuto() {
		
	}
	
	@Override
	public void esegui(Partita partita) {
		// TODO Auto-generated method stub
		for(int i=0; i< elencoComandi.length; i++) 
			System.out.println(elencoComandi[i]+" ");
System.out.println("");
	}

	@Override
	public void setParametro(String parametro) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public String getNome() {
		return "aiuto";
	}
	
	@Override
	public String getParametro() {
		return "aiuto";
	}
	
	

}
