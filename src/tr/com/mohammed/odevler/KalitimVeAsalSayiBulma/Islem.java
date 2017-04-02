package tr.com.mohammed.odevler.KalitimVeAsalSayiBulma;

/**
 * Created by Mohammed on 2/4/2017.
 */
public class Islem {
    public static void main(String[] args) {

        int[][][][] dortBoyutluArray = {
                {{{231, 342, 394, 355}, {482, 595, 299, 326}, {725, 331, 298, 359}}},
                {{{102, 141, 128, 908}, {613, 104, 815, 277}, {136, 444, 137, 189}}},
                {{{159, 270, 281, 665}, {252, 223, 284, 223}, {295, 226, 270, 336}}}
        };


        AltSinifAsalSayi altSinifAsalSayi = new AltSinifAsalSayi();
        int asalSayi = altSinifAsalSayi.asalDegerBul(dortBoyutluArray);
        System.out.println("Prime number is: " + asalSayi);


    }
}
