public class Task {
    private String taskName;
    private int energyCost;

    public Task(String taskName, int energyCost) {
        this.taskName = taskName;
        this.energyCost = energyCost;
    }

    //Getters
    public String getTaskName() {
        return this.taskName;
    }

    public int getEnergyCost() {
        return this.energyCost;
    }


    //Task processing
    public void describeTask() {
        System.out.println("Task Name: " + this.taskName + " Energy Cost of Task: " + this.energyCost);
    }

}
