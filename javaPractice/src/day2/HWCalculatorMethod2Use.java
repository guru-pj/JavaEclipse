package day2;

public class HWCalculatorMethod2Use {
	public static void main(String[] args) {

		HWCalculatorMethod2 m1 = new HWCalculatorMethod2();
		m1.brand = "Casio";
		m1.price = 500;

		System.out.println(m1.addition(2, 2));// 1st print

		m1.add(2, 2);// 2nd print
	}

}
