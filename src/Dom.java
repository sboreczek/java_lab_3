public class Dom extends Budynek {

    protected int iloscPokoi;
    protected int metraz;
    protected String balkon;

    public Dom(){
        super();
        this.iloscPokoi = 0;
        this.metraz = 0;
        this.balkon = "";
    }

    public Dom(int iloscPokoi,int metraz, String balkon){
        this.iloscPokoi = iloscPokoi;
        this.metraz = metraz;
        this.balkon = balkon;
    }


    public Dom(String typ, int cena,int iloscPokoi, int metraz, String balkon){
        super(typ, cena);
        this.iloscPokoi = iloscPokoi;
        this.metraz = metraz;
        this.balkon = balkon;
    }

    public int getIloscPokoi() {
        return iloscPokoi;
    }

    public void setIloscPokoi(int iloscPokoi) {
        this.iloscPokoi = iloscPokoi;
    }

    public int getMetraz() {
        return metraz;
    }

    public void setMetraz(int metraz) {
        this.metraz = metraz;
    }

    public String getBalkon() {
        return balkon;
    }

    public void setBalkon(String balkon) {
        this.balkon = balkon;
    }

    protected int Wyliczenie() {
        return this.cena + (metraz * 5112);
    }

    @Override
    public String toString() {
        return this.typ +
                ", Ilosc pokoi: " + this.iloscPokoi + ", Cena: " +this.Wyliczenie();
    }
}
