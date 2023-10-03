package revision;

public class Teacher extends Employee {
	private String major;
	private int experience;

	public String gender() {
		return "Female";
	}

	public Teacher(String n, int i, int ids, int s, String m, int e) {
		super(n, i, ids, s);
		major = m;
		experience = e;

	}

	public String toString() {
		return super.toString() + major + " " + experience + " ";
	}
}
