package gyak;

import java.io.Serializable;
import java.util.Iterator;

public class Harcos extends Karakter implements Comparable<Harcos>, Serializable, Iterable<Eszkoz> {
    int ugyesseg,ero;

    public static EroComparator RendezEro() {
        return new EroComparator();
    }

    public static UgyessegComparator RendezUgy() {
        return new UgyessegComparator();
    }
    
    public Harcos(String nev, int ero, int ugyesseg) {
        this(nev, "ember", ero, ugyesseg);
    }
    public Harcos(String nev, String faj, int ero, int ugyesseg) {
        super(nev, faj);
        this.ero = ero;
        this.ugyesseg = ugyesseg;
    }
    @Override
    public String toString() {
        return  super.toString() + 
                "\n\tero=" + ero + 
                "\n\tugyesseg=" + ugyesseg + 
                "\n}";
    }
    @Override
    public int compareTo(Harcos o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterator<Eszkoz> iterator() {
        return super.getEszkozok().iterator();
    }
    
}
