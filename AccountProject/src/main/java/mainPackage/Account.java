package mainPackage;

import java.util.Date;
import java.util.Calendar;
public class Account {

	private int ID;
	private double balance;
	private double annualInterestRate = 0;
	private Date dateCreated;
	
	public Account()
	{
		ID = 1;
		balance = 0;
		annualInterestRate = 0.01;
	}
	public Account(int ID,double balance, double annualInterestRate, Date dateCreated)
	{
		this.ID = ID;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
		this.dateCreated = new Date();
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public double getMonthlyInterestRate()
	{
		return Math.pow(1+annualInterestRate,1/12)-1;
	}
	public void deposit(double amount)
	{
		balance += amount;
	}
	public void withdraw(double amount)throws
								InsufficientFundsException
	{
		if(amount<=balance)
		{
			balance -= amount;	
		}
		else
		{
			double needs = amount - balance;
			throw new InsufficientFundsException(needs);
		}
	}
}
