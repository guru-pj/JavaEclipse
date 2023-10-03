package polymorphismMethodOverRiding;

public class UsePrivateBanks {
	public int intAmount(int p) {

		return p;
	}

	public static void main(String[] args) {

		PrivateBanks pb1 = new PrivateBanks();
		System.out.println(pb1.intAmount(500000));
	}
}
