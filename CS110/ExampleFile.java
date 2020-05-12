
import java.util.Scanner;
public class ExampleFile
{
  public static void main(String[] args)
  {
    /*int x = 0;
    int y = 0;
    
    if(y++ == ++x) //x gets incramented BEFORE == operation while y gets incramented AFTER == operation
    {
      System.out.print("A");
    }
    
    else
    {
      System.out.print("B");
    }*/
    
    Scanner input = new Scanner(System.in);
    int examScore = input.nextInt();
    
    if(!(examScore > -1 && examScore <= 100))
    {
      System.out.print("Invalid Score");
    }
    
    
    else
    {
      System.out.print("Score is Valid");
    }
                    
  }      
}
  