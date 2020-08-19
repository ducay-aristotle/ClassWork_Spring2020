// Aristotle Ducay
// 06/03/2020
// V-Marketplace(Final Project)
import java.util.Scanner;
import java.io.*;
import java.util.Random;
public class VirtualMarketplace 
{
	//create method for reading instructions from a new created file(Done)
	//create class for account creation w/password (Done)
	//create method for points/credits(Done)
	//create user input using Scanner(Done)
	//create class for marketplace items(Done)
	//create method for decreasing value of points when getting stuff on marketplace(IP) 
	
	/*
	  This program will
	  	-Let the user create a user-name
	  	-Let the user create a password
	  	-display the different options for the main menu
	  	-display the user's Account details
	  	-exit program when entering 0 from the main menu
	 */
	
	//general instructions for user
	public static void userInstructions() 
	{
		System.out.println("Please enter a username and password");
		System.out.println("password must be more than 12 charactes");
	}
	//method to display menu options
	public static void menuOptions()
	{
		System.out.println("1. Marketplace");
		System.out.println("2. Account");
		System.out.println("3. Settings");
		System.out.println("0. Exit application");
	}
	//method for displaying a greeting from a file
	public static void displayFileGreeting() throws IOException
	   {
	      File greeting = new File("Greeting.txt");
	      FileWriter myWriter = new FileWriter("Greeting.txt");
	      myWriter.write("Welcome to V Market! It looks like you don't have an account lets set one up so you can start using the marketplace.");
	      myWriter.close();
	      
	      Scanner myReader = new Scanner(greeting);
	      while(myReader.hasNextLine())
	      {
	         String data = myReader.nextLine();
	         System.out.println(data);
	      }
	      myReader.close();
	   }
	
	//methods for displaying account details
	public static void displayAccountName(String userName)
	{
		System.out.println("UserName: " + userName);
	}
	
	public static void displayAccountCredits(int credits)
	{
		System.out.println("Credits in Account: " + credits);
	}
	
	public static void displayCreditLimit(int creditLimit)
	{
		System.out.println("MaxCredits: " + creditLimit);
	}
	
	
	public static void main(String[] args) throws IOException, InterruptedException
	{
		String user;
		String passwordInput;
		displayFileGreeting();
		userInstructions();
		Scanner userInput = new Scanner(System.in);
		user = userInput.nextLine();
		passwordInput = userInput.nextLine();
		Account userAccount1 = new Account(user,passwordInput);
		String password = userAccount1.getPassword();
		System.out.println("UserName: " + user);
		System.out.println("Password: " + password);
		System.out.println("");
		System.out.println("Perfect! Now that you have an account what would you like to do?");
		System.out.println("V-MarketPlace Main Menu");
		Random randomNum = new Random();
		while(true)
		{
			menuOptions();
			switch(userInput.nextInt())
			{
				case 1:
					System.out.println("Still in development.");
					System.out.println("");
					userInput.nextLine();
					break;
				case 2:
					System.out.println("");
					displayAccountName(userAccount1.getUser());
					displayAccountCredits(userAccount1.getCredits());
					displayCreditLimit(userAccount1.getCreditLimit());
					
					System.out.println("");
					userInput.nextLine();
					break;
				case 3:
					System.out.println("Still in development.");
					System.out.println("");
					userInput.nextLine();
					break;
					
				case 0:
					System.exit(0);
					
				default:
					System.out.println("Invalid selection Error code beaver " + randomNum.nextInt() + " please try again.");
			}
			
		}
	}
}
