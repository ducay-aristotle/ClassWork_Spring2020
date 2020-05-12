//Aristotle Ducay
//04/28/2020
//Assignment: What do I wear?

import java.util.Scanner;

   public class ClothingPickerWScanner
   {
      public static void main(String[] args)
      {
         //Methods and objects for question, scanner and temperature
         System.out.println("What is the temprature outside? ");
         Scanner userInput = new Scanner(System.in);
         double tempOutsideF = userInput.nextDouble();
         System.out.println(tempOutsideF);
         
         //if temperature is less or equal to 30
         if(tempOutsideF <= 30)
         {
            //output this clothing option
            System.out.println("Wear boots, sweater, and gloves.");
         
         }
         
         // if temperature is more or equal to 30
         if(tempOutsideF >= 30)
         {
            //output this clothing option
            System.out.println("Wear a t-shirt, shorts and sandals.");   
         
         }
      }
   }
      
      