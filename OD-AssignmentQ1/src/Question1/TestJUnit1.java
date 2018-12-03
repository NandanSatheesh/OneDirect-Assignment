/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;

/**
 *
 * @author Nandan
 */
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestJUnit1 
{
    
    
    @Test
    public void testcheckforId()
    {
        // replace the string with the test case of your choice 
        String[] args = "-name nandan -price 100 -type raw".trim().split(" ");
        
        
        assertEquals("true" , String.valueOf(Question1.checkforId(args)).trim() ) ;
        
        args = "-name nandan -price 100 -quantity 500".trim().split(" ");
        
        
        assertEquals("false" , String.valueOf(Question1.checkforId(args)).trim() ) ;
    }
    
    
    
}
