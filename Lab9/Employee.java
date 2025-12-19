public class Employee {
    private String name;
    private String department;
    private String email;

    public Employee(String name, String department, String email) {
        this.name = name;
        this.department = department;
        this.email = email;
    }

    //Getters
    public String getName(){
        return this.name;
    }

    public String getDepartment(){
        return this.department;
    }

    public String getEmail(){
        return this.email;
    }

    //Setters
    public void setName(String newName) {
        this.name = newName;
    }

    public void setDepartment(String newDepartment) {
        this.name = newDepartment;
    }

    public void setEmail(String newEmail) {
        this.name = newEmail;
    }


    public String toString() {
        return "Name: " + this.name + "Department: " + this.department + "Email: " + this.email;
    }


}
