package day2Test;

public class FridgeUse {
	// brand model colour price taxpercent5 disPercent8 netprice isDoubledoor
	// find netprice print brand model netprice
	public static void main(String[] args) {
		Fridge f1 = new Fridge();// obj for fridge1
		Fridge f2 = new Fridge();// obj for fridge1

		f1.b = "Samsung";
		f1.m = 1172;
		f1.c = "Red";
		f1.p = 12000;
		f1.taxPer = 5;
		f1.disPer = 8;
		f1.isDd = false;
		f1.nP = f1.p - ((f1.p * f1.disPer) / 100) + ((f1.p * f1.taxPer) / 100);

		f2.b = "LG";
		f2.m = 2345;
		f2.c = "Silver";
		f2.p = 24000;
		f2.taxPer = 5;
		f2.disPer = 8;
		f2.isDd = true;
		f2.nP = f2.p - ((f2.p * f2.disPer) / 100) + ((f2.p * f2.taxPer) / 100);

		System.out.println(f1.b + " " + f1.m + " " + f1.nP);
		System.out.println(f2.b + " " + f2.m + " " + f2.nP);

	}

}
