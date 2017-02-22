package tr.com.mohammed.odevler;

import java.util.Scanner;

/**
 * Created by Mohammed on 5/2/2017.
 */

/*
 * Gelir vergisinin aşağıdaki kurallara göre belirlendiğini varsayalım:
 * Gelir ≤ 150,000,000 ise vergi oranı %25
 * Gelir ≤ 300,000,000 ise vergi oranı %30
 * Gelir ≤ 600,000,000 ise vergi oranı %35
 * Gelir ≤ 1,200,000,000 ise vergi oranı %40
 * Gelir > 1,200,000,000 ise vergi oranı %50

 * Bu problemi Java dilinde programlayabilmek için aşağıdaki basit algoritmayı uygulayacağız:

 * Gelir bilgisi klavyeden girilecek.
 * Gelir bilgisi, yukardaki vergi hesaplama kurallarına göre kontrol edilerek vergi hesaplanacak.
 * Hesaplanan vergi ekrana yazdırılacak.
 */


public class VergilendirmeOdevi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen gelirinizi giriniz:");
        //int gelir;
        float veriglendirme;
        int gelir = scanner.nextInt();
        if (gelir <= 150000000) {
            veriglendirme = ((gelir/100) * 25);
            System.out.println("Vergi tutarınız: "+ veriglendirme + " TL");
        }
        else if (gelir <= 300000000) {
            veriglendirme = ((gelir/100) * 30);
            System.out.println("Vergi tutarınız: "+ veriglendirme + " TL");
        }
        else if (gelir <= 600000000) {
            veriglendirme = ((gelir/100) * 35);
            System.out.println("Vergi tutarınız: "+ veriglendirme + " TL");
        }
        else if (gelir <= 1200000000) {
            veriglendirme = ((gelir/100) * 40);
            System.out.println("Vergi tutarınız: "+ veriglendirme + " TL");
        }
        else if (gelir > 1200000000) {
            veriglendirme = ((gelir/100) * 50);
            System.out.println("Vergi tutarınız: "+ veriglendirme + " TL");
        }

    }

}
