package tutorial;

public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

abstract class Shape {
	
	abstract double calculateArea(); 
}

class Rectangle extends Shape{
	
	int length;
	int width;
	
	double calculateArea() {
		return length * width;
	}
}

class Circle extends Shape {
	
	int radius;
	
	double calculateArea() {
		return 3.142 * radius * radius;
	}
}