package tr.com.mohammed.odevler.IdeaKiloHesaplamaOdevi;

/**
 * Created by Mohammed on 18/3/2017.
 */


/*

Kilo.class olacak ve bu kilo class'ında yapılandırıcında (String cinsiyet,int kilo,int boy) alınacak
ve class içersinde bulunan String cinsiye,int kilo,int boy bu değişkenlere atanacak.

kilo.class içersinde ideal kilo hesapla dediğinizde cinsiyet erkek'se
boy ve kilo arasında + - 10 farktan azsa ideal kilo olduğunu bildirecek.
kadın'sa boy ve kilo arasında + - 5 farktan azsa ideal kilo olduğunu bildirecek.
Az olması durumda zayıfsınız diyecek. Yüksek olması durumunda kilosunuz diyecek.
 */
public class Kilo {

    String cinsiyet;
    int kilo;
    int boy;

    public Kilo(String cinsiyet, int kilo, int boy) {

        this.cinsiyet = cinsiyet;
        this.kilo = kilo;
        this.boy = boy;
    }

    void IdealKiloHesapla() {

        int idealKilo = this.boy - this.kilo;

        switch (this.cinsiyet) {
            case "erkek":

                if (idealKilo > 10) {
                    System.out.println("Erkek olarak fazla kilolusunuz");
                } else {
                    System.out.println("Erkek olarak ideal Kilodasınız");
                }

                break;


            case "kadın":

                if (idealKilo > 5) {
                    System.out.println("Kadın olarak fazla kilolusunuz");
                } else {
                    System.out.println("Kadın olarak ideal Kilodasınız");
                }

                break;
        }


 /*
        if(cinsiyet=="erkek") {

            if (idealKilo > 10 ) {
                System.out.println("Erkek - Fazla kilolusunuz");
        }
            else {
                System.out.println("Erkek - İdeal Kilodasınız");
            }
        }

        else  {

            if (idealKilo > 5 ) {
                System.out.println("Kadın - Fazla kilolusunuz");
            }
            else {
                System.out.println("Kadın - İdeal Kilodasınız");
            }
        }


*/
     /*

        if (this.cinsiyet=="erkek" && idealKilo > 10 ) {
            System.out.println("Erkek - Fazla kilolusunuz");

        }

        else if  (this.cinsiyet=="erkek" && idealKilo < 10 ){
            System.out.println("Erkek - İdeal Kilodasınız");
        }

        else if (this.cinsiyet=="kadın" && idealKilo > 5 ) {
            System.out.println("Kadın - Fazla kilolusunuz");

        }

        else if (this.cinsiyet=="kadın" && idealKilo < 5 ){
            System.out.println("İdeal Kilodasınız - zayıfsınız");
        }
    */


    }
}
