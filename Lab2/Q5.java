import java.util.Scanner;

public class Q5 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quiz 1: ");
        int quiz1 = scanner.nextInt() * 40 / 100;

        System.out.print("Quiz 2: ");
        int quiz2 = scanner.nextInt() * 40 / 100;

        System.out.print("Quiz 3: ");
        int quiz3 =scanner.nextInt() * 40 / 100;

        System.out.print("Final Exam: ");
        int FinalExam =scanner.nextInt() * 60 / 100;


        int final_exam_score = quiz1 + quiz2 + quiz3 + FinalExam;

        System.out.println("\n" + final_exam_score);

        scanner.close();
    }
}
