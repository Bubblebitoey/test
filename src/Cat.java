/**
 * Created by kamontat on 26/4/59.
 */
public class Cat {
	private String name;
	private int age;

	public Cat() {
<<<<<<< HEAD
		name = "your Cat";
		age = 0;
=======
		name = "My Cat";
>>>>>>> 27878866459230902ae8745579f75585ac555f81
	}

	public Cat(String name) {
		this.name = name;
		this.age = 0;
	}

	public Cat(String name, int age) {
<<<<<<< HEAD
		this.age = age;
		this.name = name;
	}
=======

		this.name = name;
		this.age = age;
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
		return "Cat{" + "name='" + name + '\'' + ", age=" + age + '}';
	}
>>>>>>> 27878866459230902ae8745579f75585ac555f81
}
