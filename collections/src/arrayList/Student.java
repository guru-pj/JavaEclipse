package arrayList;

public class Student {
	private String name;
	private int age;
	private long phoneNo;
	private boolean isMale;

	public void setName(String n) {
		name = n;
	}

	public void setAge(int a) {
		age = a;
	}

	public void setPhoneNo(long p) {
		phoneNo = p;
	}

	public void setisMale(boolean is) {
		isMale = is;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public boolean getisMale() {
		return isMale;
	}

	public Student(String n, int a, long p, boolean is) {
		name = n;
		age = a;
		phoneNo = p;
		isMale = is;
	}

	public String toString() {
		return name + ", " + age + " " + phoneNo + " " + isMale;
	}

}
