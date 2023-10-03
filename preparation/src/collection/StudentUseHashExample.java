package collection;

import java.util.*;

public class StudentUseHashExample {
	public static void main(String[] args) {
		Student s1 = new Student("Guru", 101, "Male", 15);
		Student s2 = new Student("Dilip", 102, "Male", 16);
		Student s3 = new Student("Dharani", 103, "Female", 17);
		Student s4 = new Student("Vishnu", 111, "Male", 16);
		Student s5 = new Student("Vishnu", 121, "Male", 16);

		HashMap<Integer, Student> students = new HashMap<>(10);
		students.put(s1.getRollNo(), s1);
		students.put(s2.getRollNo(), s2);
		students.put(s3.getRollNo(), s3);
		students.put(s4.getRollNo(), s4);
		students.put(s5.getRollNo(), s5);

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s5.hashCode());

		System.out.println(s4.equals(s5));
		students.values().forEach(x -> System.out.println(x));

	}
}
