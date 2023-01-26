import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("What is your name?");
		String name = scanner.nextLine();
		System.out.println("How old are your?");
		int age = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("what is your favorite food?");
		String food = scanner.nextLine();
		System.out.println("Hello "+name);
		System.out.println("Your are "+age+ " years old");
		System.out.println("Your like "+food);

	}

}
