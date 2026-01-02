public class MergeArraysBetter {


    public static int[] mergeArrays(int[] arrayA, int[] arrayB){
        int[] arrayC = new int[arrayA.length + arrayB.length];
        int aCtr = 0;
        int bCtr = 0;
        int cCtr = 0;

        while (cCtr < arrayC.length) {
            if (arrayA[aCtr] < arrayB[bCtr]) {
                arrayC[cCtr++] = arrayA[aCtr++];
            } else {
                arrayC[cCtr++] = arrayB[bCtr++];
            }

            if (aCtr == arrayA.length) {
                for (int i=bCtr; i<arrayC.length;i++) {
                    arrayC[cCtr++] = arrayB[i];
                }
                break;
            }
            if(bCtr  ==  arrayB.length)  {
                for(int  i=aCtr;i<arrayC.length;i++)  {
                    arrayC[cCtr++] = arrayA[i];
                }
                break;
            }
        }

        return arrayC;
    }
}
