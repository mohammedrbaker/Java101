package tr.com.mohammed.dersler.okul;

import tr.com.mohammed.dersler.okul.dao.OkulDAO;
import tr.com.mohammed.dersler.okul.entitiy.Ogrenci;

import java.util.List;

/**
 * Created by Mohammed on 11/6/2017.
 */
public class Islem {

    public static void main(String[] args) {
        OkulDAO dao = new OkulDAO();
        String SQl = "SELECT * FROM OGRENCI";
        List<Ogrenci> ogrenciList = dao.read(SQl);

        for (Ogrenci ogrenci : ogrenciList) {
            System.out.println(ogrenci.getName());
        }


    }
}
