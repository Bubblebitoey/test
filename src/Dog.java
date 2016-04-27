/**
 * Created by kamontat on 26/4/59.
 */
public class Dog extends Animal {
	private String name;
	private int age;

	public Dog() {
		super();
	}

	public Dog(String name) {
		super(name);
	}

	public Dog(String name, int age) {
		super(name, age);
	}

	@Override
	public String toString() {
		return "Dog{" + "name='" + name + '\'' + ", age=" + age + '}';
	}
}

