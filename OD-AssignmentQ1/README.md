# Question 1 

## Topics Covered: Java I/O, String.
 
 Write a java program that accepts details (item name, item type, item prize) of different items from Command line and outputs the item name, item prize, sales tax liability per item, final prize (sales tax + item prize) to the console. The input should be accepted with following command line options:
 ```java
-name <first item name>
-price <price of first item>
-quantity <quantity of first item>
-type <type of first item>
```

The following functionalities/behavior is expected:
 
 •	All options other than item name can come in any order i.e. after -name you can have -price, -type option. Item type is a mandatory option. 
 
•	The system should provide functionality to add more than one items i.e. Once the details of first item is entered it should display a message saying:
 
```sh
Do you want to enter details of any other item (y/n):
```

Appropriate behavior is required to be implemented as per user input for this question.
 
 •	Make use of java's object oriented capabilities for implementing this business logic.
 
 •	Item type can have 3 possible values raw, manufactured and imported.
 
•	Tax rules for the 3 types are as follows:
 
raw: 12.5% of the item cost
 
manufactured: 12.5% of the item cost + 2% of (item cost + 12.5% of item cost)
 
imported: 10% import duty on item cost + a surcharge (surcharge is: Rs. 5 if the final cost 	after applying tax & import duty is up to Rs. 100, Rs. 10 if the cost exceeds 100 and up to 	200 and 5% of the final cost if it exceeds 200).
 
# Solution

##### Details.java
Details.java class has the main Object Details implementation. Methods have been defined to access and modify the class data members.
  
##### Question1.java
This is the main class. An array of Details class is done using ArrayList. Proper Validation of inputs are also done. The methods can throw a NumberFormatException in case of any mismatch. Error handling is done wherever required. 

##### TestJUnit1.java
This class uses JUnit API for TDD. The functionality of each methods are tested. calulateTax() was manually tested because of the design. 
   
##### TestRunner.java
This is main class for running the tests. The program was tested for most of the test cases. 
  
  
#### Future Improvements 
- Class Design can be impoved so that all the methods are can be unit tested. 

   

