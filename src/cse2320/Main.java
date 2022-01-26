package cse2320;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
//        String url = "jdbc:mysql://localhost:3306/pass";
//        Connection con = DriverManager.getConnection(url,"root","");
//        Statement st = con.createStatement();

        Request reqobj = new Request();
        reqobj.setVisible(true);

        Register reg = new Register();



    }
}
