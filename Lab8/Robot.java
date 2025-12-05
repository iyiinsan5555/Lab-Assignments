import java.util.Arrays;

public class Robot {
    private String modelName;
    private int batteryLevel;
    private String status;


    public Robot(String modelName, int batteryLevel, String status){
        this.modelName = modelName;
        this.batteryLevel = batteryLevel;
        this.status = status;
    }

    //Setters
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    //getters

    public String getModelName() {
        return this.modelName;
    }

    public int getBatteryLevel() {
        return this.batteryLevel;
    }

    public String getStatus() {
        return this.status;
    }

    public void displayRobotInfo(){
        System.out.println("Model Name: " + this.modelName + " Battery Level: " + this.batteryLevel + " Current Status: " + this.status);
    }


    //Additional Methods

    public boolean isBatteryEnough(int requiredAmount) {
        return this.batteryLevel >= requiredAmount; //boolean expression
    }

    public void consumeBattery(int amount) {

        if (amount < 0) {
            System.out.println("Amount cannot be negative --> consumeBattery");
            return;
        }

        if (this.batteryLevel - amount < 0) {
            this.batteryLevel = 0;
            System.out.println("Battery level reached 0");
        } else {
            this.batteryLevel -= amount;
            System.out.println("Consumed battery -" + amount);
            System.out.println("New Battery Level: " + batteryLevel);
        }
    }

    public void chargeBattery(int amount) {

        if (amount < 0) {
            System.out.println("Amount cannot be negative --> chargeBattery");
            return;
        }

        if (this.batteryLevel + amount > 100) {
            this.batteryLevel = 100;
            System.out.println("Max battery level is 100, cannot charge more than 100.");
        } else {
            this.batteryLevel += amount;
        }

        if (this.batteryLevel == 100) {
            this.status = "Active";
        } else {
            this.status = "Charging";
        }
    }

    //Performing Tasks
    public void performTask(Task task) {
        System.out.println(this.modelName + " is trying to perform " + task.getTaskName());

        String taskName = task.getTaskName();
        int energyCost = task.getEnergyCost();

        if (this.status.equals("Charging")) {
            System.out.println("Robot is currently charging, cannot perform task:" + taskName);
        }

        if (this.isBatteryEnough(energyCost)) {
            this.consumeBattery(energyCost);
            System.out.println(this.modelName + " successfully made the task: " + taskName);
        } else {
            System.out.println(this.modelName + " does not have enough battery to done the task: " + taskName);
            System.out.println("Energy Needed: " + energyCost + " Current Battery: " + this.batteryLevel);
        }

    }


    public void performTaskBatch(TaskBatch batch) {

        int taskCount = batch.getTaskCount();
        Task[] taskBatch = batch.getTasks(); // array of tasks

        if (taskCount == 0) {
            System.out.println("No tasks to perform. --> performTaskBatch");
        }

        int totalTasksEnergy = batch.getTotalEnergyCost();
        if (this.isBatteryEnough(totalTasksEnergy)) {
            System.out.println(this.modelName + " is trying to perform a task batch. (several tasks)");

            for (int i=0; i<taskBatch.length; i++) {
                this.performTask(taskBatch[i]);
            }
            this.displayRobotInfo();
        }
    }


}
