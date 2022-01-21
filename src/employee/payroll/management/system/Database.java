package employee.payroll.management.system;
import java.sql.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import javax.swing.*;
import javax.swing.JOptionPane;


public class Database {
    
    //Connection myConn=null;
    
    public static Connection java_db(){
        try {
           Class.forName("com.mysql.jdbc.Driver");
           Connection myConn=DriverManager.getConnection("jdbc:mysql://localhost/mydatabase","root","");
            return myConn;
        } catch (ClassNotFoundException|SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
	
}