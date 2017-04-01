package tr.com.mohammed.odevler.Kalitim;

import tr.com.mohammed.odevler.Kalitim.IsletimSistemleri.Apple.OSXElCapitan;
import tr.com.mohammed.odevler.Kalitim.IsletimSistemleri.Linux.LinuxOS;
import tr.com.mohammed.odevler.Kalitim.IsletimSistemleri.Linux.UbuntuOS;
import tr.com.mohammed.odevler.Kalitim.IsletimSistemleri.Windows.Windows10;
import tr.com.mohammed.odevler.Kalitim.IsletimSistemleri.Windows.Windows7;

/**
 * Created by Mohammed on 30/3/2017.
 */


public class MainOSClass {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("< - - - - - - - Windows7 - - - - - - - >");
        Windows7 windows7 = new Windows7();
        windows7.OSName();
        windows7.developerName();
        windows7.lineOfCode();
        System.out.println();

        System.out.println("< - - - - - - - Windows10 - - - - - - - >");
        Windows10 windows10 = new Windows10();
        windows10.Cortana();
        windows10.releaseDate();
        windows10.lineOfCode();
        System.out.println();

        System.out.println("< - - - - - - - Linux - - - - - - - >");
        LinuxOS linuxOS = new LinuxOS();
        linuxOS.developerName();
        System.out.println();
        UbuntuOS ubuntuOS = new UbuntuOS();
        ubuntuOS.OSName();
        ubuntuOS.developerName();
        ubuntuOS.linuxBaseType();
        ubuntuOS.packageManagerType();
        ubuntuOS.releaseDate();
        System.out.println();

        System.out.println("< - - - - - - - Apple - - - - - - - >");
        OSXElCapitan osxElCapitan = new OSXElCapitan();
        osxElCapitan.developerName();
        osxElCapitan.OSName();
        osxElCapitan.versionReleaseHistory();
        osxElCapitan.releaseDate();
        System.out.println();



        System.out.println("< - - - - - - - Ubuntu List using Array - - - - - - - >");
        String [] ubuntuDistroList = new String[2];
        ubuntuDistroList[0] = "Ubuntu 10.4";
        ubuntuDistroList[1] = "Ubuntu 10.10";

        UbuntuOS ubuntuDistroListFa = new UbuntuOS();
        ubuntuDistroListFa.ubuntuDistro(ubuntuDistroList);
        System.out.println();

    }

}
