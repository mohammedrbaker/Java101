package tr.com.mohammed.odevler;

/**
 * Created by Mohammed on 17/2/2017.
 */
public class BaklavaDilimiOdevi {

    public static void main(String[] args) {

        System.out.println("Done By: Mohammed Rashad Baker");

        int patternSize = 11;
        int i=1;
        int x=1;


        while ( i < patternSize) {

            int k = patternSize;
            while (k >= i) {

                System.out.print(" ");
                k -= 2;
            }
            int j = 1;
            while (j <= i) {

                System.out.print("*");
                j++;
            }

            System.out.println();
            i += 2;
        }


        while ( x <= patternSize) {
                int k=1;
                while ( k <= x) {
                    System.out.print(" ");
                    k += 2;
                }
                int j = patternSize;
                while (j >= x ){

                    System.out.print("*");
                    j--;
                }

            System.out.println();


            x += 2;



        }




    }
}
