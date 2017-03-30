package tr.com.mohammed.odevler.Kalitim.IsletimSistemleri.Apple;

/**
 * Created by Mohammed on 31/3/2017.
 */
public class OSXElCapitan extends AppleOS{
    @Override
    public void OSName() {
        System.out.println("OS X 10.11 El Capitan");
        super.OSName();
    }

    @Override
    public void releaseDate() {
        System.out.println("2015");
        super.releaseDate();
    }

    @Override
    public void programmingLanguage() {
        System.out.println("C++/C");
        super.programmingLanguage();
    }

    public void versionReleaseHistory () {
        System.out.println("7 version until now");
    }


}
