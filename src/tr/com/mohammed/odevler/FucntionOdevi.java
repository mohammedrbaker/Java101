package tr.com.mohammed.odevler;

import java.util.Scanner;

/**
 * Created by Mohammed on 18/2/2017.
 */
public class FucntionOdevi {


    public static void main(String[] args) {

      //  int intKarakterYaz = 5;
       // double doubleSayiBir = 23.34;
       // double doubleSayiIki = 53.235;
      //  int intSayiBir = 4;
       // int intSayiIki = 6;
       // double kareSayi= 7;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Karakter yazdırmak için bir sayı giriniz: ");
        int  intKarakterYaz = scanner.nextInt();

        System.out.println("Bölme işlemi için iki sayı double olarak giriniz: ");
        int  doubleSayiBir = scanner.nextInt();
        int  doubleSayiIki = scanner.nextInt();

        System.out.println("Toplama işlemi için iki sayı int olarak giriniz: ");
        int  intSayiBir = scanner.nextInt();
        int  intSayiIki = scanner.nextInt();


        System.out.println("Sayı karesini bulmak için bir sayı double giriniz: ");
        double  kareSayi = scanner.nextInt();


        int bastirilacakKararkterSayisi = karakterGonder (intKarakterYaz);
        double doubleBolmeSonuc = bolme ( doubleSayiBir, doubleSayiIki);
        int intToplamaSonuc= toplama (intSayiBir, intSayiIki);
        double doubleSayiKaresiSonuc= karesiniAl ( kareSayi);

        for (int i = 0; i < bastirilacakKararkterSayisi; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.println("Toplama: "+ intToplamaSonuc);
        System.out.println("Bölme: "+ doubleBolmeSonuc);
        System.out.println("Kare: "+ doubleSayiKaresiSonuc);

    }

    public static int karakterGonder (int karakterSayisi) {

        for (int i = 0; i < karakterSayisi; i++) {

        }
        return karakterSayisi;
    }

    public  static  double bolme (double a, double b) {

        double c = a/b;
        return c;

    }
    public static int toplama (int c,int d) {
        int f = c+d;
        return f;
    }
    public static double karesiniAl (double sayi){

        double kare = sayi*sayi;
        return kare;
    }


}
