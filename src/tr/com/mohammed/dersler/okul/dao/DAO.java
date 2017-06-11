package tr.com.mohammed.dersler.okul.dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by Mohammed on 11/6/2017.
 */
public abstract class DAO {


    public final String URL = "jdbc:mysql://localhost:3306/okul";

    public final String userName = "root";

    public final String password = "root";

    public Connection createCon() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(URL, userName, password);

            if (con != null)
                System.out.println("baglandi");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }

}

