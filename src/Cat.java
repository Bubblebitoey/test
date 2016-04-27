/**
 * Created by kamontat on 26/4/59.
 */
public class Cat extends Animal {
	private String name;
	private int age;

	public Cat() {
		super();
	}

	public Cat(String name) {
		super(name);
	}

	public Cat(String name, int age) {
		super(name, age);
	}

	@Override
	public String toString() {
		return "Cat{" + "name='" + name + '\'' + ", age=" + age + '}';
	}
}
