package revision;

public class UsePen {
	public static void main(String[] args) {
		Refill r = new Refill("Reynolds", 10);
		Pen p = new Pen("Reynolds", 20, r);
		System.out.println(r);
		System.out.println(p);

		Pen p1 = new Pen("Natraj", 30, r);
		System.out.println(p1);
	}
}
