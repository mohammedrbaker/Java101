package tr.com.mohammed.odevler.Kalitim.IsletimSistemleri.Linux;

/**
 * Created by Mohammed on 31/3/2017.
 */
public class UbuntuOS extends LinuxOS {

    @Override
    public void OSName() {
        System.out.println("Ubuntu");
        super.OSName();
    }

    @Override
    public void developerName() {
        System.out.println("Canonical Ltd.");
        //super.developerName();
    }

    @Override
    public void releaseDate() {
        System.out.println("2004");
        super.releaseDate();
    }

    @Override

    public void lineOfCode() {
        System.out.println("140 Milyon");
    }

    @Override
    public void packageManagerType() {
        System.out.println("DEB");
    }

    public void ubuntuDistro (String [] ubuntuDistroList) {

        for (int i = 0; i < ubuntuDistroList.length; i++) {
            String distroList =  ubuntuDistroList[i];
            System.out.println(distroList);


            
        }

    }

}
