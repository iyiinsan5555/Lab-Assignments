public class Lab7Student {
    int age;
    String name;

    public void printStudentInfo(){
        System.out.println("Name: " + name + "  Age: " + age);
    }

    //Default Constructor
    public Lab7Student(){
        this.age = 0;
        this.name = "Not assigned";
    }

    //Parameterized Constructor
    public Lab7Student(int age, String name){
        this.age = age;
        this.name = name;
    }

}
