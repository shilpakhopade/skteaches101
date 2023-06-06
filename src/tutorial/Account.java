package tutorial;

public class Account {

	String accountHolderName;
	
	String accountId;
	
	
	static String ifscCode = "IFSC0001";
	
	double balance = 0L;
	
	public void credit(double creditAmount) {
		double newBalance = balance + creditAmount;
		balance = newBalance;
	}
	
	public void debit(double debitAmount) {
		double newBalance = balance + debitAmount;
		balance = newBalance;
	}
	
}
