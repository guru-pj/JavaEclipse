package day2;

public class ShirtDetailsUse {
	public static void main(String[] args) {

		ShirtDetails s1 = new ShirtDetails();
		ShirtDetails s2 = new ShirtDetails();
		ShirtDetails s3 = new ShirtDetails();

		s1.brand = "Arrow";
		s1.colour = "Red";
		s1.price = 1000;
		s1.discountPercentage = (s1.price * 10) / 100;
		s1.netPrice = s1.price - s1.discountPercentage;

		System.out.println(s1.brand);
		System.out.println(s1.colour);
		System.out.println(s1.price);
		System.out.println(s1.discountPercentage);
		System.out.println(s1.netPrice);

	}

}
