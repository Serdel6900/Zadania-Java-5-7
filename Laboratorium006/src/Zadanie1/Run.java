package Zadanie1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Run {
    Map<String, Pojazd> pojazdy;

    public Run() {
        pojazdy = new HashMap<>();

        // Inicjalne pojazdy
        pojazdy.put("1", new Samochod("1", "Mercedes", 150));
        pojazdy.put("2", new Samochod("2", "Audi", 70));
        pojazdy.put("3", new Samochod("3", "Dodge", 340));
        pojazdy.put("4", new Samochod("4", "Mustang", 550));
        pojazdy.put("5", new Samochod("5", "Ferrari", 850));
        pojazdy.put("6", new Rower("6", "Kross", 56));
        pojazdy.put("7", new Rower("7", "Meridav2", 43));
        pojazdy.put("8", new Rower("8", "Romet", 124));
        pojazdy.put("9", new Rower("9", "Trek", 432));
        pojazdy.put("10", new Rower("10", "Merida", 90));
        pojazdy.put("11", new Hulajnoga("11", "Bugatti", 120));
        pojazdy.put("12", new Hulajnoga("12", "Romet", 230));
        pojazdy.put("13", new Hulajnoga("13", "Trek", 540));
        pojazdy.put("14", new Hulajnoga("14", "Merida", 345));
        pojazdy.put("15", new Hulajnoga("15", "Cross", 545));
    }

    public void menu() {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Dodaj pojazd");
            System.out.println("2. Usuń pojazd");
            System.out.println("3. Wyświetl pojazdy");
            System.out.println("4. Wypożycz pojazd");
            System.out.println("5. Oblicz koszt wypożyczenia");
            System.out.println("6. Wyjście");
            System.out.print("Twój wybór: ");

            int wybor = input.nextInt();
            input.nextLine(); // czyszczenie bufora

            switch (wybor) {
                case 1 -> dodajPojazd(input);
                case 2 -> usunPojazd(input);
                case 3 -> wypiszPojazdy();
                case 4 -> wypozyczPojazd(input);
                case 5 -> obliczKoszt(input);
                case 6 -> {
                    System.out.println("Zakończono program.");
                    return;
                }
                default -> System.out.println("Nieprawidłowy wybór.");
            }
        }
    }

    private void dodajPojazd(Scanner input) {
        System.out.print("Podaj ID: ");
        String id = input.nextLine();
        if (pojazdy.containsKey(id)) {
            System.out.println("Pojazd o tym ID już istnieje.");
            return;
        }

        System.out.print("Podaj model: ");
        String model = input.nextLine();

        System.out.println("Wybierz typ:\n1. Samochód\n2. Rower\n3. Hulajnoga");
        int typ = input.nextInt();
        System.out.print("Podaj koszt za godzinę: ");
        double koszt = input.nextDouble();

        Pojazd p = switch (typ) {
            case 1 -> new Samochod(id, model, koszt);
            case 2 -> new Rower(id, model, koszt);
            case 3 -> new Hulajnoga(id, model, koszt);
            default -> {
                System.out.println("Nieprawidłowy typ.");
                yield null;
            }
        };

        if (p != null) {
            pojazdy.put(id, p);
            System.out.println("Dodano pojazd.");
        }
    }

    private void usunPojazd(Scanner input) {
        System.out.print("Podaj ID pojazdu do usunięcia: ");
        String id = input.nextLine();
        if (pojazdy.remove(id) != null) {
            System.out.println("Pojazd usunięty.");
        } else {
            System.out.println("Nie znaleziono pojazdu.");
        }
    }

    private void wypiszPojazdy() {
        if (pojazdy.isEmpty()) {
            System.out.println("Brak pojazdów.");
        } else {
            for (Pojazd p : pojazdy.values()) {
                System.out.println(p);
            }
        }
    }

    private void wypozyczPojazd(Scanner input) {
        System.out.print("Podaj ID pojazdu do wypożyczenia: ");
        String id = input.nextLine();
        Pojazd p = pojazdy.get(id);
        if (p == null) {
            System.out.println("Nie znaleziono pojazdu.");
        } else if (!p.dostepnosc) {
            System.out.println("Pojazd jest już wypożyczony.");
        } else {
            p.dostepnosc = false;
            System.out.println("Pojazd został wypożyczony.");
        }
    }

    private void obliczKoszt(Scanner input) {
        System.out.print("Podaj ID pojazdu: ");
        String id = input.nextLine();
        Pojazd p = pojazdy.get(id);
        if (p == null) {
            System.out.println("Nie znaleziono pojazdu.");
            return;
        }

        System.out.print("Podaj liczbę godzin: ");
        int godziny = input.nextInt();
        double koszt = godziny * p.getKosztZaGodzine();
        System.out.println("Koszt wypożyczenia: " + koszt + " PLN");
    }
}