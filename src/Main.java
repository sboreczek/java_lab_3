import jdk.jshell.Snippet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {

        List<Student> studentlist = new ArrayList<>();

        Student student = new Student();
        Student student1 = new Student();
        Student student2 = new Student();
        student.imie = "Andrzej";
        student.nazwisko = "Zygmuntowski";
        student.liczba = 24;

        student1.imie = "Tomasz";
        student1.nazwisko = "Karolak";
        student1.liczba = 43;
        student1.prawda = false;

        student2.imie = "Maciej";
        student2.nazwisko = "Kawulski";
        student2.liczba = 15;

        studentlist.add(student);
        studentlist.add(student1);
        studentlist.add(student2);
        for (Student s : studentlist){

            System.out.println(s.imie + "\n" + s.nazwisko + "\n" + s.liczba + "\n" + s.prawda + "\n" );

        }


        }
        /* ćw 2 klasy */
        /* zad.1
            a) Stworzyć publiczną klasę Student z 2-ma polami String, 1 polem int i 1 polem boolean,
            klasa ma się znajdować w osobnym pliku Student.java
            b) stworzyć 3 objekty klasy student i wstawić je do tablicy
            c) wyświetlić dane z tablicy, użyć pętli for lub forEach
            d) dane powinny być estetycznie przedstawione
         */

}
