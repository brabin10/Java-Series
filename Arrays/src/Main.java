
public class Main {
	
	public static void main(String[] args) {
		
		// arrays = used to store multiple values in a single variable
		
		String[] cars = new String[3];
		
		cars[0] = "Mercedes Benz";
		cars[1] = "Honda";
		cars[2] = "Volvo";
		
		for(int i=0; i<cars.length; i++) {
			System.out.println(cars[i]);
		}
	}

}
