public class FuelTank {
    private double capacity;
    private double currentLevel;

    public FuelTank(double capacity) {
        this.currentLevel = 0;
        this.capacity = capacity;
    }

    public void addFuel(double amount) {
        if (currentLevel + amount <= capacity) {
            currentLevel += amount;
        } else {
            currentLevel = capacity;
            System.out.println("Cannot exceed the capacity!");
        }
    }

    public void consumeFuel(double amount) {
        if (currentLevel - amount > 0) {
            currentLevel -= amount;
        } else {
            currentLevel = 0;
            System.out.println("Tank is empty.");
        }
    }

    public double getFillPercentage() {
        return currentLevel / capacity;
    }

}
