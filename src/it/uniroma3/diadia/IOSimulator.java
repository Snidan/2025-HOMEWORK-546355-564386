package it.uniroma3.diadia;

public class IOSimulator implements IO {

    private String[] righeLette;
    private int indiceRigheLette;
    private String[] messaggiProdotti;
    private int indiceMessaggiProdotti;
    private int indiceMessaggiMostrati;

    public IOSimulator(String[] righeDaLeggere, int maxMessaggi) {
        this.righeLette = righeDaLeggere;
        this.indiceRigheLette = 0;
        this.messaggiProdotti = new String[maxMessaggi];
        this.indiceMessaggiProdotti = 0;
        this.indiceMessaggiMostrati = 0;
    }

    @Override
    public String leggiRiga() {
        if (indiceRigheLette < righeLette.length) {
            String riga = righeLette[indiceRigheLette];
            indiceRigheLette++;
            return riga;
        }
        return null; // Nessuna riga da leggere
    }

    @Override
    public void mostraMessaggio(String msg) {
        if (indiceMessaggiProdotti < messaggiProdotti.length) {
            messaggiProdotti[indiceMessaggiProdotti] = msg;
            indiceMessaggiProdotti++;
        }
    }

    public String nextMessaggio() {
        if (hasNextMessaggio()) {
            return this.messaggiProdotti[indiceMessaggiMostrati++];
        }
        return null; // Nessun messaggio disponibile
    }

    public boolean hasNextMessaggio() {
        return this.indiceMessaggiMostrati < this.indiceMessaggiProdotti;
    }

    public String[] getMessaggiProdotti() {
        // Restituisce una copia dell'array dei messaggi per evitare modifiche esterne
        String[] copia = new String[indiceMessaggiProdotti];
        System.arraycopy(messaggiProdotti, 0, copia, 0, indiceMessaggiProdotti);
        return copia;
    }
}
