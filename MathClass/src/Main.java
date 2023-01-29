import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		// Write a program to find a Hypotenuse of a Triangle
		double x;
		double y;
		double z;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter side x: ");
		x = scanner.nextDouble();
		System.out.println("Enter side y: ");
		y = scanner.nextDouble();
		
		z= Math.sqrt((x*x)+(y*y));
		System.out.println("The hypotenuse is : "+z);
		
		scanner.close();
		
		
		
		
		
//		double x = 43.33;
//		double y = -22;
//		
//		// some useful method
//		double z = Math.max(x, y);
//		//double z = Math.round(x); // round value
//		//double z = Math.ceil(x);  // always round up
//		//double z = Math.floor(x, y);  // always round down 
//		//double z = Math.sqrt(x);  // square root
//		//double z = Math.max(x, y); // min value
//		//double z = Math.abs(y); // absolute value
//		System.out.println(z);
	}

}
