package it.uniroma3.diadia.ambienti;

public class StanzaBloccata extends Stanza{

	private String direzioneBloccata;
	private String passepartout;


	public StanzaBloccata(String nome) {
		super(nome);
		this.passepartout = nome;
	}

	@Override
	public Stanza getStanzaAdiacente(String direzione) {
		if(direzione.equals(this.direzioneBloccata) && !hasAttrezzo(this.passepartout)) {
				return (Stanza) this;
			}
			else {
				return super.getStanzaAdiacente(direzione);
			}
	}

	@Override
	public String getDescrizione() {
		if(hasAttrezzo(this.passepartout)) {
			return super.getDescrizione();
		}
		else
			return "Questa direzione è bloccata! Per sbloccarla devi posare l'attrezzo "+ this.passepartout + " nella stanza. Vai a cercarlo, fannullone!";
	}

}
