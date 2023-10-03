package hashMap;

public class Employee {
	private int id;
	private String name;
	private int age;
	private int salary;
	private String gender;

	public void setId(int i) {
		id = i;
	}

	public void setAge(int a) {
		age = a;
	}

	public void setSalary(int s) {
		salary = s;
	}

	public void setName(String n) {
		name = n;
	}

	public void setGender(String g) {
		gender = g;
	}

	public int getId() {
		return id;
	}

	public int getAge() {
		return age;
	}

	public int getSalary() {
		return salary;
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public Employee(int i, String n, int a, int s, String g) {
		id = i;
		name = n;
		age = a;
		salary = s;
		gender = g;
	}

	public String toString() {
		return id + "," + name + "," + age + "," + salary + "," + gender;
	}

}
