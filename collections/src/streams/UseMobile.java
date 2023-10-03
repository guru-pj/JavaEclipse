package streams;

import java.util.*;
import java.util.stream.*;

public class UseMobile {
	public static void main(String[] args) {
		Mobile m1 = new Mobile("Samsung", "A4564SU", 69000, 8, true);
		Mobile m2 = new Mobile("Samsung", "U5677SS", 25000, 8, false);
		Mobile m3 = new Mobile("Xiaomi", "M678MI", 15000, 4, false);
		Mobile m4 = new Mobile("Apple", "I576778", 129000, 6, true);
		Mobile m5 = new Mobile("Oppo", "O7980OL", 27000, 6, false);

		HashMap<String, Mobile> mobiles = new HashMap<>();
		mobiles.put(m1.getModelCode(), m1);
		mobiles.put(m2.getModelCode(), m2);
		mobiles.put(m3.getModelCode(), m3);
		mobiles.put(m4.getModelCode(), m4);
		mobiles.put(m5.getModelCode(), m5);
		// System.out.println(mobiles);

		Map<String, Mobile> costlyMobiles = mobiles.values().stream().filter(x -> x.getPrice() > 100000)
				.collect(Collectors.toMap(x -> x.getModelCode(), y -> y));

		System.out.println(costlyMobiles);

	}
}
