package Zadanie2;

public class Prostokat extends Figura implements IFigury {
    int wys=0;
    int szer=0;

    Prostokat(int wys,int szer,String kolor){
        this.wys = wys;
        this.szer = szer;
        super.kolor = kolor;
    }


    public String opis(){
        return "Prostokat o wymairach: "+szer+" x "+wys;
    }

    @Override
    void skaluj(float skala) {
        wys *= (int) skala;
        szer *= (int) skala;
    }

    @Override
    public float getPowierzchnia() {
        return wys*szer;
    }

    @Override
    public boolean wPolu(Punkt p) {
        return false;
    }
}