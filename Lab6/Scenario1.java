import java.util.Arrays;

public class Scenario1 {
    public void main(String[] args) {

        //An array of students that's size is 20
        int[] students = new int[20];

        for (int i=0; i<students.length; i++) {
            students[i] = 1000 + i;
        }

        System.out.println(Arrays.toString(students));

        //Class's size changed. I need to resize the old array.
        int[] resizedStudents = resizeArray(students, 42);
        System.out.println(Arrays.toString(resizedStudents));

        //If we are not allowed to use Arrays.toString() here is the for loop version.

        for (int i=0; i<students.length;i++) {
            System.out.print(students[i] + " ");
        }
        System.out.println();
        for (int i=0; i<resizedStudents.length;i++) {
            System.out.print(resizedStudents[i] + " ");
        }


    }


    static int[] resizeArray(int[] oldArray, int newArraySize) {

        int[] newArray = new int[newArraySize];

        System.arraycopy(oldArray, 0, newArray, 0, oldArray.length); //My lecturer let me use it

        return newArray;
    }
}
