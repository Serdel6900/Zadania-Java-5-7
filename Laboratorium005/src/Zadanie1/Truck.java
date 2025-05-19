package Zadanie1;



public class Truck extends Vehicle {

    private int  loadCapacity;

    public Truck(String brand, String model, int year, double maxSpeed , Engine engine, FuelTank fuelTank , int loadCapacity) {
        super(brand, model, year, maxSpeed, engine, fuelTank);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("\nMaksymalna ładowność tira wynois " + loadCapacity + "Tyle ton");
    }

}
