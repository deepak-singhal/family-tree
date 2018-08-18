# familytree
Application is designed in accordance to the Requirement Document.
Preliminary Tree in accordance to diagram given in document has been prepared in the code level.

Operations Performed:
======================
1. Search Relation Operation :
     Input: Person=Alex Relation=Brothers 
     Output: Brothers=John,Joe
 
 List of supported relations:
 ● father       
 ● mother        
 ● brother(s)
 ● sister(s)    
 ● son(s)        
 ● daughter(s)
 ● cousin(s)    
 ● grandmother   
 ● grandfather
 ● grandson(s)    
 ● grandaughter(s)
 ● aunt(s)
 ● uncle(s)
 
2. Insert Operation :
   a) To add a child to the family member (Mother)
    Input: Mother=Zoe Son=Boris 
    Output: Welcome to the family, Boris!
    
    List of Supported second argument :
   ● Son           
   ● Daughter

    b) To add a Wife / Husband to the family member
    Input: Husband=Bern Wife=Julia 
    Output: Welcome to the family, Julia! 
   
    Assumption - First argument is always be the original family member and second member has to be the new addition to the family
    example: If Bern is the family member and we can add his wife(second argument)
             If Niki (Female) is the family member then we can add Husband (second argument)
      
Steps to run the application :
==============================
Step-1 Take the family.jar from the project root directory.
Step-2 java -jar family.jar <YOUR-COMMAND>
   eg. java -jar family.jar Person=Evan Relation=Son
  
External Artifacts:
===================
1. Maven - To package the code as single artifact (Family.jar).
2. JUnit - To write the Unit Test cases to test all the service layer of the code.

