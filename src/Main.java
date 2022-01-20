import jdk.jshell.Snippet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {

        Punkt punktA = new Punkt(7);
        punktA.toString();
        punktA = new Punkt(1,2,3);
        punktA.toString();
        punktA.setpX(2);
        punktA.setpY(5);
        punktA.setpZ(7);

        System.out.printf("px = %d, py = %d, pz = %d\n", punktA.getpX(), punktA.getpY(), punktA.getpZ());
        }

    /* ćw 3 klasy */

        /*  zad.1 - Najpierw należy uzupełnić kod w klasie Punkt.java,
            a) stworzyć objekt punktA typu Punkt,
            w konstruktorze zainicjować zmienną pX --> np. new Punkt(7), wykonać metodę punktA.toString();
            b) następnie ponownie wywopać konstruktor inicjalizujący wszystkie pola z klasy
            --> np. punkt = new Punkt(1, 2, 3);, wykonać metodę punktA.toString();
            c) nadpisać wartości pól z objektu punktA za pomocą setterów i
            ponownie wywołać metodę toString();
            d) wypisać wartości pól (za pomocą getterów),
            e) wywołać metody suma i róznica (obie wersje) z klasy punkt
        */
}
