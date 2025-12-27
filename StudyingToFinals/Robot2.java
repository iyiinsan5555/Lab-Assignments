public class Robot2 {
    private String modelName;
    private int batteryLevel;
    private String status;

    public Robot2(String name, int battery, String status) {
        this.modelName = name;
        this.batteryLevel = battery;
        this.status = status;
    }

    //Getters
    public String getModelName() {
        return this.modelName;
    }

    public String getStatus() {
        return this.status;
    }

    public int getBatteryLevel() {
        return this.batteryLevel;
    }

    //Setters

    public void setModelName(String newName) {
        this.modelName = newName;
    }

    public void setBatteryLevel(int newBatter) {
        this.batteryLevel = newBatter;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    //Methods
    public void displayRobotInfo() {
        System.out.println("----------------------------");
        System.out.println("Model Name: "+this.modelName);
        System.out.println("Battery Level: "+this.batteryLevel);
        System.out.println("Status: "+this.status);
        System.out.println("----------------------------");
    }

    public boolean isBatteryEnough(int requiredBattery) {
        if (this.batteryLevel >= requiredBattery) {
            return true;
        }
        return false;
    }

    public void consumeBattery(int amount) {
        this.batteryLevel -= amount;
    }

    public void chargeBattery(int amount) {
        if (this.batteryLevel + amount >= 100) {
            this.batteryLevel = 100; //Cannot be bigger than 100
            this.status = "Active";
        } else {
            this.batteryLevel += amount;
            this.status = "Charging";
        }
    }


}
