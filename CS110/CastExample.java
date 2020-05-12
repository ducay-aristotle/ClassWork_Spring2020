public class CastExample
   {
      public static void main(String[] args)
      {
         //delclares a variable of type int
         int myVariable = 110;
         
         //declares the result variable as a double
         double result;
         //uses integer division to store a new value in variable result
         result = myVariable / 3;
         System.out.println("The value of result is " + result);
         
         //Will still compile but you will have loss of precision becuase of the integer division expression
      }
   }
