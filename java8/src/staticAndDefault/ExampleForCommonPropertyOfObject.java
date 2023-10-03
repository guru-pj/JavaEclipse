package staticAndDefault;

public class ExampleForCommonPropertyOfObject {
	public static void main(String[] args) {

		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();

		Student.collegeName = "ABC";
		s1.collegeName = "XYZ";
		s2.collegeName = "LMN";
		s3.collegeName = "YTR";
		System.out.println(Student.collegeName);

	}
}
