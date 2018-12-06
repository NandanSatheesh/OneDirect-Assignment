# ASSIGNMENT #4
### Topics Covered: Java Multithreading.
 
Develop a multi-threaded java program where one thread reads the data from the database say, details of an Item from a MySQL table. This thread builds an in-memory object, stores it in a collection. Simultaneously another thread should fetch already created Item objects from this collection and calculate the tax as per rules detailed in assignment#1 update the tax value in appropriate Item attribute and store it in a different collection. Finally print out the item details to console as detailed in assignment #1.
 
Implement such that the performance is optimal and thread race/dead lock is avoided.  

--- 
### Real Life Scenario: Producer Consumer Mechanism.
--- 
 
### Explanation of Files

--- 

Details.java - This has data members to information like Name, Price, Quantity, Type and Tax  
  
ProducerDetails.java – De-serializes and creates the object from the file. Logic for calculation of the tax for the products were developed.   
  
Producer.java  - This class starts the producer thread to calculate the tax from ProductDetails Class.


ConsumerDetails.java - This class loads the information from the database to the in-memory object, defines different operations which can be done on objects of Details class and finally serializes it and stores it in a disk.   
  
Consumer.java - This class starts the consumer thread for building the in-memory data structure containing the information from the database.   

ODAssignmentQ4.java - This class has the main method which creates the threads for the operations which are to be performed. 














