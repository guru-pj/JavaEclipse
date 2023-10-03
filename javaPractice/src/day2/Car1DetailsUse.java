package day2;

public class Car1DetailsUse {

	public static void main(String[] args) {

		Car1Details c1 = new Car1Details();
		Car1Details c2 = new Car1Details();
		Car1Details c3 = new Car1Details();

		c1.brand = "Toyoto";
		c1.colour = "Black";
		c1.price = 150000;
		c1.taxPercent = 10;
		c1.taxAmount = (c1.price * c1.taxPercent) / 100;
		c1.netPrice = c1.price + c1.taxAmount;

		System.out.println(c1.brand + " " + c1.colour + " " + c1.price + " " + c1.taxPercent + " " + c1.taxAmount + " "
				+ c1.netPrice);

	}
}
