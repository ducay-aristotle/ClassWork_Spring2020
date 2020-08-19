
public class Account 
{
	//fields to make up foundation of class
	public String userName;//user name for user
	private String passWord;//password for user
	private int credits = 0;//credits for account
	private int creditLimit;//max credits for user
	
	//setter and getter methods to use in main method
	public void setUser(String user)//passes the user parameter into the userName variable  
	{
		userName = user;//SET FIELD TO PERAMATER VARIABLE
	}
	
	//passes the pass parameter into the passWord variable
	public void setPassWord(String pass)
	{
		passWord = pass;
	}
	
	//sets account credit balance
	public void setCredits(int balance)
	{
		credits = balance;
	}
	//sets credit limit
	public void setCreditLimit(int limit)
	{
		creditLimit = limit;
	}
	//gets the user-name
	public String getUser()
	{
		return userName;
	}
	//gets the account credits
	public int getCredits()
	{
		return credits;
	}
	//gets the credit-limit for the account
	public int getCreditLimit()
	{
		return creditLimit;
	}
	//gets the password for the account
	public String getPassword()
	{
		return passWord;
	}
	//non default constructor
	public Account(String user, String pass)
	{
		userName = user;
		passWord = pass;
		credits = 100;
		creditLimit = 999;
	}
}
