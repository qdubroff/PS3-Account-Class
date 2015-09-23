package mainPackage;

public class InsufficientFundsException extends Exception
{

	private double amount;
	/**
	 * Creates new Exception method
	 */
	public InsufficientFundsException(double amount)
	{
		this.amount = amount;
	}
	public double getAmount()
	{
		return amount;
	}
}
