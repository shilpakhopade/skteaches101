package tutorial;

public class Welcome {

	public static void main(String[] args) {

		System.out.println("Welcome to java");
		
		variableDemo();

	}
	
	public static void variableDemo() {
		
		Account a = new Account();
		
		a.accountHolderName = "Bond";
		a.accountId = "777";
		
		System.out.println("Class variable for account a");
		System.out.println(a.ifscCode);
		
		System.out.println("Instance variable for account a");
		System.out.println(a.accountId);
		System.out.println(a.accountHolderName);
		
		a.ifscCode = "IFSCNew";
		
		Account b = new Account();
		
		System.out.println("Class variable for account b");
		System.out.println(b.ifscCode);
		
		System.out.println("Instance variable for account b");
		System.out.println(b.accountId);
		System.out.println(b.accountHolderName);

	}

}
