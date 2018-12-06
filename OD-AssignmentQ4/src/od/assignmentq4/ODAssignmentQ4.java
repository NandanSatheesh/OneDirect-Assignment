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
public class ODAssignmentQ4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException
    {
        // TODO code application logic here
        
        Thread producerThread = new Thread( new Producer()) ;
        producerThread.start();
        producerThread.join();
       
        Thread consumerThread = new Thread( new Consumer()) ;
        consumerThread.start();
        
        
        
        
    }
    
}
