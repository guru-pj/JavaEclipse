package day4TestLMS;

public class CarDetailsArrayUse {
	public static void main(String[] args) {
		CarDetailsArray c1 = new CarDetailsArray();
		CarDetailsArray c2 = new CarDetailsArray();
		CarDetailsArray c3 = new CarDetailsArray();

		String[] cB = { "Audi", "BMW", "Jaguar" };
		String[] cM = { "Q6", "X5", "JPACE" };
		int[] cECC = { 3800, 4200, 5000 };
		int[] cP = { 4000000, 3500000, 6000000 };
		int[] tPer = { 10, 15, 10 };

		c1.b = cB[0];
		c2.b = cB[1];
		c3.b = cB[2];

		c1.m = cM[0];
		c2.m = cM[2];
		c3.m = cM[2];

		c1.eCC = cECC[0];
		c2.eCC = cECC[1];
		c3.eCC = cECC[2];

		c1.price = cP[0];
		c2.price = cP[1];
		c3.price = cP[2];

		c1.tP = tPer[0];
		c2.tP = tPer[1];
		c3.tP = tPer[2];

		c1.nA = ((cP[0] * tPer[0]) / 100) + cP[0];
		c2.nA = ((cP[1] * tPer[1]) / 100) + cP[1];
		c3.nA = ((cP[2] * tPer[2]) / 100) + cP[2];

		System.out.println("Brands:" + c1.b + "," + c2.b + "," + c3.b + "---");
		System.out.println("Models:" + c1.m + "," + c2.m + "," + c3.m + "---");
		System.out.println("EngineCC:" + c1.eCC + "," + c2.eCC + "," + c3.eCC + "---");
		System.out.println("NetPrice:" + c1.nA + "," + c2.nA + "," + c3.nA);

	}

}
