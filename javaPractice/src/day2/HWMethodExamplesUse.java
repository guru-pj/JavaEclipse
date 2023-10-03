
package day2;

public class HWMethodExamplesUse {
	public static void main(String[] args) {

		System.out.println("Students List For Inter-School Quiz 2023");
		
		HWMethodExamples me = new HWMethodExamples();
		// me.m1(1, "Hello, Hi"); // no result as we used returntype of String
		me.m1("ID  ", "NAME ", " CLASS", "RANK", "ATTENDANCE%");// prints
		System.out.println();
		
		me.m2(1273, "GURU   ", 12, 26, 89);// prints as we used returntype of void

		me.m2(1125, "DILIP  ", 11, 12, 91);

		me.m2(1044, "VISHNU ", 10, 8, 82);

		me.m2(958, " SATHYA  ", 9, 20, 77);

		me.m2(1256, "VINOTH ", 12, 11, 96);
	}

}
