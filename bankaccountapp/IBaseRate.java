package bankaccountapp;

public interface IBaseRate {

	// list method to return base rate
	default double getBaseRate() {
		return 2.5;
	}
}
