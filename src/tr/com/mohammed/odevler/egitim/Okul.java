package tr.com.mohammed.odevler.egitim;

/**
 * Created by Mohammed on 26/3/2017.
 */
public class Okul {
    public void sinif(Ogretmen ogretmen, Ogrenci ogrenci) {
        System.out.println("< - - - - - - - Çift Parametreli Değişken - - - - - - - - >");
        System.out.println("Sınıfta: ");
        System.out.println("Öğretmen TC: " + ogretmen.getTC());
        System.out.println("Öğretmen Adı: " + ogretmen.getName());
        System.out.println();
        System.out.println("Öğrenci TC: " + ogrenci.getTC());
        System.out.println("Öğrenci No: " + ogrenci.getOgrenciNo());
        System.out.println("Öğrenci Adı: " + ogrenci.getName());
        System.out.println();

    }

    public void ogretmenlerOdasi(Ogretmen ogretmen) {
        System.out.println("< - - - - - - - Tek Parametreli Değişken - - - - - - - - >");
        System.out.println();
        System.out.println("Öğretmenler Odasında: ");
        System.out.println("Öğretmen TC: " + ogretmen.getTC());
        System.out.println("Öğretmen Adı: " + ogretmen.getName());
        System.out.println();


    }

    public void ogretmenlerOdasi(Ogretmen[] ogretmenArray) {

        System.out.println("< - - - - - - - Öğretmeni Array - - - - - - - - >");
        System.out.println();

        for (int i = 0; i < ogretmenArray.length; i++) {
            Ogretmen ogretmen = ogretmenArray[i];
            System.out.println("Öğretmen Adı: " + ogretmen.getName());


        }
    }


}
