package tutorial;

public class Variables {
	
	static String classVariable;
	
	String instanceVariable;
	
	
	public static void main(String[] args) {
		
		Account a = new Account();
		
		System.out.println("Class variable:" + classVariable);
		classVariable = "classVariable";
		System.out.println("Class variable:" + classVariable);
		
		
		String localVariable = ""; //Needs to be initialized
		System.out.println("Local variable:" + localVariable);
		localVariable = "localVariable";
		System.out.println("Local variable:" + localVariable);
		
		//instanceVariable = 0; Cannot use this
		
		Variables variable = new Variables();
		System.out.println("Instance variable:" + variable.instanceVariable);
		variable.testMethod();
		System.out.println("Instance variable:" + variable.instanceVariable);
	}
	
	public void testMethod() {
		instanceVariable = "instance variable";
		
	}

}
