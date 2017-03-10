package tr.com.mohammed.odevler.kisilerOdevi;

import java.util.Scanner;

/**
 * Created by Mohammed on 10/3/2017.
 */


/*
Kisiler.class olacak ve içinde  int id, string isim ve int dogum yılı olacak ayrıca
bu class içinde bu değişkenlerin set-get olacak ve bir tanede void foksiyon olacak
ve kişinin yaşını hesaplacak 2017'e göre.

Bu kisi sınıfı Islem sınıfı içerisinden çağrılacak ve set foksiyonları ile kişiye bilgiler girilecek.
Get foksiyonları ile bu bilgiler okunacak. Ayrıca islem sınıfı içerisinden bu yaş hesapla foksiyonu çagırılacak
ve kişinin yaşını hesaplayacak.
 */
public class Islem {

    public static void main(String[] args) {

        Kisiler kisi = new Kisiler();
        kisi.setDogumYili();
        kisi.yasHesapla();



    }


}
