package day2;

public class BikeDetailsUse {

	public static void main(String[] args) {

		BikeDetails b1 = new BikeDetails();
		BikeDetails b2 = new BikeDetails();
		BikeDetails b3 = new BikeDetails();

		b1.brand = "Hero";
		b1.colour = "Black";
		b1.price = 70000;
		b1.discountAmount = (b1.price * 10) / 100;
		b1.netPrice = b1.price - b1.discountAmount;

		b2.brand = "Honda";
		b2.colour = "Blue";
		b2.price = 80000;
		b2.discountAmount = (b2.price * 10) / 100;
		b2.netPrice = b2.price - b2.discountAmount;

		b3.brand = "Ather";
		b3.colour = "green";
		b3.price = 140000;
		b3.discountAmount = (b3.price * 10) / 100;
		b3.netPrice = b3.price - b3.discountAmount;

		System.out.println(b1.brand + " " + b1.colour + " " + b1.price + " " + b1.discountAmount + " " + b1.netPrice);
		System.out.println(b2.brand + " " + b2.colour + " " + b2.price + " " + b2.discountAmount + " " + b2.netPrice);
		System.out.println(b3.brand + " " + b3.colour + " " + b3.price + " " + b3.discountAmount + " " + b3.netPrice);

	}

}
