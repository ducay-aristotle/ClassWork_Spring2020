//Aristotle Ducay
//05/6/2020
//Lab 4.2: Fun Facts: One through Nine

import java.util.Scanner;
public class OneThroughNine
{
   public static void main(String[] args)
   {
      //Declare variable for user input and Declare/initialize Scanner object
      int userNumber;
      Scanner input = new Scanner(System.in);
      
      //instruct user to provide input
      System.out.println("Pick a number, 1-9, that you want to know a fun fact about.");
      userNumber = input.nextInt();
      
      //switch case for numbers 1-9 with their corrosponding fact statement
      switch(userNumber)
      {
         case 1:
            System.out.println("1 can be written as 1*1, this it has two factors, but they both are not different and hence it is not a prime number.");
            break;
            
         case 2:
            System.out.println("2 is the only prime number that is even and it is the smallest prime number.");
            break;
            
         case 9:
            
         case 3:
            System.out.print("3 squared is 9, and the square root of 9 is 3");
            break;
            
         case 4:
           System.out.println("4 is the smallest square greater than 1");
           break;
            
         case 5:
           System.out.println("5 is one-quarter of 20. Wow!");
           break;
            
         case 6:
           System.out.println("6 is the smallest number that is equal to the sum of its proper divisors. Interesting!");
           break;
           
         case 8: 
            
         case 7:
           System.out.println("The numbers 7 and 8 are both less than 9. Amazing!");
           break;    
      }   
   }
}