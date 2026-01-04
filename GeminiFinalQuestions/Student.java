public class Student {
    private String name;
    private long id;
    private double grade;

    public Student(String name, long id, double grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    //Getters
    public String getName() {return this.name;}
    public long getId() {return this.id;}
    public double getGrade() {return this.grade;}
}
