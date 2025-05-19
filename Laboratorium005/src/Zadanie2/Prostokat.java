package Zadanie2;

class Prostokat extends Figura {
    double wys = 0, szer = 0;

    Prostokat(double wys, double szer) {
        this.wys = wys;
        this.szer = szer;
    }

    Prostokat(float wys, float szer, String kolor) {
        super(kolor);
        this.wys = wys;
        this.szer = szer;
    }

    double getPowierzchnia() {
        return (szer * wys);
    }

    void przesun(float dx, float dy) {
        this.punkt.przesun((int) dx, (int) dy);
    }

    @Override
    String opis() {
        return "Prostokąt o wymiarach: " + szer + "x" + wys + ", kolor: " + kolor;
    }
}