
public class Main {
	
	public static void main(String[] args) {
		
		// String = a reference data type that can store one or more characters
		// reference data types have access to useful methods
		
		String name = "Brother";
		//boolean result = name.equalsIgnoreCase("brother"); // ignore case sensitivity
		//int result = name.length(); // it returns 7
		//char result = name.charAt(0); // it returns B
		//int result = name.indexOf("t"); // it returns 3
		//boolean result = name.isEmpty();  // it returns true
		//String result = name.toLowerCase(); // prints all lower case
		//String result = name.toUpperCase();	// prints all upper case	
		String result = name.replace('B', 'T'); // prints Trother, replace B to T
		
		System.out.println(result);
	}

}
