package tr.com.mohammed.odevler;

import java.util.Scanner;

/**
 * Created by Mohammed on 23/2/2017.
 */
public class CarpanlaraAyirmaOdevi {

    public static void main(String[] args) {

        int sayiGir = veriAl();
        carpanlaraAyir(sayiGir);

    }

    public static int veriAl() {
        // TODO kullanıcıdan veri alınacak.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Çarpan bulmak için bir sayı giriniz: ");
        int sayiGir = scanner.nextInt();

        return sayiGir;

    }

    public static void carpanlaraAyir(int girilenSayi) {
        // TODO carpanlarına ayır.
		/*
		 * 1. Girilen sayıya kadar asal sayıları bul.
		 * 2. Girilen sayıyı, ilk asal sayıdan başlayarak Mod yapar.
		 * 3. Eğer Mod sonucu 0 ise, girilen sayıyı çarpana böl ve bölme tekrarını tut.
		 * 4. Elde edilen sayıları yazdır.
		 */

        System.out.println(girilenSayi + " Sayisinin Çarpanları: ");
        for (int carpan = 2; carpan <= girilenSayi; carpan++) {

            if (girilenSayi % carpan == 0) {

                int count = 0;
                while (girilenSayi % carpan == 0) {

                    int sayiCarpani = girilenSayi / carpan;

                    count++;
                    girilenSayi = sayiCarpani;

                }

                System.out.println(carpan + " üzeri " + count);

            }

        }

    }

}
