public class Osoba {

    private String imie,nazwisko;
    private int indeks;

    Osoba(){
    }

    Osoba(String imie, String nazwisko, int indeks){

        this.imie = imie;
        this.nazwisko = nazwisko;
        this.indeks = indeks;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public int getIndeks() {
        return indeks;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public void setIndeks(int indeks) {
        this.indeks = indeks;
    }

    @Override
    public String toString() {
        return imie + " " + nazwisko+ " " + indeks;
    }
}
