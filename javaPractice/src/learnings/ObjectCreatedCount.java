package learnings;

public class ObjectCreatedCount {
	static int count = 0;
	public int id;

	public ObjectCreatedCount() {
		count++;
		id = count;
	}

	public static void printCount() {
		System.out.println("Number of instances: " + count);
	}

	public void printId() {
		System.out.println("Instance ID: " + id);
	}

	public static void main(String[] args) {

		ObjectCreatedCount e1 = new ObjectCreatedCount();
		ObjectCreatedCount e2 = new ObjectCreatedCount();
		ObjectCreatedCount e3 = new ObjectCreatedCount();
		ObjectCreatedCount e4 = new ObjectCreatedCount();

		e1.printId();
		e2.printId();
		e3.printId();
		e4.printId();

		ObjectCreatedCount.printCount();
	}
}
