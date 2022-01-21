public class Student {

    private Osoba osoba = new Osoba();
    private Enum.WydzialEnum wydzial;

    public Student(Osoba osoba, Enum.WydzialEnum wydzial) {
        this.osoba = osoba;
        this.wydzial = wydzial;
    }

    public Osoba getOsoba() {
        return osoba;
    }

    public void setOsoba(Osoba osoba) {
        this.osoba = osoba;
    }

    @Override
    public String toString() {
        return "Student{" +
                "student " + osoba +
                ", wydzial " + wydzial +
                '}';
    }
}
