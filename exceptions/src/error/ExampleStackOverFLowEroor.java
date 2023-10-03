package error;

public class ExampleStackOverFLowEroor {
	public void findA() {
		findB();

	}

	public void findB() {
		findA();
	}

	public static void main(String[] args) {
		ExampleStackOverFLowEroor s = new ExampleStackOverFLowEroor();
		s.findA();
	}
}
