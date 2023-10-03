package MethodOverLoading;

public class Calculator {

	public int add(int n1, int n2) {
		return n1 + n2;
	}

	public int add(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}

	public int add(String s1, String s2) {
		return s1.length() + s2.length();
	}
}
