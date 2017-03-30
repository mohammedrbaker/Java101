package tr.com.mohammed.odevler.Kalitim.IsletimSistemleri.Linux;

/**
 * Created by Mohammed on 31/3/2017.
 */
public class FedoraOS extends LinuxOS {
    @Override
    public void OSName() {
        System.out.println("Fedora OS");
        super.OSName();
    }

    @Override
    public void releaseDate() {
        System.out.println("2003");
        super.releaseDate();
    }

    @Override

    public void lineOfCode() {
        System.out.println("150 Milyon");
    }

    @Override
    public void packageManagerType() {
        System.out.println("RPM");
    }

}
