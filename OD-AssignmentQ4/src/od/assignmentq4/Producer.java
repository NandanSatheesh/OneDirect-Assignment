/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package od.assignmentq4;

/**
 *
 * @author Nandan
 */
public class Producer implements Runnable
{
    
    public void run()
    {
        new ProducerDetails().populateObjects();
        
    }
    
}
