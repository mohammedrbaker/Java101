package tr.com.mohammed.odevler;

/**
 * Created by Mohammed on 23/2/2017.
 */


import java.util.Scanner;


public class AskerOdevi {

    /**
     * 4 günde bir nöbet tutan bir asker ilk nöbetini perşembe gününü 7.nöbetini ne zaman tutar.
     * Dinamik bir şekilde yazılacak ve nobetHesapla() , veriAl(), ekranaYazdır() foksiyonları ile çözülecek.
     * Örnek Çıktı:
     * Asker Kaç Günde Bir Nöbet Tutuyor:
     * 4//scanner ile alınacak
     * İlk Nöbeti(1-7) :
     * 4//scanner ile alınacak
     * Kaçıncı Nöbet:
     * 10 //scanner ile alınacak
     * Asker 10. nöbetini .....(String) günü tutar
     */

    public static void main(String[] args) {

        veriAl();

    }

    public static void veriAl() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Asker Kaç Günde Bir Nöbet Tutuyor: ");
        int gunNobetAraligi = scanner.nextInt();

        System.out.println("İlk Nöbeti(1-7) : ");
        int ilkNobetGunu = scanner.nextInt();
        System.out.println("Kaçıncı Nöbeti bulsun : ");
        int nobetBul = scanner.nextInt();

        nobetHesapla(gunNobetAraligi, ilkNobetGunu, nobetBul);

    }

    public static void nobetHesapla(int gunNobetAraligi, int ilkNobetGunu, int nobetBul) {

        Scanner scanner = new Scanner(System.in);
        int toplamGunler = gunNobetAraligi * (nobetBul - 1);
        ekranaYazdır(toplamGunler, ilkNobetGunu, nobetBul);

    }

    public static void ekranaYazdır(int toplamGunler, int ilkNobetGunu, int nobetBul) {

        int ilkGunUzeriEklenecekFark = (toplamGunler % 7);
        int haftaninGunu = (ilkNobetGunu + ilkGunUzeriEklenecekFark) % 7;

        // x günü
        if (haftaninGunu == 0)
            System.out.println("Asker " + nobetBul + ". " + "nöbetini " + "Pazar günü tutacaktır.");

            // x + 1 gün
        else if (haftaninGunu == 1)
            System.out.println("Asker " + nobetBul + ". " + "nöbetini " + "P.tesi günü tutacaktır.");

            // x + 2 gün
        else if (haftaninGunu == 2)
            System.out.println("Asker " + nobetBul + ". " + "nöbetini " + "Salı günü tutacaktır.");

            // x + 3 gün
        else if (haftaninGunu == 3)
            System.out.println("Asker " + nobetBul + ". " + "nöbetini " + "Çarşamba günü tutacaktır.");

            // x + 4 gün
        else if (haftaninGunu == 4)
            System.out.println("Asker " + nobetBul + ". " + "nöbetini " + "Perşembe günü tutacaktır.");

            // x + 5 gün
        else if (haftaninGunu == 5)
            System.out.println("Asker " + nobetBul + ". " + "nöbetini " + "Cuma günü tutacaktır.");

            // x + 6 gün
        else if (haftaninGunu == 6)
            System.out.println("Asker " + nobetBul + "." + "C.tesi günü tutacaktır.");

    }

}
