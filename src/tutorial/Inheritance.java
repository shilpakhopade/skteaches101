package tutorial;

import java.util.Date;

public class Inheritance {
	
	public static void main(String[] args) {
		
		Account a1 = new Account();
		a1.setBalance(100);
		System.out.println(a1.balance);
		
		SavingsAccount a2 = new SavingsAccount();
		a2.setBalance(200);
		System.out.println(a2.balance);

		TermDeposit a3 = new TermDeposit();
		a3.setBalance(300);
		
		System.out.println(a3.balance);
		System.out.println(a3.termEnd);
	}

}

class Account {

	float balance = 0L;
	
	public float getBalance() {
		return balance;
	}
	
	public void setBalance(float argBalance) {
		balance = argBalance;
	}

}


class SavingsAccount extends Account{

	
	
}

class TermDeposit extends Account{
	
	Date termEnd = new Date();
	
	public Date getTermEnd() {
		return termEnd;
	}
}
