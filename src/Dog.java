/**
 * Created by kamontat on 26/4/59.
 */
public class Dog {
	private String name;
	private int age;

	public Dog() {
		name = "your Dog";
		age = 0;
	}

	public Dog(String name) {
		this.name = name;
		this.age = 0;
	}

	public Dog(int age) {
		name = "your Dog";
		this.age = age;
	}

	public Dog(String name, int age) {
		this.age = age;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Dog{" + "name='" + name + '\'' + ", age=" + age + '}';
	}
}

