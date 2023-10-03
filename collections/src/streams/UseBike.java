package streams;

import java.util.*;

import java.util.stream.*;

public class UseBike {
	public static void main(String[] args) {
		Bike b1 = new Bike("TN05BS1179", "Hero", "Splendor", "Black", 79000);
		Bike b2 = new Bike("TN17AS2548", "Honda", "Shine", "Blue", 99000);
		Bike b3 = new Bike("TN68BJ5890", "Honda", "Activa", "Grey", 110000);
		Bike b4 = new Bike("TN43FY3894", "Hero", "Passion", "Red", 85000);
		Bike b5 = new Bike("TN37DM2058", "Yamaha", "R15", "Black", 179000);
		Bike b6 = new Bike("TN29WH2875", "Suzuki", "Access", "Silver", 114000);
		Bike b7 = new Bike("TN39EM0892", "Yamaha", "Fazer", "Black", 149000);

		ArrayList<Bike> bikes = new ArrayList<>();
		bikes.add(b1);
		bikes.add(b2);
		bikes.add(b3);
		bikes.add(b4);
		bikes.add(b5);
		bikes.add(b6);
		bikes.add(b7);

		List<Bike> blackBikes = bikes.stream().filter(x -> x.getColour().equals("Black") && x.getPrice() > 80000)
				.collect(Collectors.toList());
		// Long l = bikes.stream().filter(x -> x.getColour().equals("Black") &&
		// x.getPrice() > 80000).count();
		// System.out.println(l);
		// System.out.println(blackBikes);

		List<String> blackBikeBrands = bikes.stream().filter(x -> x.getColour().equals("Black")).map(x -> x.getBrand())
				.collect(Collectors.toList());
		// System.out.println(blackBikeBrands);

		System.out.println("\n" + "                          List to Map using streams");
		Map<String, Bike> blackBikesMap = bikes.stream().filter(x -> x.getColour().equals("Black"))
				.collect(Collectors.toMap(x -> x.getNoPlate(), y -> y));

		// blackBikesMap.keySet().forEach(i ->
		// System.out.println(blackBikesMap.get(i)));

		// Map<String> blackBikeMap = bikes.stream().filter(x ->
		// x.getColour().equals("Black"))
		// .collect(Collectors.toMap());

		// List<String> blackBikePrice = bikes.stream().filter(x ->
		// x.getColour().equals("Black").peek().collect(Collectors.toList());

		// peek() methods in streams

//		bikes.stream().filter(s -> s.getColour().equals("Black")).map(x -> x.getPrice())
//				.peek(x -> System.out.println("Mapped Price +" + (x + 10)));

		List<Bike> b = bikes.stream().filter(x -> x.getPrice() > 100000).peek(x -> x.setPrice(x.getPrice() + 90))
				.collect(Collectors.toList());
		b.forEach(x -> System.out.println(x));

// 		max() min() in stream
		System.out.println("                          The min() and max() print is : ");
		Bike min = bikes.stream().max(Comparator.comparingInt(x -> x.getPrice())).get();
		System.out.println(min);

//		summing() in stream
		System.out.println("                          The summing() print is : ");
		int sum = bikes.stream().collect(Collectors.summingInt(x -> x.getPrice()));
		System.out.println(sum);

	}
}
