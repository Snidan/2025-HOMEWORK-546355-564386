package it.uniroma3.diadia.ambienti;

public class StanzaBuia extends Stanza{

	private String attrezzoMagico;
	
	public StanzaBuia(String nome) {
		super(nome);
		this.attrezzoMagico = nome;
	}
	
	@Override
	public String getDescrizione() {
		if(hasAttrezzo(this.attrezzoMagico)) {
			return super.toString();
		}
		return "Qui c'è buio pesto";
	}

}
