package tr.com.mohammed.odevler.Kalitim.IsletimSistemleri.Windows;

/**
 * Created by Mohammed on 31/3/2017.
 */
public class Windows10 extends WindowsOS{

    @Override
    public void OSName() {
        System.out.println("Windows 10");
        super.OSName();
    }

    @Override
    public void releaseDate() {
        System.out.println("2015");
        super.releaseDate();
    }

    @Override
    public void lineOfCode () {
        System.out.println("180 Milyon");
    }

    public void Cortana () {
        System.out.println("Cortana Özelliği vardır.");
    }


}
