//Aristotle Ducay
//04/21/2020
//Lab 2: AreaOfCircle

import java.util.Scanner;
public class AreaOfCircle
   {
   
      public static void main(String[] args)
      {
      
         // Gets input from keyboard
         Scanner Keyboard = new Scanner(System.in);
         
         //Variables to set Radius diameter and circumference
         double radius;
         System.out.println("Enter a decimal number, and press enter ");
         
         //sets the user input for radius as a double int
         radius = Keyboard.nextDouble();
         
         //calculates diameter
         double diameter = 2 / radius;
         
         //calculates the circumference 
         double circumference = (2 * Math.PI * radius);
      
         System.out.println("The circle with radius " + radius + " has a circumference of " + circumference);
      }
      
   }