package Zadanie2;

public class Main {
    public static void main(String[] args) {
        Punkt punkt1 = new Punkt(5,2);
        Punkt punkt2 = new Punkt(12,5);
        Punkt punkt3 = new Punkt(25,512);

        punkt1.przesun(3,6);
        punkt2.opis();
        punkt3.zeruj();
        punkt3.opis();

        Prostokat prostokat = new Prostokat(4, 6);
        System.out.println(prostokat.opis());
        System.out.println("\nPole prostokąta: " + prostokat.getPowierzchnia());
        prostokat.przesun(3, 5);

        Trojkat trojkat = new Trojkat(5, 8);
        System.out.println(trojkat.opis());
        System.out.println("\nPole trójkąta: " + trojkat.getPowierzchnia());

        Okrag okrag = new Okrag(new Punkt(2, 2), 5);
        System.out.println(okrag.opis());
        System.out.println("\nPowierzchnia okręgu: " + okrag.getPowierzchnia());
        System.out.println("\nŚrednica okręgu: " + okrag.getSrednica());
        System.out.println("\nCzy punkt (3,3) jest w środku: " + okrag.wSrodku(new Punkt(3, 3)));

        Kwadrat kwadrat = new Kwadrat(4, "różowy");
        System.out.println(kwadrat.opis());
    }
}
