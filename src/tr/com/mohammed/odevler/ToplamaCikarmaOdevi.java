package tr.com.mohammed.odevler;

/**
 * Created by Mohammed on 5/2/2017.
 */

import java.util.Scanner;

/**
 * Kullanıcıdan girdiği iki sayı ve yapılacak işlem türü (toplama, çıkarma, çarpma, bölme) seçildiğinde,
 * sonucu hesaplayarak ekranda gösteren programı yazalım. İf- else if - else ile yapılacak
 */
public class ToplamaCikarmaOdevi {

    public static void main(String[] args) {

        Scanner scannerBirinciSayi = new Scanner(System.in);
        System.out.print("Lütfen birinci sayıyı giriniz: ");
       // int birinciSayi;
        int birinciSayi = scannerBirinciSayi.nextInt();
        Scanner scannerIkinciSayi = new Scanner(System.in);

        System.out.print("Lütfen birinci sayıyı giriniz: ");
        //int ikinciSayi;
        int ikinciSayi = scannerIkinciSayi.nextInt();
        Scanner islemOp = new Scanner(System.in);

/*
        System.out.print("Lütfen (toplama, çıkarma, çarpma, bölme) işlemlernizden birini giriniz: ");
        String matOp;
        matOp = islemOp.nextLine();
        float sounuc;
        if (matOp.equals("toplama") ) {
            sounuc = birinciSayi + ikinciSayi;
            System.out.println(sounuc);
        }
        else if (matOp.equals("çıkarma") ) {
            sounuc = birinciSayi - ikinciSayi;
            System.out.println(sounuc);
        }
        else if (matOp.equals("çarpma") ) {
            sounuc = birinciSayi * ikinciSayi;
            System.out.println(sounuc);
        }
        else if (matOp.equals("bölme") ) {
            sounuc = birinciSayi / ikinciSayi;
            System.out.println(sounuc);
        }
*/

        /*
        ikinci bir yöntem
         */

        System.out.print("Lütfen (+, -, *, /) işlemlernizden birini giriniz: ");
        //char matOp;
        char matOp = islemOp.next().charAt(0);
        float sounuc;
        if (matOp == '+' ) {
            sounuc = birinciSayi + ikinciSayi;
            System.out.println(sounuc);
        }
        else if (matOp == '-' ) {
            sounuc = birinciSayi - ikinciSayi;
            System.out.println(sounuc);
        }
        else if (matOp == '*' ) {
            sounuc = birinciSayi * ikinciSayi;
            System.out.println(sounuc);
        }
        else if (matOp == '/' ) {
            sounuc = birinciSayi / ikinciSayi;
            System.out.println(sounuc);
        }

    }
}


