/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package od.assignmentq4;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Nandan
 */
public class ProducerDetails implements Serializable
{
    public static final String FILENAME = "details.ser" ;
    ArrayList<Details> arrayOfObjects = new ArrayList<>() ;
    
    public ArrayList<Details> getArrayOfObjects()
    {
        return (ArrayList<Details>) arrayOfObjects ;
    }
    
    
    synchronized void populateObjects()
    {       
        Connection conn ;
        Statement st = null ;
        ResultSet res ;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/od_q4","root","");
            st = (Statement) conn.createStatement();
            
        }
        catch(ClassNotFoundException e)
        {
            e.printStackTrace();
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
           
        }
        
        try
        {
            String query = "SELECT NAME, PRICE, QUANTITY, TYPE FROM DETAILS " ;
            res = st.executeQuery(query);
            System.out.println("records from the database ");
            while(res.next())
            {
                Details object = new Details() ;
                object.setName(res.getString("name")) ;
                object.setPrice(String.valueOf(res.getInt("price")));
                object.setQuantity(String.valueOf(res.getInt("quantity"))) ;
                object.setType(res.getString("type"));
                System.out.println(object);
                arrayOfObjects.add(object) ;
                
            }
            
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
         
        // Serialization  
        try
        {    
            //Saving of object in a file 
            FileOutputStream fileOutput = new FileOutputStream(FILENAME); 
            ObjectOutputStream outputStream = new ObjectOutputStream(fileOutput); 
              
            // Method for serialization of object 
            outputStream.writeObject(arrayOfObjects); 
              
            outputStream.close(); 
            fileOutput.close(); 
              
            System.out.println("object has been serialized and stored in the disk"); 
  
        } 
        catch(IOException ex) 
        { 
            ex.printStackTrace();
            System.out.println("IOException is caught"); 
        }
        
                
        
        
        
        
        
    }
    
}
