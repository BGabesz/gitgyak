package gyak;
public class Harcos extends Karakter{
    int ugyesseg,ero;

    
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
    public int compareTo(Eszkoz o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
