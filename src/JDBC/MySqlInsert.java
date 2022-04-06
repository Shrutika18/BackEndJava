package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySqlInsert
{
    public static void main(String[] args) throws ClassNotFoundException, SQLException
    {
        String url = "jdbc:mysql://localhost:3306/employee";
        String username = "root";
        String password = "Shrutika@18";
        String query = "insert into employee values(?,?,?,?,?);";

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, password);
        PreparedStatement ps = con.prepareStatement(query);
        ps.setInt(1,4);
        ps.setString(2,"Sagar");
        ps.setInt(3,26);
        ps.setString(4,"sagar@gmail.com");
        ps.setString(5,"1234567898");
        int i = ps.executeUpdate();
        System.out.println(i +" row/s are affected");
        con.close();
    }
}
