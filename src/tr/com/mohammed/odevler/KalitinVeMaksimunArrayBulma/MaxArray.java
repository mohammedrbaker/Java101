package tr.com.mohammed.odevler.KalitinVeMaksimunArrayBulma;

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;

/**
 * Created by Mohammed on 1/4/2017.
 */

public class MaxArray {


    public void maxDegerBul(int[][][] arrayElemani) {
        int maxK = 0;
        int maxI = 0;
        int maxJ = 0;
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

        System.out.println("Max is: " + temp);


    }

    ;

    //return int max deger
}
