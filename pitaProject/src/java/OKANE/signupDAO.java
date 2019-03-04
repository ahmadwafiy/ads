/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OKANE;

/**
 *
 * @author ahmdwafy
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import OKANE.DatabaseOKANE;
import java.util.ArrayList;




public class signupDAO {
    
     private Connection connection;
    private int result = 0;
    
   //define constructor
    public signupDAO() throws ClassNotFoundException
    {
        connection = DatabaseOKANE.getConnection();
    }
    
    public int addSignUp(signupBean signup)
    {
        try
        {
            String sqlDML = "INSERT INTO signup(username, email, pssword) VALUES (?, ?, ?)";
            
            //CREATE OBJECT 
            PreparedStatement preparedstatement = connection.prepareStatement(sqlDML);
            
            //assign value from booking bean to respective column
            preparedstatement.setString(1, signup.getUsername());
            preparedstatement.setString(2, signup.getEmail());
            preparedstatement.setString(3, signup.getPassword());
            
            //execute the query
            result = preparedstatement.executeUpdate();
        }
        catch (SQLException e)
                {
                   e.printStackTrace(); 
                }
        return result;
    }
    
    public signupBean getLatestSignUpInfo()
            
    {
        signupBean latestService = new signupBean();
        try
        {
           String sqlDML = "SELECT * FROM signup ORDER BY username DESC LIMIT 1";
           //create onject
           PreparedStatement preparedstatement = connection.prepareStatement(sqlDML);
           
           //store record ito resultset
           ResultSet rs = preparedstatement.executeQuery();
           
           //fetch the record
           while ( rs.next() )
           {
                 latestService.setUserID(rs.getInt("userid"));
               latestService.setEmail(rs.getString("email"));
               latestService.setUsername(rs.getString("username"));
               latestService.setPassword(rs.getString("pssword"));
           }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return latestService;
    }
    
    public signupBean[] getAllSignUpInfo()
    {
        signupBean[] signupRecords=null;
        try
        {
            
            ArrayList<signupBean> allServices=new ArrayList<signupBean>();
            
            String sqlDML="SELECT * FROM signup";
            
            PreparedStatement preparedStatement=connection.prepareStatement(sqlDML);
            
            ResultSet rs=preparedStatement.executeQuery();
            
            System.out.println("DAO Passing 1...!");
            
            while(rs.next())
            {
                signupBean SignUpBean=new signupBean();
                
                SignUpBean.setUserID(rs.getInt("userid"));
                SignUpBean.setEmail(rs.getString("email"));
                System.out.println("DAO Passing 2...!");
                SignUpBean.setUsername(rs.getString("username"));
                SignUpBean.setPassword(rs.getString("pssword"));
                
                allServices.add(SignUpBean);
            }
            
            System.out.println("DAO Passing 3...!");
            
            signupRecords=new signupBean[allServices.size()];
            
            
            allServices.toArray(signupRecords);
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return signupRecords;
    }
    
    public signupBean getSpecificServiceInfo(int userid)
    {
        signupBean specificService = new signupBean();
        
        try
        {
            String sqlDML = "SELECT * FROM signup WHERE userid = "+userid;
            
            PreparedStatement preparedStatement = connection.prepareStatement(sqlDML);
            
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next())
            {
                specificService.setUserID(rs.getInt("userid"));
                specificService.setEmail(rs.getString("email"));
                specificService.setUsername(rs.getString("username"));
                specificService.setPassword(rs.getString("pssword"));
                
            }
    }
        
        catch(SQLException e)
        {
            e.printStackTrace();
            
        }
        return specificService;
}
    
    public int updateSignup(signupBean signup)
    {
        if(signup.getUserID()==0)
        {
            result=0;
        }
        
        else
        {
            try
            {
                String sqlDML = "UPDATE signup SET username = ? ,email = ?, pssword = ?" + 
                        "WHERE userid = ? ";
                
                PreparedStatement preparedStatement = connection.prepareStatement(sqlDML);
                
                preparedStatement.setString(1, signup.getEmail());
                preparedStatement.setString(2, signup.getUsername());
                preparedStatement.setString(3, signup.getPassword());
             
                
                result = preparedStatement.executeUpdate();
            }
             catch(SQLException e)
        {
            e.printStackTrace();
            
        }
        }
        return result;
}
    public int deleteService(int UserID)
    {
         try
        {
            String sqlDML = "DELETE FROM signup WHERE username = ?";
            
            PreparedStatement preparedStatement = connection.prepareStatement(sqlDML);
            
            preparedStatement.setInt(1, UserID);
            
            result = preparedStatement.executeUpdate();
    }
         catch(SQLException e)
         {
             e.printStackTrace();
         }
         return result;
            
                
                
            }
    
    
    
    
}
