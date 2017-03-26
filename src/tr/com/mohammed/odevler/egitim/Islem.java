package tr.com.mohammed.odevler.egitim;

/**
 * Created by Mohammed on 26/3/2017.
 */
public class Islem {
    public static void main(String[] args) {
        Ogretmen mustafaHoca = new Ogretmen();
        mustafaHoca.setTC(123456);
        mustafaHoca.setName("Mustafa Hoca");

        Ogretmen ahmetHoca = new Ogretmen();
        ahmetHoca.setTC(987654);
        ahmetHoca.setName("Ahmet Hoca");

        Ogrenci aliOgrenci = new Ogrenci();
        aliOgrenci.setTC(223344);
        aliOgrenci.setOgrenciNo("A 123456");
        aliOgrenci.setName("Ali");

        Okul okul = new Okul();
        okul.sinif(mustafaHoca, aliOgrenci);
        okul.ogretmenlerOdasi(ahmetHoca);

        Ogretmen[] ogretmenArray = new Ogretmen[2];
        ogretmenArray[0] = mustafaHoca;
        ogretmenArray[1] = ahmetHoca;
        okul.ogretmenlerOdasi(ogretmenArray);

    }
}
