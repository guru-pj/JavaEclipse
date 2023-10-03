package hashMap;

import java.util.*;

public class UseBike {
	public static void main(String[] args) {
		Bike b1 = new Bike("TN05BS1179", "Hero", "Splendor", "Black", 79000);
		Bike b2 = new Bike("TN17AS2548", "Honda", "Shine", "Blue", 99000);
		Bike b3 = new Bike("TN68BJ5890", "Honda", "Activa", "Grey", 110000);
		Bike b4 = new Bike("TN43FY3894", "Hero", "Passion", "Red", 85000);
		Bike b5 = new Bike("TN37DM2058", "Yamaha", "R15", "JetBlack", 179000);
		Bike b6 = new Bike("TN29WH2875", "Suzuki", "Access", "Silver", 114000);
		Bike b7 = new Bike("TN39EM0892", "Yamaha", "Fazer", "Green", 149000);

		HashMap<String, Bike> bikes = new HashMap<>();
		bikes.put(b1.getNoPlate(), b1);
		bikes.put(b2.getNoPlate(), b2);
		bikes.put(b3.getNoPlate(), b3);
		bikes.put(b4.getNoPlate(), b4);
		bikes.put(b5.getNoPlate(), b5);
		bikes.put(b6.getNoPlate(), b6);
		bikes.put(b7.getNoPlate(), b7);

//		bikes.keySet().forEach(i -> System.out.println(bikes.get(i)));
		ArrayList<Bike> bikesAl = new ArrayList<>();
		for (String i : bikes.keySet()) {
			bikesAl.add(bikes.get(i));
		}
		bikesAl.forEach(i -> System.out.println(i));

//		bikesAl.forEach(i -> {
//			if (i.getPrice() > 100000) {
//				System.out.println(i);
//			}
//		});

	}

}
