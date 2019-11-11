package BankAccountApp;

public class Saving extends Account {

	//list properties specific to saving account
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;
	
	//constructor to initialize the saving account properties 
	public Saving(String name, String SSN, double initDeposit) {
		super(name, SSN, initDeposit);
		accountNumber = "1"+ accountNumber;
		setSafetyDepositBox();
	}
	
	@Override
	public void setRate() {
		System.out.println("Implement rate for Saving");
		rate = getBaseRate() -.25;
	}
	
	private void setSafetyDepositBox() {
		safetyDepositBoxID =(int) (Math.random()* Math.pow(10, 3));
		safetyDepositBoxKey = (int) (Math.random()* Math.pow(10, 4));
	}
	//list any method specific to saving account
	public void showInfo() {
		System.out.println("ACCOUNT TYPE: SAVINGS");
		super.showInfo();
		System.out.println(
				"YOUR SAVINGS ACCOUNT FEATURES" +
				"\n Safety Deposit Box ID: " + safetyDepositBoxID +
				"\n Safety Deposit Box Key: " + safetyDepositBoxKey 
				);
}

}