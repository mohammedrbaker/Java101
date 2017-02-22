package tr.com.mohammed.odevler;

/**
 * Created by Mohammed on 19/2/2017.
 *
 */
public class YeniBaklavaDilimi {

    public static void main(String[] args) {
        int i=1;
        while ( i<= 10 ) {
            int j=1;

            while (j <= i ){

                System.out.print("*");
                j++;
            }
            System.out.println();
            i ++;
        }

        //

        int b=1;
        int c=10;
        while ( b<= 10 ) {

            while (c >= b ){

                System.out.print("*");
                c--;
            }

            System.out.println();
            b ++;


        }




    }

}
