/**
 * Created by kamontat on 26/4/59.
 */
public class Cat {
	private String name;
	private int age;

	public Cat() {
		name = "your Cat";
		age = 0;
	}

	public Cat(String name) {
		this.name = name;
		this.age = 0;
	}

	public Cat(String name, int age) {
		this.age = age;
		this.name = name;
	}
}
