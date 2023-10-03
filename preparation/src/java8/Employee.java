package java8;

public class Employee {
	private String name;
	private int id;
	private int salary;
	private int age;
	private String gender;
	private String role;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Employee(String name, int id, int salary, int age, String gender, String role) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.age = age;
		this.gender = gender;
		this.role = role;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", age=" + age + ", gender=" + gender
				+ ", role=" + role + "]";
	}

}
