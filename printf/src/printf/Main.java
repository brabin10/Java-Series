package printf;

public class Main {
	
	public static void main(String[] args) {
		
		// printf() = an optional method to control, format, and display text to the console window
		// two agruments = format string + (object/variable/value)
		// % [flags] [precision] [width] [conversion-character]
		
		boolean myBoolean = true;
		char myChar = '@';
		String myString = "Bro";
		int myInt = 50;
		double myDouble = 1000;
		
		// System.out.printf("%b", myBoolean); // for boolean
		// System.out.printf("%c", myChar);    // for char
		// System.out.printf("%s", myString);  // for String
		// System.out.printf("%d", myInt);  // for Int
		// System.out.printf("%f", myDouble);  //for floating point value double or float
		
		// [width]
		// minimum number of characters to be written as output
		// System.out.printf("Hello %-10s",myString);
		
		// [precision]
		// sets number of digits of precision when outputting floating - point values
		// System.out.printf("You have this much money %.3f",myDouble);
		
		
		// [flags]
		// adds an effect to output based on the flag added to format specifier
		// - : left - justify
		// + : output a plus (+) or minus (-) sign for a numeric value
		// , : comma grouping separator if numbers > 1000
		
		// System.out.printf("You have this much money %+f", myDouble);
		
		
	}

}
