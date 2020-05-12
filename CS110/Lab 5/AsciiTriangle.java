//Aristotle Ducay
//05/6/2020
//Lab 5.1: ASCII Triangle(While Loop)

//imports the java utility Scanner
import java.util.Scanner;
public class AsciiTriangle
{
   public static void main(String[] args)
   {
      //Declare and initialize variables, Declare and initialize Scanner object
      int triangleHeight = 0;
      String aSCIICharacter = "*";
      Scanner input = new Scanner(System.in);
      
      //print instructions, ask user toinput the height of the triangle
      System.out.println("This program prints a simple ASCII triangle. ");
      System.out.println("How tall should the triangle be? ");
      triangleHeight = input.nextInt() + 1;
      
      //recieve as input the ASCII character that should be used to print the ASCII art
      System.out.print("What ASCII character should be used to draw the traingle? ");
      aSCIICharacter = input.next();
      
      //Keeps track of which row of the trianlge you are printing
      int triangleRow = 1;
      String triangleRowChars = "";
      int rowCharacterPosition = 1;
      
      //prints 1st triangle row and other rows after the first
      while(triangleRow < triangleHeight) //outer loop for character position
      {
         triangleRowChars = "";
         rowCharacterPosition = 1;
         while(rowCharacterPosition <= triangleRow) //inner loop for character row position
         {
            triangleRowChars = triangleRowChars + aSCIICharacter;
            rowCharacterPosition++;
         }
         System.out.println(triangleRowChars);
         triangleRow++;
      } 
   }
}