package day2;

public class EmployeeDetailsUse {
	public static void main(String[] args) {
		EmployeeDetails e1 = new EmployeeDetails(); // instantiation for employee 1
		EmployeeDetails e2 = new EmployeeDetails(); // instantiation for employee 2
		EmployeeDetails e3 = new EmployeeDetails(); // instantiation for employee 3

		e1.name = "Guru";
		e1.age = 28;
		e1.id = 1173;
		e1.salary = 35500;

		e2.name = "Dilip";
		e2.age = 27;
		e2.id = 1174;
		e2.salary = 39500;

		e3.name = "Lavnaya";
		e3.age = 26;
		e3.id = 1179;
		e3.salary = 45500;

		System.out.println(e1.id);
		System.out.println(e1.name);
		System.out.println(e1.age);
		System.out.println(e1.salary);
		System.out.println();

		System.out.println(e2.id);
		System.out.println(e2.name);
		System.out.println(e2.age);
		System.out.println(e2.salary);
		System.out.println();

		System.out.println(e3.id);
		System.out.println(e3.name);
		System.out.println(e3.age);
		System.out.println(e3.salary);

	}

}
