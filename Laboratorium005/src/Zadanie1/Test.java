package Zadanie1;

public class Test {
    public static void main(String[] args) {
        Engine carEngine = new Engine( 300 , "Benzyna");
        FuelTank carTank =  new FuelTank( 63, 50);
        Car car = new Car("AUDI" , "A4" , 2005 , 269 , carEngine , carTank , 5);

        Engine truckEngine = new Engine( 200 , "Disel");
        FuelTank truckTank =  new FuelTank( 300, 50);
        Truck Truck = new Truck("BMW" ,"M4" , 2025 , 350 , truckEngine , truckTank , 10);

        System.out.println("\nSamochód Osobowy");
        car.displayInfo();
        car.StartEngine();
        car.refuel(20);
        car.consume(15);

        System.out.println("\nSamochód Ciężarowy");
        Truck.displayInfo();
        Truck.StartEngine();
        Truck.refuel(120);
        Truck.consume(30);


    }
}
