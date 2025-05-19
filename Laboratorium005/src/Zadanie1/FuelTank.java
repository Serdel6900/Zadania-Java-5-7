package Zadanie1;

public class FuelTank {
    private double capacity;
    private double currentLevel;

    public FuelTank(double capacity, double currentLevel) {
        this.capacity = capacity;
        this.currentLevel = currentLevel;
    }

    public void refuel(double amount) {
        if (currentLevel + amount > capacity) {
            System.out.println("\nZa dużo paliwa! Maksymalna pojemność to " + capacity + "L");
            currentLevel = capacity;
        } else {
            currentLevel += amount;
            System.out.println("\nZatankowano " + amount + "L. Obecny poziom: " + currentLevel + "L");
        }
    }

    public void consume(double amount) {
        if (currentLevel - amount < 0) {
            System.out.println("\nZa mało paliwa! Potrzebne: " + amount + "L, dostępne: " + currentLevel + "L");
        } else {
            currentLevel -= amount;
            System.out.println("\nZużyto " + amount + "L paliwa. Pozostało: " + currentLevel + "L");
        }
    }

    public double getCurrentLevel() {
        return currentLevel;
    }

    public double getCapacity() {
        return capacity;
    }
}
