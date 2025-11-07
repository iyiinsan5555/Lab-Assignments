import java.util.Random;

public class Bonus {
    public  static void main(String[] args) {

        Random random = new Random();

        int[][] scores = new int[5][4];

        for (int i=0; i<5; i++) {
            for (int j=0; j<4;j++) {

                scores[i][j] = random.nextInt(0, 101);

            }
        }

        //Printing each row in each line
        for (int i=0; i<5; i++) {
            System.out.printf("Student %d: ", i+1);
            for (int j=0; j<4;j++) {

                System.out.print(scores[i][j] + " ");

            }
            System.out.println();

        }


        //Getting student average
        int[] totals = new int[5];

        for (int i=0; i<5; i++) {
            for (int j=0; j<4;j++) {
                totals[i] += scores[i][j];
            }
        }


        double[] StudentAverages = new double[5];

        for (int i=0; i<5; i++) {
            StudentAverages[i] = ((double) totals[i] / 4);
        }

        int[] quizTotals = new int[4];
        double[] quizAverages = new double[4];

        //Getting each quiz's average
        for (int i=0; i<4; i++) {
            for (int j=0; j<5;j++) {
                quizTotals[i] += scores[j][i];
            }
        }

        for (int i=0; i<4; i++) {
            quizAverages[i] = (double) (quizTotals[i] / 4);
        }

       //Printing quiz averages
        for (int i=0; i<4; i++) {
            System.out.printf("Quiz %d Average : %.02f %n", (i+1), quizAverages[i]);
        }

        //Printing each students quiz averages
        for (int i=0;i<5;i++){
            System.out.printf("Average Student %d : %.02f %n", (i+1), StudentAverages[i]);
        }

        //Finding the highest score

        int highestScoreValue = 0;
        int[] highestScoreIndex = {0, 0}; //Defualt value

        //Finding the highest score
        for (int i=0; i<5; i++) {
            for (int j=0; j<4;j++) {

                if (scores[i][j] > highestScoreValue) {
                    highestScoreValue = scores[i][j];
                    highestScoreIndex[0] = i; //Student index
                    highestScoreIndex[1] = j; //Quiz index
                } else if (scores[i][j] == highestScoreValue) {
                    // 2 values sharing the highest score
                    if (i < highestScoreIndex[0]) {
                        highestScoreValue = scores[i][j];
                        highestScoreIndex[0] = i;
                        highestScoreIndex[1] = j;
                        System.out.println("2 values were sharing the highest value. I got the one that has smallest studentIndex and quizIndex");

                    } else if (i == highestScoreIndex[1]) { //If still sharing same index I'm looking for the smallest quizIndex
                        if (j < highestScoreIndex[1]) {
                            highestScoreValue = scores[i][j];
                            highestScoreIndex[0] = i;
                            highestScoreIndex[1] = j;
                        }
                    }
                }

            }
        }

        System.out.printf("Highest score : %d Student Index : %d, Quiz Index : %d %n", highestScoreValue, highestScoreIndex[0], highestScoreIndex[1]);
        System.out.printf("Highest score : %d Student Number : %d, Quiz Number : %d", highestScoreValue, highestScoreIndex[0] + 1, highestScoreIndex[1] + 1);



    }
}
