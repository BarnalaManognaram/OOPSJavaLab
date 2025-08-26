import java.util.Scanner;


public class Rectangle {
	// Attributes
	private double length; 
	private double width;


	// Default constructor 
	public Rectangle() { 
		this.length = 0.0;
		this.width = 0.0;
	}


	// Method to read attributes from user 
	public void readAttributes() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter length of the rectangle: "); 
		this.length = scanner.nextDouble();
		System.out.print("Enter width of the rectangle: "); 
		this.width = scanner.nextDouble();
	}


	// Method to calculate the area 
	public double calculateArea() {
		return this.length * this.width;
	}


	// Method to calculate the perimeter 
	public double calculatePerimeter() {
		return 2 * (this.length + this.width);
	}
 
	public static void main(String[] args) {
		// Create an instance of Rectangle 
		Rectangle rect = new Rectangle();

		// Read attributes
		 rect.readAttributes();
		// Calculate and display area and perimeter
		System.out.println("Area of the rectangle: " + rect.calculateArea());
		System.out.println("Perimeter of the rectangle: " + rect.calculatePerimeter());
	}
}


