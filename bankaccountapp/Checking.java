package bankaccountapp;

public class Checking extends Account{

	//list properties specific to checking account
	private long cardNumber;
	private int pin; 
	
	//constructor to initialise checking account
	public Checking (String name,String sSN, double balance) {
		super(name,sSN,balance);
		accountNumber= "2"+accountNumber;
		setCardNumber();
		
	}
	@Override
	public void setRate() {
		rate=getBaseRate()*0.15;
	}
	//list any methods specific to checking account
	public void showInfo() {
		super.showInfo();
		System.out.println("Your checking account features:"+
							"\n Debit card number: "+cardNumber+
							"\n PIN: "+pin
				);
		
	}
	private void setCardNumber() {
		cardNumber=(long) (Math.random()*Math.pow(10, 12));
		pin=(int)(Math.random()*Math.pow(10,4));
	}
}
