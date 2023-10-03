package arrayList;

import java.util.ArrayList;

public class UseMobile {
	public static void main(String[] args) {
		Mobile m1 = new Mobile("Oppo", "Silver", 6, false, 14999);
		Mobile m2 = new Mobile("Xiaomi", "Red", 4, false, 10999);
		Mobile m3 = new Mobile("Samsung", "Purple", 8, true, 34999);
		Mobile m4 = new Mobile("Apple", "Grey", 4, true, 68999);

		ArrayList<Mobile> mobiles = new ArrayList<>();
		mobiles.add(m1);
		mobiles.add(m2);
		mobiles.add(m3);
		mobiles.add(m4);
		// Maxrammobile print using for loop
		System.out.println("MAX RAM MOBILE");
		Mobile maxMobile = mobiles.get(0);
		for (int i = 0; i < mobiles.size(); i++) {
			if (mobiles.get(i).getRam() > maxMobile.getRam()) {
				maxMobile = mobiles.get(i);
			}
		}
		System.out.println(maxMobile);

		// MaxPriceMobile print using enhanced for loop
		System.out.println("MAX PRICE MOBILE");
		for (Mobile i : mobiles) {
			if (i.getPrice() > maxMobile.getPrice()) {
				maxMobile = i;
			}
		}
		System.out.println(maxMobile);

		// WaterProof and Not WaterProof mobile arraylist using forEach() method
		ArrayList<Mobile> withWaterProofMobiles = new ArrayList<>();
		ArrayList<Mobile> withoutWaterProofMobiles = new ArrayList<>();

		mobiles.forEach(i -> {
			if (i.getIsWaterProof()) {
				withWaterProofMobiles.add(i);
			} else {
				withoutWaterProofMobiles.add(i);
			}
		});
		System.out.println("WithWaterProofMobiles");
		System.out.println(withWaterProofMobiles);
		System.out.println("WithoutWaterProofMobiles");
		System.out.println(withoutWaterProofMobiles);

		// Add 5k to price for all above 4gb ram mobiles

		mobiles.forEach(i -> {
			if (i.getRam() > 4) {
				i.setPrice(i.getPrice() + 5000);
			}
		});

	}
}
