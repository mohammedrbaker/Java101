package tr.com.mohammed.odevler;

/**
 * Created by Mohammed on 10/3/2017.
 */

import java.util.Scanner;


public class SiralamaOdevi {

    public static void main(String[] args) {

        int[][] dizi = diziElemaniGir();
        int[] tekliSayilar = tekSayiliriBul(dizi);
        tekSayilariSirala(tekliSayilar);

    }

    private static int[][] diziElemaniGir() {
        int i;
        int j = 0;

        Scanner scanner = new Scanner(System.in);

        int[][] diziElemani = new int[3][3];

        for (i = 0; i < diziElemani.length; i++) {

            for (j = 0; j < diziElemani.length; j++) {

                System.out.print("[" + i + "]" + "[" + j + "]" + "= ");
                diziElemani[i][j] = scanner.nextInt();

            }
        }

        return diziElemani;

    }

    private static int[] tekSayiliriBul(int[][] dizi) {

        int sayac = 0;
        int[] teksayilar = new int[4];

        for (int i = 0; i < dizi.length; i++) {
            for (int j = 0; j < dizi.length; j++) {
                if (dizi[i][j] % 2 == 1) {
                    teksayilar[sayac] = dizi[i][j];
                    sayac++;

                }
            }
        }

        System.out.println("Girilen dizideki tek sayılar: ");
        for (int i = 0; i <= sayac - 1; i++) {
            System.out.print(teksayilar[i] + "\t");
        }
        System.out.println();
        return teksayilar;

    }

    private static void tekSayilariSirala(int[] tekliSayilar) {
        int sayac = 0;
        for (int i = 0; i < tekliSayilar.length; i++) {
            for (int j = 0; j < tekliSayilar.length; j++) {
                if (tekliSayilar[i] < tekliSayilar[j]) {
                    int temp = tekliSayilar[i];
                    tekliSayilar[i] = tekliSayilar[j];
                    tekliSayilar[j] = temp;
                }
            }
        }
        System.out.println("Tek sayiların sıralı hali: ");


        for (int i = 1; i < tekliSayilar.length; i++) {
            System.out.print(tekliSayilar[i] + "\t");

        }


    }

}
