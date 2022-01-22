public class Pokoj extends Dom {
    protected int ogrzewanie;


    public Pokoj(){
        super();
        this.ogrzewanie = 0;
    }

    public Pokoj(int ogrzewanie){
        this.ogrzewanie = ogrzewanie;
    }

    public Pokoj(String typ, int cena, int iloscPokoi, int metraz, String balkon){
        super(typ, cena, iloscPokoi, metraz, balkon);
    }

    public Pokoj(String typ, int cena, int iloscPokoi,int metraz,String balkon ,int ogrzewanie){
        super(typ, cena, iloscPokoi, metraz, "brak");
        this.ogrzewanie = ogrzewanie;
    }

    public int getOgrzewanie() {
        return ogrzewanie;
    }

    public void setOgrzewanie(int ogrzewanie) {
        this.ogrzewanie = ogrzewanie;
    }

    protected int Wyliczenie() {
        return this.cena + ogrzewanie;
    }

    @Override
    public String toString() {
        return this.typ +
                ", Ilosc pokoi: " + this.iloscPokoi + ", Cena: " + this.Wyliczenie() + ", Metraz: " + metraz + ", Czy posiada balkon: " + balkon + ", Oplata za samo ogrzewanie(w cenie mieszkania): " + ogrzewanie;
    }

}
