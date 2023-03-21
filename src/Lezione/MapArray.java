package Lezione;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapArray {
    //vuole degli object, i primitivi non funzionano

    public static void main(String[] args) {

        Map<String, String> ma = new HashMap<>(); //non iterabile
        Set<String> keys = ma.keySet(); //posso iterare le chiavi

        ma.put("chiave1", "ciao");
        ma.put("chiave2", "commento");
        ma.put("chiave2", "risposta"); //sovrascrivo chiave2

        if (!ma.containsKey("chiave2")) {
            ma.put("chiave2", "nartracosa");  //se non esiste gia la chiave2 scrivo
        }

        for (String ele : keys) {
            //azioni di iterazioni
        }

    }

}
