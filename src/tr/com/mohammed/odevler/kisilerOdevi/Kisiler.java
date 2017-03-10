package tr.com.mohammed.odevler.kisilerOdevi;

import java.util.Scanner;

/**
 * Created by Mohammed on 10/3/2017.
 */

public class Kisiler {

    int id;
    String isim;
    int dogumYili;

    public void yasHesapla() {
        int yas = 2017 - getDogumYili();
        System.out.println("yaşınız: "+ yas );
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim() {
        this.isim = isim;
    }

    public int getDogumYili() {
        return dogumYili;
    }

    public void setDogumYili() {
        System.out.print("Doğum yılınızı girin: ");
        Scanner scanner = new Scanner(System.in);
        this.dogumYili = scanner.nextInt();
    }



}
