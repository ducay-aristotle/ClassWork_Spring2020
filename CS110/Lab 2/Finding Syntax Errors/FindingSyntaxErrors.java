//Aristotle Ducay
//04/21/2020
//Lab 2:FindingSyntaxErrors 
 
/* A simple class that contains syntax errors */
   public class FindingSyntaxErrors //step 1
   { 
   
   // The main method 
   public static void main(String[] args) //step 2
      { 
      
      // Declare a variable of type integer
      int zipCode = 98924; //step 3
      
      // Invoke the print and println methods from System.out                                                              /* System. statements had letter O capitalized instead of lowercased */
      System.out.println("Wellington P. Wildcat "); //step 4 (was missing ln statement for print method)
      System.out.println("is the official mascot of Central Wahington University."); //step 5
      System.out.println("He lives at zip code " + zipCode); //step 6 (was missing ; for ending the statement)
      } 
   }