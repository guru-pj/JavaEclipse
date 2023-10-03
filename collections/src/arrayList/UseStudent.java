package arrayList;

import java.util.*;

public class UseStudent {
	public static void main(String[] args) {
		Student s1 = new Student("Guru", 17, 9944726265l, true);
		Student s2 = new Student("Dilip", 16, 9987877887l, true);
		Student s3 = new Student("Vishnu", 15, 9565576678l, true);
		Student s4 = new Student("Nayan", 19, 9945243564l, false);

		ArrayList<Student> students = new ArrayList<>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);

		// students.forEach(i -> System.out.println(i));

		for (int j = 0; j < students.size(); j++) {
			System.out.println(students.get(j));
		}
		// find max age of student and his details
		int maxAge = students.get(0).getAge();
		Student maxStudent = students.get(0);
		for (Student i : students) {
			if (i.getAge() > maxAge) {
				maxAge = i.getAge();
				maxStudent = i;
			}
		}
		System.out.println(maxAge);
		System.out.println(maxStudent);

		ArrayList<Student> maleStudents = new ArrayList<>();
		ArrayList<Student> femaleStudents = new ArrayList<>();

		students.forEach(i -> {
			if (i.getisMale()) {
				maleStudents.add(i);
			} else {
				femaleStudents.add(i);
			}
		});
		System.out.println(maleStudents);
		System.out.println(femaleStudents);
		// femaleStudents.removeAll(femaleStudents); // to remove all inside ArrayList
	}
}
