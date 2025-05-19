package Zadanie1;

public  class Pojazd {
    String id;
    String Model;
    double KosztZaGodzine;
    boolean dostepnosc = true;

    public Pojazd(String id, String Model, double KosztZaGodzine) {
        this.id = id;
        this.Model = Model;
        this.KosztZaGodzine = KosztZaGodzine;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public double getKosztZaGodzine() {
        return KosztZaGodzine;
    }

    public double setKosztZaGodzine(double KosztZaGodzine) {
        return KosztZaGodzine;
    }

    public boolean dostepnosc(boolean dostepnosc) {
        return dostepnosc;
    }
}

