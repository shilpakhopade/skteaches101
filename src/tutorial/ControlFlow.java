package tutorial;

public class ControlFlow {

	public static void main(String[] args) {
		
		int age;
		age = 17;
		isAdult(age);
		
		age = 19;
		isAdult(age);
		
		int day = 2;
		String strDay = dayOfWeek(day);
		System.out.println("This is a " + strDay);
		
		printNumbers(0,10);
		
		
	}
	
	
	public static boolean isAdult(int age) {
	
		/*
		 * if age is 18 or more, person is adult (adult = true)
		 * else person is minor (not adult) -> (adult = false)
		 */ 
		if(age >= 18) {
			System.out.println("Adult");
			return true;
		} else {
			System.out.println("Minor");
			return false;
		}
		
	
	}
	
	public static String dayOfWeek(int dayOfWeek) {

		// if day is 6 or 7, it is Weekend
		// if anything else, its a weekday
		String day = null;
		
		switch(dayOfWeek) {
			case 6: 
				day = "Weekend";
				break;
			case 7:
				day = "Weekend";
				break;
			default:
				day = "Weekday";
		}
	
		return day;

	}
	
	public static void printNumbers(int startNumber, int endNumber) {
		
		/* 
		 * start at the first number 
		 * counter is at first number
		 * print first number
		 * move counter to second number
		 * print next number
		 * continue increasing the counter till last number is reached
		 */
		
		// initialize (start), condition, increment
		for(int counter=startNumber; counter <= endNumber; counter++) {
			System.out.println(counter);
		}
		
		/*
		 * while(condition) {
		 * 
		 * }
		 */
		
		//Example: Factorial
	}
	
	public int getFactorial(int x) {
		int sum = 1;
		for(int i=1; i<=x; i++) {
			sum = sum * i;
		}
		
		return sum;
	}
	
	
	
}
