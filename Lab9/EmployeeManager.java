import java.io.FileWriter;
import java.nio.file.Paths;
import java.util.Formatter;
import java.util.Scanner;

public class EmployeeManager {

    private Employee[] employees;


    public void loadEmployeesFromFile(String filePath) {

        //reading the file

        Scanner fileReader = null;

        try {

            fileReader = new Scanner(Paths.get(filePath));

            int employeeCount = 0;
            while (fileReader.hasNextLine()) {
                employeeCount += 1;
            }

            employeeCount = 0;
            while (fileReader.hasNextLine()) {
                String[] parts = fileReader.nextLine().split(", ");

                Employee emp = new Employee(parts[0], parts[1], parts[2]);
                this.employees[employeeCount] = emp;
                employeeCount += 1;
            }


        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void displayEmployees() {
        for (Employee emp : this.employees) {

            System.out.println(emp.toString());

        }
    }

    public void addEmployee(String name, String department, String email) {

        Employee[] newEmpArray = new Employee[this.employees.length + 1];

        for (int i=0; i<this.employees.length; i++) {
            newEmpArray[i] = this.employees[i];
        }

        newEmpArray[newEmpArray.length - 1] = new Employee(name, department, email);

        this.employees = newEmpArray;

        //Writing a new file
        Formatter formatter = null;
        FileWriter fileWriter = null;

        //Clean up
        try {
            fileWriter = new FileWriter("q3.txt", false);
            formatter = new Formatter(fileWriter);
            formatter.format("");
            fileWriter.close();
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if (formatter != null) {
                formatter.close();
            }
        }

        //Appending to the file

        try {
            for (Employee emp : this.employees) {

                FileWriter fileWriter2 = new FileWriter("q3.txt", true);
                Formatter formatter2 = new Formatter(fileWriter);

                formatter2.format("%s %n", emp.toString());
                formatter2.close();
                fileWriter2.close();
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void searchEmployee(String name) {
        for (Employee emp : this.employees) {
            if (emp.getName().equals(name)) {
                System.out.println(emp.toString());
            }
        }
    }

}
