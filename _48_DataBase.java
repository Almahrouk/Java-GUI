import java.sql.*;

//import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class _48_DataBase {
    public static void main(String[] args) {
        try {
            // create a connection with database
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","eeee1992");
            System.out.println("Database Connection Success");
            // SQL Statement
            Statement stm=con.createStatement();
            ResultSet res= stm.executeQuery("select * from users");
            // stm.close();
            while (res.next()) {
                String st=res.getString("name");
                System.out.println(st);
            }
            res= stm.executeQuery("select * from users where name like 'MA%'");
            while (res.next()) {
                String st=res.getString("name");
                System.out.println(st);
            }
            // Insert to table
            stm.execute("insert into users values (\"Ahmad\")");
            // update values in table
            stm.executeUpdate("update users set name= \"Mazen Abuzaher\" where name=\"Mazen\"");
            //Delete record
            stm.executeUpdate("delete from users where name=\"Ahmad\"");
            res= stm.executeQuery("select * from users");
            while (res.next()) {
                String st=res.getString("name");
                System.out.println(st);
            }
            // close statement
            stm.close();
        }
        catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}