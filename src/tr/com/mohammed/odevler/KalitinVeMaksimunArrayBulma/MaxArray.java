package tr.com.mohammed.odevler.KalitinVeMaksimunArrayBulma;

/**
 * Created by Mohammed on 1/4/2017.
 */

public class MaxArray {


       public int maxDegerBul(int[][][] arrayElemani) {

        int temp = 1;
        for (int i = 0; i < arrayElemani.length; i++) {
            for (int j = 0; j < arrayElemani.length; j++) {
                for (int k = 0; k < arrayElemani.length; k++) {

                    if (arrayElemani[i][j][k] > temp) {
                        temp = arrayElemani[i][j][k];
                    }


                }
            }


        }

        //System.out.println("Max is: " + temp);

        return temp;
    };


}
