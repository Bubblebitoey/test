import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Animal animal = null;
		Scanner scan = new Scanner(System.in);
		String a = scan.nextLine();
		if (a.equalsIgnoreCase("dog")) animal = new Dog();
		if (a.equalsIgnoreCase("cat")) animal = new Cat();

		if (animal != null) System.out.println(animal.toString());
		if (animal instanceof Dog) System.out.println("I am DOG");
		else if (animal instanceof Cat) System.out.println("I am CAT");
		else System.err.println("Who are me?");
	}
}
