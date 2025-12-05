public class TaskBatch {
    private Task[] tasks;
    private int taskCount;

    public TaskBatch() {
        this.tasks = new Task[5];
        this.taskCount = 0;
    }


    public void addTask(Task task) {
        if (this.taskCount < 5) {
            this.tasks[taskCount] = task;
            this.taskCount += 1;
        } else {
            System.out.println("Task Batch has full size.");
        }
    }


    public int getTotalEnergyCost() {

        int totalEnergy = 0;

        if (this.taskCount == 0) {
            System.out.println("Do not have task --> getTotalEnergyCost");
        } else {
            for (int i=0; i<taskCount; i++) {
                totalEnergy += this.tasks[i].getEnergyCost();
            }
        }

        return totalEnergy;
    }

    public Task[] getTasks() {
        if (this.taskCount == 0) {
            System.out.println("No task to return --> getTasks");
            return new Task[0];
        } else {
            Task[] returnTaskBatch = new Task[this.taskCount];

            for (int i=0; i<this.taskCount; i++) {
                returnTaskBatch[i] = tasks[i]; //Prevents null objects in array
            }
            return returnTaskBatch;
        }
    }


    public void printBatchInfo() {
        if (this.taskCount == 0) {
            System.out.println("No task to print --> printBatchInfo");
        }

        for (int i=0; i<taskCount; i++) {
            String taskName = this.tasks[i].getTaskName();
            int taskEnergyCost = this.tasks[i].getEnergyCost();
            System.out.println("Task " + (i+1) + "'s name: " +taskName + " Task energy cost: " + taskEnergyCost);
        }
    }


    public int getTaskCount() {
        return this.taskCount;
    }



}
