package for2And3;

public class AvgPriceOfBags {
	public static void main(String[] args) {
		Bag b1 = new Bag();
		Bag b2 = new Bag();
		Bag b3 = new Bag();
		Bag b4 = new Bag();
		Bag b5 = new Bag();

		b1.brand = "Hunter";
		b1.price = 2999;
		b1.color = "Black";
		b1.noOfZips = 5;
		b1.bagType = "BackPack";

		b2.brand = "American Toristor";
		b2.price = 1999;
		b2.color = "Red";
		b2.noOfZips = 4;
		b2.bagType = "BackPack";

		b3.brand = "Pink";
		b3.price = 2599;
		b3.color = "Blue";
		b3.noOfZips = 3;
		b3.bagType = "HandBag";

		b4.brand = "Gucci";
		b4.price = 5999;
		b4.color = "Peach";
		b4.noOfZips = 2;
		b4.bagType = "BackPack";

		b5.brand = "Lotus";
		b5.price = 1099;
		b5.color = "Black";
		b5.noOfZips = 2;
		b5.bagType = "BackPack";

		Bag[] bags = { b1, b2, b3, b4, b5 };
		int count = 0, sum = 0;
		for (int i = 0; i < bags.length; i++) {
			sum = sum + bags[i].price;
			count = count + 1;
		}
		System.out.println("AvgPrice=" + sum / count);

	}
}
