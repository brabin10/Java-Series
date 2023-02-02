
public class Main {

	public static void main(String[] args) {

		// method = a block of code that is executed whenever it is called upon
//		
//		int x = 4;
//		int y = 5;
//		
//		int z = add(x,y);
//	
//		System.out.println(z);
//	}
//		static int add(int x, int y) {
//			int z = x + y;
//			return z;
//		}
//	}

		String name = "Rob";
		int age = 21;
		hello(name, age);
	}

	static void hello(String name, int age) {
		System.out.println("Hello " + name);
		System.out.println("You are " + age);
	}
}