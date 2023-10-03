package day2;

public class CarDetailsUse {
	public static void main(String[] args) {
		CarDetails c1 = new CarDetails();
		CarDetails c2 = new CarDetails();
		CarDetails c3 = new CarDetails();
		CarDetails c4 = new CarDetails();

		c1.brand = "Maruti";
		c1.colour = "White";
		c1.price = 70000;
		c1.taxAmount = (c1.price * 18) / 100;
		c1.netPrice = c1.price + c1.taxAmount;

		c2.brand = "Toyoto";
		c2.colour = "Green";
		c2.price = 2200000;
		c2.taxAmount = (c2.price * 18) / 100;
		c2.netPrice = c2.price + c2.taxAmount;

		c3.brand = "Kia";
		c3.colour = "Red";
		c3.price = 1400000;
		c3.taxAmount = (c3.price * 18) / 100;
		c3.netPrice = c3.price + c3.taxAmount;

		c4.brand = "Kia";
		c4.colour = "Red";
		c4.price = 1400000;
		c4.taxAmount = (c4.price * 18) / 100;
		c4.netPrice = c4.price + c4.taxAmount;

		System.out.println(c1.brand + " " + c1.colour + " " + c1.price + " " + c1.taxAmount + " " + c1.netPrice);
		System.out.println(c2.brand + " " + c2.colour + " " + c2.price + " " + c2.taxAmount + " " + c2.netPrice);
		System.out.println(c3.brand + " " + c3.colour + " " + c3.price + " " + c3.taxAmount + " " + c3.netPrice);
		System.out.println(c4.brand + " " + c4.colour + " " + c4.price + " " + c4.taxAmount + " " + c4.netPrice);

	}

}
