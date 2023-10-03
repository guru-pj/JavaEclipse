package MethodOverLoading;

public class UseAxisBank {
	public static void main(String[] args) {
		AxisBank b = new AxisBank();
		System.out.println(b.loanEligibility());
		System.out.println(b.loanEligibility(30000));
		System.out.println(b.loanEligibility(30000, 1000000));
	}
}
