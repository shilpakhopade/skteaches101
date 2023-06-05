package tutorial;

public class Interfaces {

	public static void main(String[] args) {
		
	}
}

interface MyShape {
	 double calculateArea();
}

class MyRectangle implements MyShape{
	
	int length;
	int width;
	
	public double calculateArea() {
		return length * width;
	}
}

class MyCircle implements MyShape {
	
	int radius;
	
	public double calculateArea() {
		return 3.142 * radius * radius;
	}
}
