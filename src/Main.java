import jdk.jshell.Snippet;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {




    public static void main(String[] args) {

        Student student1 = new Student(new Osoba("Marcin","Kowalski",33),Enum.WydzialEnum.WYDZIAL_INFORMATYKI);
        Student student2 = new Student(new Osoba("Andrzej","Jaroslawski",33),Enum.WydzialEnum.WYDZIAL_ARTYSTYCZNY);
        Student student3 = new Student(new Osoba("Szymon","Andrzejewski",33),Enum.WydzialEnum.WYDZIAL_MATEMATYKI);
        Student student4 = new Student(new Osoba("Olgierd","Malinski",33),Enum.WydzialEnum.WYDZIAL_POLONISTYKI);
        Student student5 = new Student(new Osoba("Pawel","Malinski",33),Enum.WydzialEnum.WYDZIAL_FIZYKI);
        ArrayList<Student> aL = new ArrayList<>();
        aL.add(student1);
        aL.add(student2);
        aL.add(student3);
        aL.add(student4);
        aL.add(student5);

        for(Student s : aL){
            System.out.println(s + "\n");
        }
    }
}

/* ćw 4 klasy */

        /* zad.1
            a) Stworzyć klasę Osoba z polami prywatnymi:
            - imie (String),
            - nazwisko (String),
            - indeks (Integer)
            b) stworzyc konstruktory, gettery i settery
            c) napisać metodę w klasie Osoba która zwróci informację o osobie,
         */

        /* zad.2
            a) Stworzyć klasę Student z polami prywatnymi
            - Osoba osoba,
            - WydzialEnum wydzial;
            b) stworzyć enum WydzialEnum (w nowym pliku) z kilkoma polami,
            c) stworzyc konstruktory, gettery i settery
            d) nadpisać metodę toString aby zwracała wszystkie elementy ładnie przedstawione :)
         */

        /* zad.3
            a) W klasie Main stworzyć 5 różnych studentów, (można za pomocą tego samego objektu)
            b) dodać studentów do Listy ArrayList,
            c) przeiterować listę za pomocą pętli forEach wywołując na każdym objekcie metodę toString() (w każdej iteracji);
         */