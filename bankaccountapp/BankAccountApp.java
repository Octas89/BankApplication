package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		
		List<Account> accounts=new LinkedList <Account>();
		
		String file="/Users/Tavi/Desktop/JavaApplications/Eclipse projects/JavaProjects/src/bankaccountapp/NewBankAccounts.csv";
		//read from CSV file
		List<String[]> newAccountHolders=utilities.CSV.read(file);
for(String[]accountHolder:newAccountHolders) {
	String name=accountHolder[0];
	String sSN=accountHolder[1];
	String accountType=accountHolder[2];
	double balance=Double.parseDouble(accountHolder[3]);
	if(accountType.equals("Savings")) {
		accounts.add(new Savings(name,sSN,balance));
	} else if(accountType.equals("Checking")) {
		accounts.add(new Checking(name,sSN,balance));
	}else {
		System.out.println("Error reading account type!");
	}
}
for(Account acc:accounts) {
	System.out.println("\n*****************");
	acc.showInfo();
}
	}

}
