package Zadanie2;

class Figura {

    //pola metody i kontruktory
    Punkt punkt;
    String kolor = "bialy";


    Figura(){
        punkt = new Punkt(0,0);
    }
    Figura(String kolor){
        this.kolor="Czerwony";
        this.punkt = new Punkt(53,12);
    }
    Figura(Punkt punkt){
        this.punkt=punkt;
    }
    String getKolor(){
        return kolor;
    }
    String opis(){
        return "Klasa Figura. Kolor obiektu: "+kolor;
    }


}
