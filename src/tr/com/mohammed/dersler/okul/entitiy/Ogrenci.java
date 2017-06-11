package tr.com.mohammed.dersler.okul.entitiy;


/**
 * Created by Mohammed on 11/6/2017.
 */
public class Ogrenci {

    int id;
    String name;

    public Ogrenci(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
