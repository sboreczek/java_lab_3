import jdk.jshell.Snippet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {




    public static void main(String[] args) {

        List<Budynek> listaBudynkow = new ArrayList<>();
        Budynek b1 = new Budynek("Blok", 5300000);
        Budynek b2 = new Dom("Dom jednorodzinny", 1000000, 4, 80,"brak");
        Budynek b3 = new Dom("Dom jednorodzinny", 400000, 2, 60,"brak");
        Budynek b4 = new Pokoj("Blok",200000,3,50,"tak", 3000);
        Budynek b5 = new Pokoj("Blok",1200000,6,200,"tak",20000);
        listaBudynkow.add(b1);
        listaBudynkow.add(b2);
        listaBudynkow.add(b3);
        listaBudynkow.add(b4);
        listaBudynkow.add(b5);
        for (Budynek b : listaBudynkow) {
            System.out.println(b);
        }
    }
}




/* ćw 5 Dziedziczenie */

        /* zad.1 Proszę wybrać dowolny temat budowania struktur klas np. samochody, dom, biblioteka, nauka, zabawki, kosmetyki, biuro podróży ... .
                 Będziemy budować podobną strukturę kodu jak w przykładzie 5,
            a) Proszę stworzyć układ klas dziedziczących po sobie,
            b) proszę użyć pól i metod protected jak i private,
            c) proszę stworzyć konstruktory, metody: toString(), settery i gettery,
            d) proszę używać super do wywołania konstruktorów i metod z klas nadrzędnych
            (można wygenerować je --> prawy przycisk myszki --> generate --> settery, gettery, ...),
            e) w klasie Main proszę stworzyć objekty podobnie jak w przykładzie 5,
            oraz stworzyć listę typu najbardziej generycznego np. List<Budynek>
         */