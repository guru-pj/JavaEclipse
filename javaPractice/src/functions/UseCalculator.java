package functions;

public class UseCalculator {

	public static void main(String[] args) {
		Calculator c = new Calculator();

		int addRes = c.add(2, 2);
		System.out.println(addRes);

		int subRes = c.sub(2, 2);
		System.out.println(subRes);

		int mulRes = c.mul(2, 2);
		System.out.println(mulRes);

		int divRes = c.div(2, 2);
		System.out.println(divRes);
		System.out.println("Next void Prints ");

		c.addv(2, 2);
		c.subv(2, 2);
		c.mulv(2, 2);
		c.divv(2, 2);
	}
}
