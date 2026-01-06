public class MultiDimensionalArrays {
    public static void main(String[] args) {

        int[][] twoDArray = {{1,2,3},{4,5,6}};

        for (int i=0;i<twoDArray.length;i++) {
            for (int j=0;j<twoDArray[i].length;j++) {

                System.out.println(twoDArray[i][j]);

            }
        }

    }
}
