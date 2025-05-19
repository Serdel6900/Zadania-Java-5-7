package Zadanie1;

public class Hulajnoga extends Pojazd implements Elektryczny{
    public Hulajnoga(String id, String Model, double KosztZaGodzine) {
        super(id, Model, KosztZaGodzine);
    }

    @Override
    public double PoziomBateri() {
        return 0;
    }

    @Override
    public void naladowanie() {




    }

    @Override
    public String toString(){
        return "Hulajnoga" + "Poziom Bateri" + PoziomBateri() + "ID " + getId() + "Model " + getModel() + "KosztZaGodzine " + getKosztZaGodzine();
    }

}
