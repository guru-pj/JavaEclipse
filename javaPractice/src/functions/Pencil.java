package functions;

public class Pencil {

	String brand;
	int price;
	String color;
	int discount;

	public void findMaxPrice(int a, int b, int c) {
		if (a > b && a > c) {
			System.out.println(a);
		} else if (b > a && b > c) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}
	}

	public int findMax(int[] a) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}

		return max;
	}

//	public String findStartWithA(String a,String b,String c) {

//		if(a.startsWith("a")) {
//			return a;
//		} else if(b.startsWith("a")) {
//			return b;
//			
//		} else if(c.startsWith("a")) {
//			return c;

//		}

}
