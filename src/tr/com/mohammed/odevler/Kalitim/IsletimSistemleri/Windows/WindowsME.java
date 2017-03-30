package tr.com.mohammed.odevler.Kalitim.IsletimSistemleri.Windows;

/**
 * Created by Mohammed on 31/3/2017.
 */
public class WindowsME extends WindowsOS{

    @Override
    public void OSName() {
        System.out.println("Windows ME");
        super.OSName();
    }

    @Override
    public void releaseDate() {
        System.out.println("2000");
        super.releaseDate();
    }
    @Override
    public void lineOfCode () {
        System.out.println("110 Milyon");
    }




}

