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

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
public class TestRunner 
{
    public static void main(String[] args) 
    {
        //Running all test cases
        Result result = JUnitCore.runClasses(TestJUnit1.class);
		
        for (Failure failure : result.getFailures()) 
        {   
            System.out.println(failure.toString());
        }
		
        System.out.println(result.wasSuccessful());
   }
    
    
}
