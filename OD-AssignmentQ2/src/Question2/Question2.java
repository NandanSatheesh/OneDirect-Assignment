/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question2;

/**
 *
 * @author Nandan
 */
import static java.lang.System.exit;
import java.util.Scanner ;
import java.util.regex.Pattern;
public class Question2 
{
   public static void main(String[] args)
   {
       Scanner input = new Scanner(System.in) ;
       
       ArrayOfUsers object = new ArrayOfUsers() ;
       object.readUserDetails();
       
       while(true)
       {
           
           System.out.println("menu \n1. add user \n2. display \n3. delete user details \n4. save user details \n5. exit \nenter your choice \n");
           int ch = input.nextInt() ;
           switch(ch)
           {
               case 1 : object.addUser();
                   break ;
               case 2 : object.displayAll(); break ;
               case 3 : object.deleteUser(); break ;
               case 4 : object.saveUserDetails(); break ;
               case 5 :  
                    /*
                    a simple regex is constructed to check y/n from the user. 
                    y / Y = Yes
                    n / N = No
                    a simple validation is implemented using Scanner Class
                    */
                    System.out.println("do you want to store the latest changes to the disk? (y/n)");
                    String savePrompt ;
                    while(!input.hasNext(Pattern.compile("[yYnN]")))
                    {
                        input.nextLine();
                    }

                    savePrompt = input.nextLine() ;
                    if(savePrompt.equalsIgnoreCase("y") )
                    {
                   
                        object.saveUserDetails();
                        System.out.println("details stored");
                    }
                    else
                    {
                        System.out.println("details not stored ");
                    }
                    
                    
                    exit(0) ;
           }
           
                   
                   
        }
           
    }
       
   
    
}
