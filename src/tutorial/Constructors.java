package tutorial;

public class Constructors {

	public static void main(String[] args) {
		C c = new C(); 
		
		//Employee e = new Employee() //Not allowed
		Employee e1 = new Employee("1");
		Employee e2 = new Employee();
		
		System.out.println(e1.employeeID);
		System.out.println(e2.employeeID);
		System.out.println(e1.role);
		System.out.println(e1.role);
	}

}

class A {
	
}

class B extends A {
	
}

class C extends B {
	
}

class Employee {
	
	String employeeID;
	String role;
	
	public void setEmployeeID(String id) {
		employeeID = id;
	}
	
	Employee() {
		role = "joinee";
	}
	
	Employee(String id) {
		this();
		employeeID = id;
	}

}

