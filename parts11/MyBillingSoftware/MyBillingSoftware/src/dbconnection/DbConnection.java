/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Shrikant
 */
public class DbConnection
{
    static Connection con;
    public static Connection getConnect()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql:///billing_software","root","shrikant@123");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error : "+e);
        }
        return con;
    }
}
