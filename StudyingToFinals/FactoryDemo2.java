public class FactoryDemo2 {
    public static void main(String[] args) {
        Robot2 rbt1 = new Robot2("Selena", 78, "Active");
        Robot2 rbt2 = new Robot2("Doruk", 45, "Active");

        rbt1.displayRobotInfo();
        System.out.println();
        rbt2.displayRobotInfo();

        //Consuming Battery
        rbt1.consumeBattery(60);
        rbt1.displayRobotInfo();

    }
}
