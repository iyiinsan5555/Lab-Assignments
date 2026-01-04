import java.io.FileWriter;
import java.util.Formatter;

public class GradeBook {

    private Student[] students = new Student[2];
    private int studentCount = 0;

    public void addStudent(Student std) {
        students[studentCount] = std;
        studentCount += 1;

        if (studentCount >= students.length) {
            //Grow array
            Student[] newArray = new Student[students.length * 2];
            for (int i=0;i<students.length;i++) {
                newArray[i] = students[i];
            }
            students = newArray;
        }
    }

    public void saveTopStudents(double threshold) {
        for (int i=0; i<students.length; i++) {
            if (students[i] == null) {return;}
            if (students[i].getGrade() < threshold) {continue;}

            Formatter f = null;
            FileWriter fw = null;

            try {
                fw = new FileWriter("honors_list.txt", true);
                f = new Formatter(fw);
                f.format("%s, %d, %f %n", students[i].getName(), students[i].getId(), students[i].getGrade());
                fw.close();
            } catch (Exception e) {
                System.out.println(e);
            } finally {
                if (f != null) {
                    f.close();
                }
            }
        }
    }


    public static void main(String[] args) {
        Student std1 = new Student("Melih", 11102515, 92.5);
        Student std2 = new Student("Ahmet", 223562632, 87.125);
        Student std3 = new Student("Veli", 125216436, 100);

        GradeBook gradeBook = new GradeBook();
        gradeBook.addStudent(std1);
        gradeBook.addStudent(std2);
        gradeBook.addStudent(std3);
        gradeBook.saveTopStudents(50);
    }

}
