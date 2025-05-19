package Zadanie1;

public class Car extends Vehicle {

    private  int  passengerCapacity;

    public Car(String brand, String model, int year, double maxSpeed , Engine engine, FuelTank fuelTank , int passengerCapacity) {
        super(brand, model, year, maxSpeed, engine, fuelTank);
        this.passengerCapacity = 5;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("\nMaksymalna pojemnośc pasażerów wynosi " + passengerCapacity + " osób " );
    }


}
