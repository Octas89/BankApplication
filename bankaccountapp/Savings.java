package bankaccountapp;

public class Savings extends Account {

	//list properties specific to savings account
	private int safetyBoxNumber;
	private int safetyBoxPin;
	//constructor to initialise savings account
	public Savings(String name, String sSN,double balance) {
		super(name,sSN,balance);
		accountNumber="1"+accountNumber;
		setSafetyBox();
	}
		public void setRate() {
			rate=getBaseRate()-0.25;
		}
	//list any methods specific to savings account
	public void showInfo() {
		super.showInfo();
		System.out.println("Your savings account features: "+
				"\n Safety deposit box number: "+safetyBoxNumber+
				"\n Safety deposit box pin: "+safetyBoxPin
				);
	}
	private void setSafetyBox() {
		safetyBoxNumber= (int) (Math.random()*Math.pow(10, 3));
		safetyBoxPin=(int) (Math.random()*Math.pow(10, 4));
	}
}
