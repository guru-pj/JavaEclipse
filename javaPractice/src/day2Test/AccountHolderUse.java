package day2Test;

public class AccountHolderUse {
	public static void main(String[] agrs) {
		AccountHolder a1 = new AccountHolder();
		AccountHolder a2 = new AccountHolder();
		AccountHolder a3 = new AccountHolder();

		a1.n = "mano";
		a1.age = 26;
		a1.g = "Male";
		a1.acNo = 28330485612583l;
		a1.mI = 21000;
		a1.sP = 18;
		a1.sA = (a1.mI * a1.sP) / 100;

		a2.n = "Savithri";
		a2.age = 25;
		a2.g = "Female";
		a2.acNo = 28330485612584l;
		a2.mI = 20000;
		a2.sP = 20;
		a2.sA = (a2.mI * a2.sP) / 100;

		a3.n = "Kamban";
		a3.age = 30;
		a3.g = "Male";
		a3.acNo = 28330485612585l;
		a3.mI = 30000;
		a3.sP = 10;
		a3.sA = (a3.mI * a3.sP) / 100;

		System.out.println(a1.n + " " + a1.sA);
		System.out.println(a2.n + " " + a2.sA);
		System.out.println(a3.n + " " + a3.sA);

	}

}
