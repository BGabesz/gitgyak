package gyak;

import java.util.ArrayList;

public abstract class Karakter implements Comparable<Karakter>{
    String nev,faj;
    ArrayList<Eszkoz> eszkozok;

    public Karakter(String nev, String faj, ArrayList<Eszkoz> eszkozok) {
        this.nev = nev;
        this.faj = faj;
        this.eszkozok = eszkozok;
    }

   
    
    
}
