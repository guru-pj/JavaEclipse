package day2;

public class CalculatorMethodUse {

	public static void main(String[] args) {
		CalculatorMethod c = new CalculatorMethod();
		c.brand = "Casio";
		c.price = 500;

		int result = c.addition();
		System.out.println(result);//first result

		c.add();//2nd result

		c.addition(); // no result
		System.out.println(c.addition());//3rd result

	}

}
