package functions;

public class UseStudent {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();

		s1.tamil = 95;
		s1.english = 90;
		s1.maths = 99;

		s2.tamil = 90;
		s2.english = 91;
		s2.maths = 95;

		s1.total = s1.findtotal();
		s1.display();

		s2.total = s2.findtotal();
		s2.display();

	}
}
