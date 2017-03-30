package tr.com.mohammed.odevler.Kalitim.IsletimSistemleri.Apple;

/**
 * Created by Mohammed on 31/3/2017.
 */
public class MacOSXJaguar extends AppleOS {
    @Override
    public void OSName() {
        System.out.println("Mac OS X 10.2 Jaguar");
        super.OSName();
    }

    @Override
    public void releaseDate() {
        System.out.println("2002");
        super.releaseDate();
    }

    @Override
    public void programmingLanguage() {
        System.out.println("C++");
        super.programmingLanguage();
    }

}
