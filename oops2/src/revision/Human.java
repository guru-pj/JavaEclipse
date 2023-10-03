package revision;

public class Human {
	private String name;
	private int age;

	public String gender() {
		return "Male";
	}

	public Human(String n, int i) {
		name = n;
		age = i;

	}

	public String toString() {
		return name + " " + age + " ";
	}
}
