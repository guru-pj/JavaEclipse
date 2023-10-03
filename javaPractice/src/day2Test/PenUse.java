package day2Test;

public class PenUse {
	public static void main(String[] args) {
		Pen p1 = new Pen();
		Pen p2 = new Pen();
		Pen p3 = new Pen();

		p1.b = "Camlin";
		p1.p = 20;
		p1.isB = false;
		p1.w = 5;

		p2.b = "Nataraj";
		p2.p = 15;
		p2.isB = true;
		p2.w = 10;

		p3.b = "Apsara";
		p3.p = 18;
		p3.isB = false;
		p3.w = 5;

		System.out.println((p1.p + p2.p + p3.p) / 3);

	}

}
