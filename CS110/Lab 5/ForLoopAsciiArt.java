//Aristotle Ducay
//05/6/2020
//Lab 5.2: ASCII Triangle(For Loop Incrementing)

import java.util.Scanner;
public class ForLoopAsciiArt
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int triangleHeight = 0;
      System.out.println("How tall is the triangle? ");
      triangleHeight = input.nextInt();
      
      for(int row = 0; row <= triangleHeight; row++)
      {
         for (int column = 0; column < row; column++)
         {
            System.out.print("@");
         }
         System.out.println();
      } 
   }
}


