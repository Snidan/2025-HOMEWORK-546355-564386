package it.uniroma3.diadia;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class IOSimulatorTest {

    @Test
    public void testPartitaConComandiValidi() {

    	String[] comandi = {"vai nord", "prendi chiave", "usa chiave", "fine"};
        
        IOSimulator io = new IOSimulator(comandi, 100);
        
        DiaDia gioco = new DiaDia(io);
        
        gioco.gioca();
        String[] messaggi = io.getMessaggiProdotti();
        boolean trovatoMessaggio = false;
        for (String msg : messaggi) {
            if (msg != null && msg.contains("Hai vinto!") || msg.contains("Partita terminata")) {
                trovatoMessaggio = true;
                break;
            }
        }

        assertTrue(trovatoMessaggio, "Il messaggio di fine partita non è stato trovato.");
    }
}
