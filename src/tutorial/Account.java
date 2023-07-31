package tutorial;

public class Account {

	String accountHolderName;
	
	String accountId;
	
	
	static String ifscCode = "IFSC0001";
	
	double balance = 0;
	
	public void credit(double creditAmount) {
		double increasedBalance = balance + creditAmount;
		balance = increasedBalance;
	}
	
	public void debit(double debitAmount) {
		double decreasedBalance = balance - debitAmount;
		balance = decreasedBalance;
	}
	
}
