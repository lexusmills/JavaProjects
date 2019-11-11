package BankAccountApp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[]args) {
		List<Account> accounts = new LinkedList<Account>();
		
		/*
		Checking chkacc1 = new Checking("Tom Wilson", "123456789",1500);
		Saving savacc1 = new Saving ("Rich love","234567890",1200);
		
		
		savacc1.showInfo();
		System.out.println("----");
		chkacc1.showInfo();
		
		
		*/
		
		//read a CSV file and create a new account based on the data 
		String file ="D:\\NewBankAccounts.CSV";
		List<String[]> newAccountHolders = utilities.csv.read(file);
		for(String[] accountHolder : newAccountHolders) {
			System.out.println("NEW ACCOUNT");
			String name = accountHolder[0];
			String SSN = accountHolder[1];
			String accountType = accountHolder[2];
			double initDeposit = Double.parseDouble(accountHolder[3]);
			if (accountType.equals("Savings")) {
				accounts.add(new Saving(name, SSN, initDeposit));
			}
			else if(accountType.contentEquals("Checking")) {
				accounts.add(new Checking(name, SSN, initDeposit));
			}
			else {
				System.out.println("ERROR READING ACCOUNT TYPE");
			}
		}
		
		for (Account acc : accounts) {
			System.out.println("\n*****"); 
			acc.showInfo();
		}
	}
	
	
}
