import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		// ArrayList = a resizable array
		// Elements can be added and removed after compilation phase
		// store reference data types

		ArrayList<String> food = new ArrayList<String>();
		food.add("Pizza");
		food.add("Burger");
		food.add("Momo");

		food.set(1, "Sushi"); // setting the value Sushi in Burger place
		food.remove(2); // removing Momo
		food.clear(); // to clear our ArrayList, no longer value

		for (int i = 0; i < food.size(); i++) { // in array we use .length but in ArrayList we use .size
			System.out.println(food.get(i));

		}
	}

}
