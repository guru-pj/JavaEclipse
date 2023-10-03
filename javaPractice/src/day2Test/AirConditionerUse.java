package day2Test;

public class AirConditionerUse {
	public static void main(String[] args) {
		AirConditioner a1 = new AirConditioner();
		AirConditioner a2 = new AirConditioner();

		a1.b = "Hitachi";
		a1.p = 39000;
		a1.nOw = 10;
		a1.isQ = false;

		a2.b = "Samsung";
		a2.p = 45000;
		a2.nOw = 8;
		a2.isQ = true;

		System.out.println(a1.b + " " + a1.p + " " + a1.nOw + " " + a1.isQ);
		System.out.println(a2.b + " " + a2.p + " " + a2.nOw + " " + a2.isQ);

	}
}
