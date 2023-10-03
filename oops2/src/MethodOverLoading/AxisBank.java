package MethodOverLoading;

public class AxisBank {

	public int loanEligibility() {
		return 30000;
	}

	public int loanEligibility(int sal) {
		return (sal * 10) + 30000;
	}

	public int loanEligibility(int sal, int prop) {
		return (sal * 10) + 30000 + prop * 25 / 100;
	}
}
