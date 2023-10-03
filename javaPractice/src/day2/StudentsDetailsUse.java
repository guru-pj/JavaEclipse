package day2;

public class StudentsDetailsUse {
	public static void main(String[] args) {

		StudentDetails s1 = new StudentDetails();
		StudentDetails s2 = new StudentDetails();
		StudentDetails s3 = new StudentDetails();
		StudentDetails s4 = new StudentDetails();
		StudentDetails s5 = new StudentDetails();

		s1.id = 1108;
		s1.name = "Guru";
		s1.age = 27;
		s1.english = 91;
		s1.maths = 90;
		s1.tamil = 88;
		s1.total = s1.maths + s1.tamil + s1.english;
		s1.average = (s1.maths + s1.tamil + s1.english) / 3;

		s2.id = 1177;
		s2.name = "Dilip";
		s2.age = 25;
		s2.english = 88;
		s2.maths = 97;
		s2.tamil = 95;
		s2.total = s2.maths + s2.tamil + s2.english;
		s2.average = (s2.maths + s2.tamil + s2.english) / 3;

		s3.id = 1167;
		s3.name = "Vishnu";
		s3.age = 24;
		s3.english = 99;
		s3.maths = 100;
		s3.tamil = 99;
		s3.total = s3.maths + s3.tamil + s3.english;
		s3.average = (s3.maths + s3.tamil + s3.english) / 3;

		s4.id = 1189;
		s4.name = "Maran";
		s4.age = 28;
		s4.english = 70;
		s4.maths = 80;
		s4.tamil = 90;
		s4.total = s4.maths + s4.tamil + s4.english;
		s4.average = (s4.maths + s4.tamil + s4.english) / 3;

		s5.id = 1102;
		s5.name = "Vinoth";
		s5.age = 25;
		s5.english = 100;
		s5.maths = 99;
		s5.tamil = 91;
		s5.total = s5.maths + s5.tamil + s5.english;
		s5.average = (s5.maths + s5.tamil + s5.english) / 3;

		System.out.println(s1.id + " " + s1.name + " " + s1.age + " " + s1.tamil + " " + s1.maths + " " + s1.english
				+ " " + s1.total + " " + s1.average);
		System.out.println(s2.id + " " + s2.name + " " + s2.age + " " + s2.tamil + " " + s2.maths + " " + s2.english
				+ " " + s2.total + " " + s2.average);
		System.out.println(s3.id + " " + s3.name + " " + s3.age + " " + s3.tamil + " " + s3.maths + " " + s3.english
				+ " " + s3.total + " " + s3.average);
		System.out.println(s4.id + " " + s4.name + " " + s4.age + " " + s4.tamil + " " + s4.maths + " " + s4.english
				+ " " + s4.total + " " + s4.average);
		System.out.println(s5.id + " " + s5.name + " " + s5.age + " " + s5.tamil + " " + s5.maths + " " + s5.english
				+ " " + s5.total + " " + s5.average);

	}

}
