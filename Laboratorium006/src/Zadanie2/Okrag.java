package Zadanie2;

public class Okrag extends Figura implements RuchFigury{
    int promien;

    public Okrag(int promien){
        this.promien = promien;
    }

    @Override
    String opis() {
        return "Obiekt klasy okrag";
    }

    @Override
    void skaluj(float skala) {
        promien *= (int) skala;
    }

    @Override
    public void przesun(int x, int y) {
        super.punkt.x += x;
        super.punkt.y += y;
    }
}