/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OKANE;
import java.io.IOException;
import java.io.InputStream;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import OKANE.DatabaseOKANE;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Blob;
import java.io.InputStream;
import java.io.OutputStream;
import javax.servlet.annotation.MultipartConfig;
import java.sql.DriverManager;
import javax.servlet.ServletException;
import java.io.FileNotFoundException;

/**
 *
 * @author User
 */
public class uploadDAO {
    
    private Connection myConnection;
    private int result = 0;
    
    
      public uploadDAO() throws ClassNotFoundException
    {
        myConnection = DatabaseOKANE.getConnection();
    }
      
    
      
      
    
      //add rental booking into table carrental
       public int addAds(advertisementBean ads) throws ClassNotFoundException, FileNotFoundException
    {
        try
        {
            myConnection = DatabaseOKANE.getConnection();
            
            String sqlDML = "INSERT INTO advertisement(category,photo,adsTitle,adsDesc,adsName,price,email,phoneNo,userid) VALUES (?,?,?,?,?,?,?,?,?)";
            //accountID dilkeluarkan dlu ni
            
            //create connection within  sql statements
            PreparedStatement preparedStatement = myConnection.prepareStatement(sqlDML);
            
        //grab from form into database through beans
                preparedStatement.setInt(1, ads.getCategory());
                
                FileInputStream adsPhoto = new  FileInputStream(ads.getPhoto() );
                preparedStatement.setBlob(2, adsPhoto);
                
                preparedStatement.setString(3, ads.getAdsTitle());
                preparedStatement.setString(4, ads.getAdsDesc()); 
                preparedStatement.setString(5, ads.getName());
                preparedStatement.setString(6, ads.getPrice());
                preparedStatement.setString(7, ads.getEmail());
                preparedStatement.setString(8, ads.getPhoneno());
                
                preparedStatement.setInt(9, ads.getUserID());
                
           
           //execute query
            result = preparedStatement.executeUpdate();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return result;
    }
       
        

  public advertisementBean getLatestAdsInfo() throws IOException
     
          
    {
             
        //userName here  stsnd for owner of the business not the ads
        advertisementBean latestAds = new advertisementBean();
        try
        {
           String sqlDML = "SELECT * FROM advertisement ORDER BY adsID DESC LIMIT 1";
           //create onject
           PreparedStatement preparedstatement = myConnection.prepareStatement(sqlDML);
           
           //store record ito resultset
           ResultSet rs = preparedstatement.executeQuery();
           
           //fetch the record and assign into advsertisement beans (from databse)
           while ( rs.next() )
           {
               latestAds.setAdsID(rs.getInt("adsID"));
               latestAds.setAdsTitle(rs.getString("adsTitle"));
               latestAds.setAdsDesc(rs.getString("adsDesc"));
               latestAds.setPrice(rs.getString("price"));
               latestAds.setName(rs.getString("adsName"));
               latestAds.setEmail(rs.getString("email"));
               latestAds.setPhoneno(rs.getString("phoneNo"));
               latestAds.setCategory(rs.getInt("category"));
                 
               Blob photoBlob = rs.getBlob("photo");
               
                InputStream inputStream = null;
                OutputStream outputStream = null;
                
                try {
                        // read this file into InputStream
                        inputStream = photoBlob.getBinaryStream();

                        // write the inputStream to a FileOutputStream (dari database)
                        outputStream = new FileOutputStream(new File("C:/Users/User/Desktop/pitaProject/pitaProject/web/adsImages1/"+rs.getInt("adsID")+".jpeg"),false);

                        int read = -1;
                        byte[] bytes = new byte[10000000];

                        while ((read = inputStream.read(bytes)) != -1) {
                                outputStream.write(bytes, 0, read);
                        }
                            //try baru 2.35am 7hb 5 2018
                         latestAds.setPhoto(new File(rs.getInt("adsID")+".jpeg"));
                         
                        inputStream.close();
                        outputStream.close();

                } catch (IOException e) {
                        e.printStackTrace();
                }
           }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return latestAds;
    }

  //get all items (listing according to posster)
  public advertisementBean[] getAllAdsInfo(int userid)throws FileNotFoundException, SQLException, IOException
    {
       advertisementBean[] adsRecords = null;
       String imgName = "out";
       int imgNamePlus = 1;
        try
        {
            
            ArrayList<advertisementBean> allAds=new ArrayList <advertisementBean>();    
            String sqlDML="SELECT * FROM advertisement WHERE userid = "+userid;
            
            PreparedStatement preparedStatement=myConnection.prepareStatement(sqlDML);
            
            ResultSet rs=preparedStatement.executeQuery();
            
            System.out.println("DAO Passing 1...!");
            
            while(rs.next())
            {
                advertisementBean adsBean=new advertisementBean();
                
                adsBean.setAdsID(rs.getInt("adsID"));
                adsBean.setCategory(rs.getInt("category"));
                System.out.println("DAO Passing 2...!");
                adsBean.setAdsTitle(rs.getString("adsTitle"));
                adsBean.setAdsDesc(rs.getString("adsDesc"));
                adsBean.setName(rs.getString("adsName"));
                adsBean.setPrice(rs.getString("price"));             
                adsBean.setEmail(rs.getString("email"));
                adsBean.setPhoneno(rs.getString("phoneNo"));
                Blob photoBlob = rs.getBlob("photo");
                
                
                 InputStream inputStream = null;
                OutputStream outputStream = null;
                
                 try {
                        // read this file into InputStream
                        inputStream = photoBlob.getBinaryStream();

                        // write the inputStream to a FileOutputStream
                        outputStream = new FileOutputStream(new File("C:/Users/User/Desktop/pitaProject/pitaProject/web/adsImages1/"+rs.getInt("adsID")+".jpeg"),false);

                        int read = -1;
                        byte[] bytes = new byte[10000000];

                        while ((read = inputStream.read(bytes)) != -1) {
                                outputStream.write(bytes, 0, read);
                        }
                        
                        int pluster = 0;
                        int image = rs.getInt("adsID")+pluster;
                       
                            //tanya kema balik pasal loop 
                         adsBean.setPhoto(new File(image+".jpeg"));
                         pluster++;
                         inputStream.close();
                         outputStream.close();

                } catch (IOException e) {
                        e.printStackTrace();
                }
                               
                
                allAds.add(adsBean);
            }
            
            System.out.println("DAO Passing 3...!");
            
            adsRecords=new advertisementBean[allAds.size()];
            
            
            allAds.toArray(adsRecords);
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return adsRecords;
    }
  ///////////////////////////////////////-----------display according to cAtegory-----------/////////////////////
  
  /////////---------------------------------item----------------------------------------------//////////////////////////
  public advertisementBean[] getAllAdsItem()throws FileNotFoundException, SQLException, IOException
    {
       advertisementBean[] adsRecords = null;
       String imgName = "out";
       int imgNamePlus = 1;
        try
        {
            
            ArrayList<advertisementBean> allAds=new ArrayList <advertisementBean>();    
            String sqlDML="SELECT * FROM advertisement WHERE category = 1";
            
            PreparedStatement preparedStatement=myConnection.prepareStatement(sqlDML);
            
            ResultSet rs=preparedStatement.executeQuery();
            
            System.out.println("DAO Passing 1...!");
            
            while(rs.next())
            {
                advertisementBean adsBean=new advertisementBean();
                
                adsBean.setAdsID(rs.getInt("adsID"));
                adsBean.setCategory(rs.getInt("category"));
                System.out.println("DAO Passing 2...!");
                adsBean.setAdsTitle(rs.getString("adsTitle"));
                adsBean.setAdsDesc(rs.getString("adsDesc"));
                adsBean.setName(rs.getString("adsName"));
                adsBean.setPrice(rs.getString("price"));             
                adsBean.setEmail(rs.getString("email"));
                adsBean.setPhoneno(rs.getString("phoneNo"));
                Blob photoBlob = rs.getBlob("photo");
                
                
                 InputStream inputStream = null;
                OutputStream outputStream = null;
                
                 try {
                        // read this file into InputStream
                        inputStream = photoBlob.getBinaryStream();

                        // write the inputStream to a FileOutputStream
                        outputStream = new FileOutputStream(new File("C:/Users/User/Desktop/pitaProject/pitaProject/web/adsImages1/"+rs.getInt("adsID")+".jpeg"),false);

                        int read = -1;
                        byte[] bytes = new byte[10000000];

                        while ((read = inputStream.read(bytes)) != -1) {
                                outputStream.write(bytes, 0, read);
                        }
                        
                        int pluster = 0;
                        int image = rs.getInt("adsID")+pluster;
                       
                            //tanya kema balik pasal loop 
                         adsBean.setPhoto(new File(image+".jpeg"));
                         pluster++;
                         inputStream.close();
                         outputStream.close();

                } catch (IOException e) {
                        e.printStackTrace();
                }
                               
                
                allAds.add(adsBean);
            }
            
            System.out.println("DAO Passing 3...!");
            
            adsRecords=new advertisementBean[allAds.size()];
            
            
            allAds.toArray(adsRecords);
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return adsRecords;
    }
  
  
  
   /////////---------------------------------trans----------------------------------------------//////////////////////////
  
  public advertisementBean[] getAllAdsTrans()throws FileNotFoundException, SQLException, IOException
    {
       advertisementBean[] adsRecords = null;
       String imgName = "out";
       int imgNamePlus = 1;
        try
        {
            
            ArrayList<advertisementBean> allAds=new ArrayList <advertisementBean>();    
            String sqlDML="SELECT * FROM advertisement WHERE category = 3";
            
            PreparedStatement preparedStatement=myConnection.prepareStatement(sqlDML);
            
            ResultSet rs=preparedStatement.executeQuery();
            
            System.out.println("DAO Passing 1...!");
            
            while(rs.next())
            {
                advertisementBean adsBean=new advertisementBean();
                
                adsBean.setAdsID(rs.getInt("adsID"));
                adsBean.setCategory(rs.getInt("category"));
                System.out.println("DAO Passing 2...!");
                adsBean.setAdsTitle(rs.getString("adsTitle"));
                adsBean.setAdsDesc(rs.getString("adsDesc"));
                adsBean.setName(rs.getString("adsName"));
                adsBean.setPrice(rs.getString("price"));             
                adsBean.setEmail(rs.getString("email"));
                adsBean.setPhoneno(rs.getString("phoneNo"));
                Blob photoBlob = rs.getBlob("photo");
                
                
                 InputStream inputStream = null;
                OutputStream outputStream = null;
                
                 try {
                        // read this file into InputStream
                        inputStream = photoBlob.getBinaryStream();

                        // write the inputStream to a FileOutputStream
                        outputStream = new FileOutputStream(new File("C:/Users/User/Desktop/pitaProject/pitaProject/web/adsImages1/"+rs.getInt("adsID")+".jpeg"),false);

                        int read = -1;
                        byte[] bytes = new byte[10000000];

                        while ((read = inputStream.read(bytes)) != -1) {
                                outputStream.write(bytes, 0, read);
                        }
                        
                        int pluster = 0;
                        int image = rs.getInt("adsID")+pluster;
                       
                            //tanya kema balik pasal loop 
                         adsBean.setPhoto(new File(image+".jpeg"));
                         pluster++;
                         inputStream.close();
                         outputStream.close();

                } catch (IOException e) {
                        e.printStackTrace();
                }
                               
                
                allAds.add(adsBean);
            }
            
            System.out.println("DAO Passing 3...!");
            
            adsRecords=new advertisementBean[allAds.size()];
            
            
            allAds.toArray(adsRecords);
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return adsRecords;
    }
  
 /////////////////////////////////----------end getalltrans()------////////////////////////////////////////////////////////// 
  
  /////////---------------------------------Services----------------------------------------------//////////////////////////
  
  public advertisementBean[] getAllAdsService()throws FileNotFoundException, SQLException, IOException
    {
       advertisementBean[] adsRecords = null;
       String imgName = "out";
       int imgNamePlus = 1;
        try
        {
            
            ArrayList<advertisementBean> allAds=new ArrayList <advertisementBean>();    
            String sqlDML="SELECT * FROM advertisement WHERE category = 2";
            
            PreparedStatement preparedStatement=myConnection.prepareStatement(sqlDML);
            
            ResultSet rs=preparedStatement.executeQuery();
            
            System.out.println("DAO Passing 1...!");
            
            while(rs.next())
            {
                advertisementBean adsBean=new advertisementBean();
                
                adsBean.setAdsID(rs.getInt("adsID"));
                adsBean.setCategory(rs.getInt("category"));
                System.out.println("DAO Passing 2...!");
                adsBean.setAdsTitle(rs.getString("adsTitle"));
                adsBean.setAdsDesc(rs.getString("adsDesc"));
                adsBean.setName(rs.getString("adsName"));
                adsBean.setPrice(rs.getString("price"));             
                adsBean.setEmail(rs.getString("email"));
                adsBean.setPhoneno(rs.getString("phoneNo"));
                Blob photoBlob = rs.getBlob("photo");
                
                
                 InputStream inputStream = null;
                OutputStream outputStream = null;
                
                 try {
                        // read this file into InputStream
                        inputStream = photoBlob.getBinaryStream();

                        // write the inputStream to a FileOutputStream
                        outputStream = new FileOutputStream(new File("C:/Users/User/Desktop/pitaProject/pitaProject/web/adsImages1/"+rs.getInt("adsID")+".jpeg"),false);

                        int read = -1;
                        byte[] bytes = new byte[10000000];

                        while ((read = inputStream.read(bytes)) != -1) {
                                outputStream.write(bytes, 0, read);
                        }
                        
                        int pluster = 0;
                        int image = rs.getInt("adsID")+pluster;
                       
                            //tanya kema balik pasal loop 
                         adsBean.setPhoto(new File(image+".jpeg"));
                         pluster++;
                         inputStream.close();
                         outputStream.close();

                } catch (IOException e) {
                        e.printStackTrace();
                }
                               
                
                allAds.add(adsBean);
            }
            
            System.out.println("DAO Passing 3...!");
            
            adsRecords=new advertisementBean[allAds.size()];
            
            
            allAds.toArray(adsRecords);
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return adsRecords;
    }
  
  /////////---------------------------------Services----------------------------------------------////////////////////////// 
  
  
  
  
  
  
  //get all ads info (MANAGER)
    public advertisementBean[] getAllAdsInfo()throws FileNotFoundException, SQLException, IOException
    {
       advertisementBean[] adsRecords = null;
       String imgName = "out";
       int imgNamePlus = 1;
        try
        {
            
            ArrayList<advertisementBean> allAds=new ArrayList <advertisementBean>();    
            String sqlDML="SELECT * FROM advertisement ORDER BY adsID";
            
            PreparedStatement preparedStatement=myConnection.prepareStatement(sqlDML);
            
            ResultSet rs=preparedStatement.executeQuery();
            
            System.out.println("DAO Passing 1...!");
            
            while(rs.next())
            {
                advertisementBean adsBean=new advertisementBean();
                
                adsBean.setAdsID(rs.getInt("adsID"));
                adsBean.setCategory(rs.getInt("category"));
                System.out.println("DAO Passing 2...!");
                adsBean.setAdsTitle(rs.getString("adsTitle"));
                adsBean.setAdsDesc(rs.getString("adsDesc"));
                adsBean.setName(rs.getString("adsName"));
                adsBean.setPrice(rs.getString("price"));             
                adsBean.setEmail(rs.getString("email"));
                adsBean.setPhoneno(rs.getString("phoneNo"));
                Blob photoBlob = rs.getBlob("photo");
                
                
                 InputStream inputStream = null;
                OutputStream outputStream = null;
                
                 try {
                        // read this file into InputStream
                        inputStream = photoBlob.getBinaryStream();

                        // write the inputStream to a FileOutputStream
                        outputStream = new FileOutputStream(new File("C:/Users/User/Desktop/pitaProject/pitaProject/web/adsImages1/"+rs.getInt("adsID")+".jpeg"),false);

                        int read = -1;
                        byte[] bytes = new byte[10000000];

                        while ((read = inputStream.read(bytes)) != -1) {
                                outputStream.write(bytes, 0, read);
                        }
                        
                        int pluster = 0;
                        int image = rs.getInt("adsID")+pluster;
                       
                            //tanya kema balik pasal loop 
                         adsBean.setPhoto(new File(image+".jpeg"));
                         pluster++;
                         inputStream.close();
                         outputStream.close();

                } catch (IOException e) {
                        e.printStackTrace();
                }
                               
                
                allAds.add(adsBean);
            }
            
            System.out.println("DAO Passing 3...!");
            
            adsRecords = new advertisementBean[allAds.size()];
            
            
            allAds.toArray(adsRecords);
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return adsRecords;
    }
  
  
  
  
  
   public advertisementBean getSpecificAdsInfo(int adsId)
    {
        advertisementBean specificAds = new advertisementBean();
        
        try
        {   
             //Construct SQL query to retrieve record..
            String sqlDML = "SELECT * FROM advertisement WHERE adsID ='"+adsId+"'";
            
            //Create object for PreparedStatement
            PreparedStatement preparedStatement = myConnection.prepareStatement(sqlDML);
            
            
            
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next())
            {
                advertisementBean adsBean=new advertisementBean();
                
                specificAds.setAdsID(rs.getInt("adsID"));
                specificAds.setCategory(rs.getInt("category"));
                
                System.out.println("DAO Passing 2...!");
                
                specificAds.setAdsTitle(rs.getString("adsTitle"));
                specificAds.setAdsDesc(rs.getString("adsDesc"));
                specificAds.setName(rs.getString("adsName"));
                specificAds.setPrice(rs.getString("price"));             
                specificAds.setEmail(rs.getString("email"));
                specificAds.setPhoneno(rs.getString("phoneNo"));
                
               
                Blob photoBlob = rs.getBlob("photo");
                
                
                 InputStream inputStream = null;
                OutputStream outputStream = null;
                
                 try {
                        // read this file into InputStream
                        inputStream = photoBlob.getBinaryStream();

                        // write the inputStream to a FileOutputStream
                        outputStream = new FileOutputStream(new File("C:/Users/User/Desktop/pitaProject/pitaProject/web/adsImages1/updateItem.jpeg"),false);

                        int read = -1;
                        byte[] bytes = new byte[10000000];

                        while ((read = inputStream.read(bytes)) != -1) {
                                outputStream.write(bytes, 0, read);
                        }
                        
                        int pluster = 0;
                        int image = rs.getInt("adsID")+pluster;
                       
                            //tanya kema balik pasal loop 
                         adsBean.setPhoto(new File("updateItem.jpeg"));

                         inputStream.close();
                         outputStream.close();

                      } catch (IOException e) 
                         {
                             e.printStackTrace();
                         }
                 specificAds.setUserID(rs.getInt("userid"));          
            }  
              
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return specificAds;
      
    }
  
   
   public advertisementBean getSpecificAdsInfo2(int adsId)
    {
        advertisementBean specificAds = new advertisementBean();
        
        try
        {
            String sqlDML = "SELECT * FROM advertisement WHERE adsID ='"+adsId+"'";
            
            PreparedStatement preparedStatement = myConnection.prepareStatement(sqlDML);
            
            
            
            ResultSet rs = preparedStatement.executeQuery();
            
            while(rs.next())
            {
                advertisementBean adsBean=new advertisementBean();
                
                specificAds.setAdsID(rs.getInt("adsID"));
                specificAds.setCategory(rs.getInt("category"));
                System.out.println("DAO Passing 2...!");
                specificAds.setAdsTitle(rs.getString("adsTitle"));
                System.out.println("ads title = "+rs.getString("adsTitle"));
                specificAds.setAdsDesc(rs.getString("adsDesc"));
                specificAds.setName(rs.getString("adsName"));
                specificAds.setPrice(rs.getString("price"));             
                specificAds.setEmail(rs.getString("email"));
                specificAds.setPhoneno(rs.getString("phoneNo"));
                Blob photoBlob = rs.getBlob("photo");
                
                
                 InputStream inputStream = null;
                OutputStream outputStream = null;
                
                 try {
                        // read this file into InputStream
                        inputStream = photoBlob.getBinaryStream();

                        // write the inputStream to a FileOutputStream
                        outputStream = new FileOutputStream(new File("C:/Users/User/Desktop/pitaProject/pitaProject/web/adsImages1/"+adsId+".jpeg"),false);

                        int read = -1;
                        byte[] bytes = new byte[10000000];

                        while ((read = inputStream.read(bytes)) != -1) {
                                outputStream.write(bytes, 0, read);
                        }
                        
                        int pluster = 0;
                        int image = rs.getInt("adsID")+pluster;
                       
                            //tanya kema balik pasal loop 
                         adsBean.setPhoto(new File("updateItem.jpeg"));
                        // pluster++;
                         inputStream.close();
                         outputStream.close();

                      } catch (IOException e) {
                          e.printStackTrace();
                   }
                 //ni kma tkda
                  specificAds.setUserID(rs.getInt("userid"));             
            }  
              
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
        return specificAds;
      
    }
   
   
   
   
   //update logic
    public int updateAds(advertisementBean ads)throws FileNotFoundException
    {
        if(ads.getAdsID()==0)
        {
            result=0;
        }
        
        else
        {
            try
            {
                String sqlDML = "UPDATE advertisement SET category = ? , photo = ? , adsTitle = ? , adsDesc = ? , adsName = ? ,price = ?, email = ? , phoneNo = ? , userid = ? " + 
                        "WHERE adsID = ? ";
                
                PreparedStatement preparedStatement = myConnection.prepareStatement(sqlDML);
                
               preparedStatement.setInt(1, ads.getCategory());
                
                FileInputStream img = new FileInputStream(ads.getPhoto());
                preparedStatement.setBlob(2, img);
                preparedStatement.setString(3, ads.getAdsTitle());
                preparedStatement.setString(4, ads.getAdsDesc());
                preparedStatement.setString(5, ads.getName());
                preparedStatement.setString(6, ads.getPrice());
                preparedStatement.setString(7, ads.getEmail());
                preparedStatement.setString(8, ads.getPhoneno());
                preparedStatement.setInt(9, ads.getUserID());
                preparedStatement.setInt(10, ads.getAdsID());
                
                
                
                
                result = preparedStatement.executeUpdate();
            }
             catch(SQLException e)
        {
            e.printStackTrace();
            
        }
        }
        return result;
} 
  
  
  public int deleteAds(int adsID)
    {
         try
        {
            String sqlDML = "DELETE FROM advertisement WHERE adsID = ?";
            
            PreparedStatement preparedStatement = myConnection.prepareStatement(sqlDML);
            
            preparedStatement.setLong(1, adsID);
            
            result = preparedStatement.executeUpdate();
    }
         catch(SQLException e)
         {
             e.printStackTrace();
         }
         return result;
            
                
                
            }
  
//----------------- user DAO ------------------------- user DAO ------------------  


  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
