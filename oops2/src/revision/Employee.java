package revision;

public class Employee extends Human {
	private int id;
	private int salary;

	public Employee(String n, int i, int ids, int s) {
		super(n,i);
		id = ids;
		salary = s;

	}

	public String toString() {
		return super.toString() + id + " " + salary + " ";
	}
}
