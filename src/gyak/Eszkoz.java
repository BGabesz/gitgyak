package gyak;

import java.util.Objects;

public class Eszkoz {
    String nev;
    int suly;

    public Eszkoz(String nev, Integer suly) {
        this.nev = nev;
        this.suly = suly;
    }

    public String getNev() {
        return nev;
    }

    public int getSuly() {
        return suly;
    }

    @Override
    public String toString() {
        return "Eszkoz{" + "nev=" + nev + ", suly=" + suly + '}';
    }
    
}
