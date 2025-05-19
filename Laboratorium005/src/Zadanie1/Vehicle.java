package Zadanie1;

public abstract class Vehicle {

    protected String Brand;
    protected String Model;
    protected int Year;
    protected double MaxSpeed;
    protected Engine Engine;
    protected FuelTank FuelTank;


    public Vehicle(String brand, String model, int year, double maxSpeed , Engine engine, FuelTank fuelTank) {
        this.Brand = brand;
        this.Model = model;
        this.Year = year;
        this.MaxSpeed = maxSpeed;
        this.Engine = engine;
        this.FuelTank = fuelTank;
    }

    public void displayInfo(){
        System.out.println("Marka auta " + Brand);
        System.out.println("Model auta " + Model);
        System.out.println("Rok Produkcji " + Year);
        System.out.println("Maksymalna prędkośc auta " + MaxSpeed +  "km/h");
        System.out.println("Silnik samochodu " + Engine.getPower() + " km/h" + Engine.getFuelType());
        System.out.println("Bak Auta " + FuelTank.getCurrentLevel() + " " + FuelTank.getCapacity() + " Litrów");
    }

    public void StartEngine(){
        Engine.StartEngine();
    }

    public void refuel(double amount) {
        FuelTank.refuel(amount);
    }

    public void consume(double amount) {
        FuelTank.consume(amount);
    }
}
