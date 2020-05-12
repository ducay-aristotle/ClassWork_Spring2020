//Aristotle Ducay
//Aristotle Ducay
//04/28/2020
//Assignment: What do I wear?

import java.util.Scanner;

   public class ClothingPickerIfElseIf
   {
      public static void main(String[] args)
      {
         //methods and objects for question, input scanner and temperature
         System.out.println("What is the temprature outside? ");
         Scanner userInput = new Scanner(System.in);
         double tempOutsideF = userInput.nextDouble();
         System.out.println(tempOutsideF);
         
         //if temerature is greater or equal to 70
         if(tempOutsideF > 70)
         {
            //output this colthing option
            System.out.println("Wear a t-shirt, shorts and sandals.");
         
         }
         //other wise if temp is less or equal to 30
         else if(tempOutsideF < 30)
         {
            //output this clothing option
            System.out.println("Wear boots, sweater and gloves.");   
         
         }
         //other wise

         else
         {
               //output this clothing option
               System.out.println("Wear a long-sleeve shirt, pants and shoes");
         }
      }
   }
      