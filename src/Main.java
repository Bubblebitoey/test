import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Dog dog = null;
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		if (a.equalsIgnoreCase("dog")) dog = new Dog();

		if (dog != null) System.out.println(dog.toString());
		else System.err.println("dog isn't exist.");

	}
}
