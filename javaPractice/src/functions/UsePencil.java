package functions;

public class UsePencil {
	public static void main(String[] args) {
		Pencil p1 = new Pencil();
		Pencil p2 = new Pencil();
		Pencil p3 = new Pencil();

		p1.brand = "apsara";
		p1.price = 10;
		p1.color = "Black";

		p2.brand = "natraj";
		p2.price = 20;
		p2.color = "Red";

		p3.brand = "camlin";
		p3.price = 30;
		p3.color = "blue";

		p3.findMaxPrice(p1.price, p2.price, p3.price);

		int[] prices = { p1.price, p2.price, p3.price, 40, 50 };
		int[] discounts = { 1, 2, 3, 4, 5 };

		System.out.println(p1.findMax(prices));
		System.out.println(p1.findMax(discounts));

	}
}
