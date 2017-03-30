package tr.com.mohammed.odevler.Kalitim.IsletimSistemleri.Windows;

/**
 * Created by Mohammed on 31/3/2017.
 */
public class WindowsXP extends WindowsOS{

    @Override
    public void OSName() {
        System.out.println("Windows XP");
        super.OSName();
    }

    @Override
    public void releaseDate() {
        System.out.println("2001");
        super.releaseDate();
    }
    @Override
    public void lineOfCode () {
        System.out.println("100 Milyon");
    }
}


