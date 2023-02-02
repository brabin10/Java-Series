import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		// 2D ArrayList = a dynamic list of lists
		// You can change the size of these lists during runtime

		ArrayList<ArrayList<String>> groceryList = new ArrayList();

		ArrayList<String> bakeryList = new ArrayList<String>();
		bakeryList.add("pasta");
		bakeryList.add("garlic bread");
		bakeryList.add("donuts");

		ArrayList<String> produceList = new ArrayList<String>();
		produceList.add("tomato");
		produceList.add("potato");
		produceList.add("onion");

		ArrayList<String> drinkList = new ArrayList<String>();
		drinkList.add("soda");
		drinkList.add("tea");

		groceryList.add(bakeryList);
		groceryList.add(produceList);
		groceryList.add(drinkList);

		// System.out.println(groceryList);
		System.out.println(groceryList.get(2).get(1));

	}

}
