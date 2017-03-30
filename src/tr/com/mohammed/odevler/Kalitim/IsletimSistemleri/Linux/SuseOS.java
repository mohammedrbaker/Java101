package tr.com.mohammed.odevler.Kalitim.IsletimSistemleri.Linux;

/**
 * Created by Mohammed on 31/3/2017.
 */
public class SuseOS extends LinuxOS {
    @Override
    public void OSName() {
        System.out.println("openSUSE Project");
        super.OSName();
    }

    @Override
    public void releaseDate() {
        System.out.println("2005");
        super.releaseDate();
    }

    @Override

    public void lineOfCode() {
        System.out.println("180 Milyon");
    }

    @Override
    public void packageManagerType() {
        System.out.println("RPM");
    }

    public void country () {
        System.out.println("Germany");
    }

}
