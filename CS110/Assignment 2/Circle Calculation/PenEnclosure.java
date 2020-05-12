//Aristotle Ducay
//04/23/2020
//Assignment 2.1: Box Fence or Circlular Pen?

      //Declare float Variables for Radius Length and Width
      //Declare double variables for Circumference and Perimeter
      //Create Scanner Input method
      //Output Radius Length and Width as well as Circumference and Perimeter



   import java.util.Scanner;

   public class PenEnclosure   
      {
         //Starting point for a program
         public static void main(String args[])
         {
      
         //Variables for user input
         int Radius;
         double Length;
         double Width;
         double Circumference;
         double Perimeter;
      
         //Scanner to take user input
         Scanner Input = new Scanner(System.in);
      
         //outputs Radius based on user input
         System.out.print("What is the Radis? ");
         Radius = Input.nextInt();
      
         //outputs Length based on user input
         System.out.print("What is the Length? ");
         Length = Input.nextFloat();
      
         //outputs Width based on user input
         System.out.print("What is the Width? ");
         Width = Input.nextFloat();
      
         //Formula's for calculating Circumference and Perimeter
         Circumference = 2 * Math.PI * Radius;
         Perimeter = 2 * Length * Width;
      
         //Outputs Circumference and Perimeter
         System.out.println("The Circumference is " + Circumference);
         System.out.println("The Perimeter is " + Perimeter);
         
         }

      }
     