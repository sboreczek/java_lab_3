public class Budynek {

    protected String typ;
    protected int cena;
    private int iloscPieter;


    public Budynek() {
        this.typ = "";
        this.iloscPieter = 0;
        this.cena = 0;
    }

    public Budynek(String typ,int cena) {
        this.typ = typ;
        this.iloscPieter = iloscPieter;
        this.cena = cena;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public int getIloscPieter() {
        return iloscPieter;
    }

    public void setIloscPieter(int iloscPieter) {
        this.iloscPieter = iloscPieter;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    protected int Wyliczenie() {
        return this.cena;
    }

    @Override
    public String toString() {
        return this.typ +
                ", Cena: " + this.Wyliczenie();
    }
}
