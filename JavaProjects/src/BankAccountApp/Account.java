package BankAccountApp;

public abstract class Account implements BaseRate{

	//list common properties for savings and checking accounts
	private String name;
	private String SSN;
	private double balance;
	
	private static int index = 10000;
	protected String accountNumber;
	protected double rate;
	
	//constructor to get base properties and initialized the account
	public Account(String name, String SSN, double initDeposit) {
		this.name = name;
		this.SSN = SSN;
		balance = initDeposit;
		
		
	// Set Account Number
	index++;
	this.accountNumber = setAccountNumber();	
	
	setRate();
	
	}
	
	public abstract void setRate();
	
	
	private String setAccountNumber() {
		String lastTwoOfSSN = SSN.substring(SSN.length()-2, SSN.length());
		int uniqueID = index; 
		int randomNumber = (int) (Math.random()* Math.pow(10,3));
		return lastTwoOfSSN + uniqueID + randomNumber;
	}
	
	public void compound() {
		double accruedInterest = balance* (rate/100);
		balance = balance + accruedInterest;
		System.out.println("Accrued Interet:" + accruedInterest);
		printBalance();
	}
	//list common methods transactions 
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("depositing $" + amount);
		printBalance();
	}
	public void withdraw(double amount) {
		balance = balance - amount;
		System.out.println("Withdrawing $" + amount);
		printBalance();
	}
	public void transfer(String toWhere, double amount) {
		balance = balance - amount;
		System.out.println("Transfering $" + amount + " to " + toWhere);
		printBalance();
	}
	public void printBalance() {
		System.out.println("Your balance is now: $" + balance);
	}
	
	public void showInfo() {
		System.out.println(
				"NAME: " + name + 
				"\nACCOUNT NUMBER: " + accountNumber +
				"\nBALANCE: " + balance +
				"\nRATE: " + rate + "%"
				
				);
	}
}
