package Zadanie2;

public class Trojkat extends Figura implements IFigury{
    int wys=0;
    int podst=0;
    Trojkat(int wys,int podst,String kolor){

        this.wys = wys;
        this.podst = podst;
        super.kolor = kolor;
    }
    public String opis(){
        return "Trojkat o wymairach: "+wys+"  "+podst;
    }

    @Override
    void skaluj(float skala) {
        wys *= (int) skala;
        podst *= (int) skala;
    }

    @Override
    public float getPowierzchnia() {
        return (float) (wys * podst) /2;
    }

    @Override
    public boolean wPolu(Punkt p) {
        return false;
    }
}