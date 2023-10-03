package encapsulation;

public class UseStudent {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("Guru");
		s1.setAge(16);
		s1.setHeight(5.6f);
		s1.setStandard("XII");

		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		System.out.println(s1.getHeight());
		System.out.println(s1.getStandard());

	}
}
