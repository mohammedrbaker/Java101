package tr.com.mohammed.odevler.KalitinVeMaksimunArrayBulma;

import java.lang.reflect.Array;

/**
 * Created by Mohammed on 2/4/2017.
 */
public class Islem {
    public static void main(String[] args) {

        int[][][] ucBoyutluArray = {
                {{231, 342, 394}, {482, 595, 326}, {725, 298, 359}},
                {{102, 141, 128}, {613, 104, 815}, {136, 137, 189}},
                {{159, 270, 281}, {252, 223, 284}, {295, 226, 270}}
        };


        AltSinifArray altSinifArray = new AltSinifArray();
        altSinifArray.maxDegerBul(ucBoyutluArray);


    }
}
