//Aristotle Ducay
//04/28/2020
//Assignment: What do I wear?

import java.util.Scanner;

   public class NestedIfStatements
   {
      public static void main(String[] args)
      {
         System.out.println("What is the temprature outside (in F)? ");
         Scanner userInput = new Scanner(System.in);
         double tempOutsideF = userInput.nextDouble();
         
         
         System.out.println("Is it raining outside? (Enter 1 for yes, 0 for no) ");
         int raining = 0;
         String Enter = userInput.nextLine();
         
         raining = userInput.nextInt();
         System.out.println(tempOutsideF);
                  
         
         
         // If temperature is greater than 70
         if(tempOutsideF >= 70)
            {
               // if raining is true/on output clothing with Jacket
               if(raining == 1)
               {            
                  System.out.println("Wear a t-shirt, shorts and sandals. Along with a jacket"); 
               }
               //Other output this clothing option
               else
                  {
                     System.out.println("Wear a t-shirt, shorts and sandals");
                  }
             }
           
           //other wise if the temperature is below 30
           else if(tempOutsideF <= 30)
             {
               // if raining is true/on
               if(raining == 1)
                 {
                  //output this clothing option
                  System.out.println("Wear boots, sweater, and gloves. Its raining outside too, bring an umbrella");
                  
                                                                                  
                 }
                  //other wise
                  else
                     {
                        //output this clothing option
                        System.out.println("Wear a long-sleeve shirt, pants, sneakers and bring sunglasses.");
                        
                     }                             
              }                
        }
   }