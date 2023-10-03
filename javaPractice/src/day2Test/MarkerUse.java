package day2Test;

public class MarkerUse {
	public static void main(String[] args) {

		Marker m1 = new Marker();
		Marker m2 = new Marker();
		Marker m3 = new Marker();

		m1.p = 20;
		m1.c = "Black";
		m1.w = 15;
		m1.isQ = false;

		m2.p = 18;
		m2.c = "Red";
		m2.w = 18;
		m2.isQ = true;

		m3.p = 45;
		m3.c = "Black";
		m3.w = 20;
		m3.isQ = true;

		System.out.println(m1.p + " " + m1.c + " " + m1.w + " " + m1.isQ);
		System.out.println(m2.p + " " + m2.c + " " + m2.w + " " + m2.isQ);
		System.out.println(m3.p + " " + m3.c + " " + m3.w + " " + m3.isQ);

	}

}
