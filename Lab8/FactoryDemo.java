import java.util.Scanner;

public class FactoryDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Robot robot1 = new Robot("Robot Ali", 100, "Active");
        Robot robot2 = new Robot("Robot Ayşe", 75, "Active");

        robot1.displayRobotInfo();
        robot2.displayRobotInfo();

        System.out.print("Amount of battery to consume: ");
        int consumeAmount = scanner.nextInt();

        robot1.consumeBattery(consumeAmount);
        robot1.displayRobotInfo();

        Task task1 = new Task("ödev 1", 13);
        boolean isEnough = robot2.isBatteryEnough(task1.getEnergyCost()); //Checking if roboot has enough battery to do the task (Is batter > energyCost) returns true either false
        System.out.println(isEnough);

        Task task2 = new Task("Türev Çöz", 34);
        robot2.performTask(task2);


        Task task3 = new Task("İntegral al", 10);
        Task task4 = new Task("Java lab yap", 23);

        TaskBatch taskBatch = new TaskBatch();
        taskBatch.addTask(task1);
        taskBatch.addTask(task2);
        taskBatch.addTask(task3);
        taskBatch.addTask(task4);

        taskBatch.printBatchInfo();
        System.out.println("Total energy of taskBatch: "+ taskBatch.getTotalEnergyCost());

        Robot robot3 = new Robot("İnek Öğrenci" ,100, "Active");
        robot3.displayRobotInfo();
        robot3.performTaskBatch(taskBatch);
        robot3.displayRobotInfo();


    }
}
