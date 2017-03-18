package tr.com.mohammed.odevler.IdeaKiloHesaplamaOdevi;

import java.util.Scanner;

/**
 * Created by Mohammed on 18/3/2017.
 */
public class IslemKilo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Cinsiyet (erkek veya kadın): ");
        String cinsiyetGir = scanner.nextLine();

        System.out.print("Kilonuz: ");
        int kiloGir = scanner.nextInt();

        System.out.print("Boyunuzu (CM): ");
        int boyGir = scanner.nextInt();

        Kilo kilo = new Kilo(cinsiyetGir, kiloGir, boyGir);
        kilo.IdealKiloHesapla ();



    }
}
