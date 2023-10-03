package day2Test;

public class EmployeeUse {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();

		e1.eN = "Guru";
		e1.eId = 1173;
		e1.dob = "19.06.1994";
		e1.sNo = 9944726265l;

		e2.eN = "Dilip";
		e2.eId = 1188;
		e2.dob = "10.09.1995";
		e2.sNo = 8695135382l;

		System.out.println(e1.eN + " " + "+91" + e1.sNo);
		System.out.println(e2.eN + " " + "+91" + e2.sNo);

	}
}
