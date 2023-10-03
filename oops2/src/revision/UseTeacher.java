package revision;

public class UseTeacher {
	public static void main(String[] args) {
		Teacher t = new Teacher("Naksh", 28, 1173, 30000, "Science", 6);
		System.out.println(t.toString() + " " + t.gender());
	}
}
