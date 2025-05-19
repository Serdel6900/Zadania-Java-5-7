package Zadanie2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Figura figura = new Figura("red") {
            @Override
            String opis() {
                return "Obiekt klasy figura";
            }

            @Override
            void skaluj(float skala) {

            }
        };


        Kwadrat kwadrat = new Kwadrat(5, "niebieski");
        Prostokat prostokat = new Prostokat(3, 4, "czerwony");
        Trojkat trojkat = new Trojkat(3, 5, "biały");
        Punkt punkt = new Punkt(1, 1);


        System.out.println("--- Opisy figur ---");
        System.out.println(figura.opis());
        System.out.println(kwadrat.opis());
        System.out.println(prostokat.opis());
        System.out.println("Współrzędna x punktu: " + punkt.x);


        System.out.println("\n--- Tablica figur ---");
        Figura[] tablicaFigur = new Figura[10];
        Arrays.fill(tablicaFigur, figura);
        for (Figura f : tablicaFigur) {
            System.out.println(f.opis());
        }


        System.out.println("\n--- Lista figur (IFigury) ---");
        List<IFigury> listaFigur = new ArrayList<>();
        listaFigur.add(kwadrat);
        listaFigur.add(prostokat);
        listaFigur.add(trojkat);

        for (IFigury f : listaFigur) {
            System.out.println("Powierzchnia: " + f.getPowierzchnia());
            System.out.println("Czy zawiera punkt (0,0): " + f.wPolu(new Punkt(0, 0)));
        }


        System.out.println("\n--- Okrąg ---");
        Okrag okrag = new Okrag(10);
        System.out.println(okrag.opis());
        okrag.przesun(3, 5);
        System.out.println("Nowe współrzędne środka: x=" + okrag.punkt.x + ", y=" + okrag.punkt.y);
    }
}