package tr.com.mohammed.odevler;

/**
 * Created by Mohammed on 5/2/2017.
 */


import java.util.Scanner;

/**
 * Bir mağazada alınan ürünün fiyatı 100 Tl ve üzerinde ise 5 Tl olan kargo ücreti alınmamaktadır.
 * Ürünün fiyatı girildiğinde toplam ödenmesi gereken tutarı gösteren programı yazalım.
 */
public class KargoOdevi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen ürünün fiyatını giriniz: ");
        //int urunFiyat;
        int urunFiyat = scanner.nextInt();
        if (urunFiyat >= 100){
            System.out.println("Toplam turtar: " + urunFiyat + " TL"+ ","+" alışverişiniz 100 TL üzeri olduğu için kargonuz ücretsizdir.");
        }

        else if (urunFiyat<100) {
            urunFiyat += 5;
            System.out.println("Toplam turtar: " + urunFiyat + " TL"+  ","+" alışverişiniz 100 TL altında olduğu için kargo ücreti eklenmiştir.");
        }
        System.out.println();
    }
}
