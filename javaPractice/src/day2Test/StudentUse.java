package day2Test;

public class StudentUse {
	public static void main(String[] args) {
		Student s1 = new Student();// student1
		Student s2 = new Student();// student2
		Student s3 = new Student();// student3

		s1.n = "siva";
		s1.id = 234;
		s1.age = 14;
		s1.c = "IX";
		s1.aP = 75;
		s1.nP = (240 * s1.aP) / 100;

		s2.n = "mari";
		s2.id = 236;
		s2.age = 15;
		s2.c = "X";
		s2.aP = 80;
		s2.nP = (240 * s2.aP) / 100;

		s3.n = "Valli";
		s3.id = 237;
		s3.age = 13;
		s3.c = "VIII";
		s3.aP = 90;
		s3.nP = (240 * s3.aP) / 100;

		System.out.println(s1.n + " " + s1.nP);
		System.out.println(s2.n + " " + s2.nP);
		System.out.println(s3.n + " " + s3.nP);

	}

}
