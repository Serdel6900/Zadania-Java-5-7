package Zadanie1;

public class Engine {

    private int Power;
    private String fuelType;

    public Engine(int Power, String fuelType) {
        this.Power = Power;
        this.fuelType = fuelType;
    }

    public int getPower() {
        return Power;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void StartEngine() {
        System.out.println("\nAby uruchomić samochód przekręć kluczyk" + " " + "Brawo silnik uruchomiony");
    }


}
