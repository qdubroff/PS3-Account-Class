package mainPackage;


import java.util.Date;

public class TestAccount {

	public static void main(String[] args) throws InsufficientFundsException
	{
		Account testAccount = new Account(1122,20000,0.045,new Date());
		testAccount.deposit(3000);
		testAccount.withdraw(2500);
		System.out.println("The balance is " + testAccount.getBalance());
		System.out.println("The monthly interest is " + testAccount.getMonthlyInterestRate());
		System.out.println("The account was created on " + testAccount.getDateCreated());
		try
		{
			testAccount.withdraw(30000);
		}
		catch(InsufficientFundsException oops)
		{
			System.out.println("Sorry but you are short $" + oops.getAmount());
		}
	}
}
