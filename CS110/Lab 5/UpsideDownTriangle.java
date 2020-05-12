//Aristotle Ducay
//05/6/2020
//Lab 5.3: ASCII Triangle(For Loop Decrementing)

import java.util.Scanner;
public class UpsideDownTriangle
{
   public static void main(String[] args)
   {
      //Declares loop variable triangleHeight and Scanner object with statement
      Scanner input = new Scanner(System.in);
      int triangleHeight;
      System.out.println("How tall is the uside-down triangle?");
      triangleHeight = input.nextInt();
      
      //outer for loop 
      for(int row = triangleHeight; row > 0; row--)
      {
         //inner for loop
         for(int column = 0; column < row; column++)
         {
            System.out.print("@");
         }
         System.out.println();  
      }  
   }
}




