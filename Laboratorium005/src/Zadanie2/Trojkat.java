package Zadanie2;

class Trojkat extends Figura {
    double wys = 0, podst = 0;

    Trojkat(double wys, double podst) {
        this.wys = wys;
        this.podst = podst;
    }

    Trojkat(float wys, float podst, String kolor) {
        super(kolor);
        this.wys = wys;
        this.podst = podst;
    }

    double getPowierzchnia() {
        return 0.5 * podst * wys;
    }

    @Override
    String opis() {
        return "Trójkąt o wysokości " + wys + " i podstawie " + podst + ", kolor: " + kolor;
    }
}