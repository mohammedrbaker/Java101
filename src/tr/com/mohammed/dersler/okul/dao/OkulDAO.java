package tr.com.mohammed.dersler.okul.dao;

import tr.com.mohammed.dersler.okul.entitiy.Ogrenci;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mohammed on 11/6/2017.
 */
public class OkulDAO extends DAO {

    public List<Ogrenci> read(String SQL) {
        List<Ogrenci> ogreciList = new ArrayList<>();
        Connection con = createCon();
        Statement statement = null;
        try {
            statement = con.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        ResultSet rs = null;
        try {
            rs = statement.executeQuery(SQL);
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                Ogrenci ogrenci = new Ogrenci(id, name);
                ogreciList.add(ogrenci);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ogreciList;
    }


    public void insert(String SQL) {

    }

    public void update(String SQL) {

    }

    public void delete(String SQL) {

    }

    public void create(String SQL) {

    }

}
