/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OKANE;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DatabaseOKANE {
    
     private static Connection myConnection = null;
    private static String myURL = "jdbc:mysql://localhost:3306/OKANE";
    
    public static Connection getConnection() throws ClassNotFoundException
    {
        if(myConnection != null)
        {
          return myConnection;  
        }
        else
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                myConnection = DriverManager.getConnection(myURL,"root","sayamaumasuk45");
            }
            catch (SQLException e)
            {
                e.printStackTrace();
            }
        return myConnection;
    }
    
    public static void closeConnection() throws ClassNotFoundException
    {
        try
        {
            myConnection.close();
            myConnection=null;
        }
        catch (SQLException e)
            {
                e.printStackTrace();
            }
    }
}
