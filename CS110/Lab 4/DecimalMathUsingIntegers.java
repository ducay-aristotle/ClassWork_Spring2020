//Aristotle Ducay
//05/6/2020
//Lab 4.1: Decimal Math With Integers

import java.util.Scanner;
public class DecimalMathUsingIntegers
{
   public static void main(String[] args)
   {
      //declare variables and initialize/ Declare scanner object
      int wholePart = 0, fractionalPart = 0;
      double composedDecimalValue = 0.0;
      Scanner input = new Scanner(System.in);
      
      //instruct user for whole and fractonal part of int
      System.out.print("Input an integer for the digits left of the decimal: ");
      wholePart = input.nextInt();
      
      System.out.print("Input an integer >= for the digits right of the decimal: ");
      fractionalPart = input.nextInt();
      
      //output status message and calculations for whole and fractional part
      System.out.println("The wholePart variable has the value: " + wholePart);
      System.out.println("The fractionalPart variable has the value: " + fractionalPart);
      
      composedDecimalValue = wholePart + fractionalPart/100.0;
      System.out.println("The composedDecimalValue is: " + composedDecimalValue);
      
      //Multiplies composedDecimal by 10,000 and format with commas and 6 decimal places
      System.out.printf("The formatted composedDecimalValue times 10,000 is : %,.6f \n", (composedDecimalValue * 10000.0));
      
      
      
      
   }




} 