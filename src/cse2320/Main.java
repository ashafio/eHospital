package cse2320;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Main {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

//        Class.forName("com.mysql.jdbc.Driver");
//        String url = "jdbc:mysql://localhost:3306/pass";
//        Connection con = DriverManager.getConnection(url,"root","");
//        Statement st = con.createStatement();

//        Class.forName("com.mysql.jdbc.Driver");
//        String url = "jdbc:mysql://localhost:3306/register";
//        Connection con = DriverManager.getConnection(url,"root","");
//        Statement st = con.createStatement();


//
//        st.executeUpdate(query);
//        st.close();
//        con.close();


        Request reqobj = new Request();
        reqobj.setVisible(true);

//        new Register(con,st);
//        Register reg = new Register(con, st);

//
//        Register reg = new Register();
//        reg.registercomponents(Connection con,Statement st);


    }
}
