/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package od.assignmentq4;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Nandan
 */
public class ConsumerDetails 
{
    private static final String FILENAME = "details.ser" ;
    ArrayList<Details> arrayOfObjects = new ArrayList<>() ;
    
    synchronized void calculate()
    {
        
        try 
        { 
  
            // Reading the object from a file 
            FileInputStream fileinput = new FileInputStream(FILENAME); 
            
            ObjectInputStream inputObject = new ObjectInputStream(fileinput); 
  
            // Method for deserialization of object 
            arrayOfObjects = (ArrayList<Details>)inputObject.readObject(); 
            
            inputObject.close(); 
            fileinput.close(); 
            System.out.println("Object has been deserialized."); 
            
  
        } 
        catch (IOException ex)
        { 
            System.out.println("IOException is caught"); 
        } 
  
        catch (ClassNotFoundException ex) 
        { 
            System.out.println("ClassNotFoundException is caught"); 
        } 
        
          
        
        
        
        
        System.out.println("calculating tax..");
        
        Iterator<Details> iterator = arrayOfObjects.iterator() ;
        while(iterator.hasNext())
        {
            Details tempObject = iterator.next() ;
            tempObject.calculateTax();
            System.out.println(tempObject);
            
        }
       

        
        
        
        
        
        
        
    }
    
    
}
