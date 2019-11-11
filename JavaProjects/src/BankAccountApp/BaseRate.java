package BankAccountApp;

public interface BaseRate {

	//write a method that returns a base rate
	default double getBaseRate() {
		return 2.5;
		
	}
}
