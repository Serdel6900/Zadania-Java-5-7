package Zadanie2;

class Kwadrat extends Prostokat {
    public Kwadrat(float bok, String kolor) {
        super(bok, bok, kolor);
    }

    public double getBok() {
        return szer;
    }

    public void setBok(double bok) {
        this.szer = bok;
        this.wys = bok;
    }

    @Override
    String opis() {
        return "Kwadrat o boku " + szer + ", kolor: " + kolor;
    }
}