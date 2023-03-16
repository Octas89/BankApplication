package bankaccountapp;

public abstract class Account implements IBaseRate{

	//list common properties for checking and savings account
	private String name;
	private String sSN;
	private double balance;
	protected String accountNumber;
	protected double rate;
	private static int fiveDigit=10000;
	
	
	//Constructor to set base properties and initialise account
	public Account(String name,String sSN, double balance) {
		this.name=name;
		this.sSN=sSN;
		this.balance=balance;
		fiveDigit++;
		//set the account number
		accountNumber=setAccountNumber();
		setRate();
		
	}
	
	public abstract void setRate();
	
	public void compound() {
		double accruedInterest=balance*(rate/100);
		balance=balance+accruedInterest;
		System.out.println("Accrued interest: £"+accruedInterest);
		printBalance();
	}
	
	private String setAccountNumber() {
		String lastTwo=sSN.substring(sSN.length()-2,sSN.length());
		int uniqueFive=fiveDigit;
		int randThree=(int) (Math.random()*Math.pow(10, 3));
		return lastTwo+uniqueFive+randThree;
		
	}
	//list common methods -transactions
	public void deposit(double deposit) {
		balance=balance+deposit;
		System.out.println("You have deposited £"+deposit);
		printBalance();
	}
	public void withdraw(double withdraw) {
		balance=balance-withdraw;
		System.out.println("You have withdraw £"+withdraw);
		printBalance();
		
	}
	public void transfer(double amount,String where) {
		balance=balance-amount;
		System.out.println("You just transfered £"+amount+" to "+where);
		printBalance();
	}
	
	public void printBalance() {
		System.out.println("Your balance is now: £"+balance);
	}
	public void showInfo() {
		System.out.println(
				"Name: "+name+
				"\nAccount number: "+accountNumber+
				"\nBalance: "+balance+
				"\nRate: "+rate+"%"
				);
	}
}
