package day2;

public class HWCarDrivingUse {
	public static void main(String[] args) {

		HWCarDriving cd = new HWCarDriving();
		cd.brand = "BMW";
		cd.price = 4400000;

		cd.up(); // no result as we used returntype
		System.out.println(cd.up()); // prints 
		//or
		cd.forward();// prints as we used a void returntype and SOPln inside the method
		System.out.println();

		System.out.println(cd.down());
		//or
		cd.backward();
		System.out.println();

		System.out.println(cd.left());
		//or
		cd.l();
		System.out.println();

		System.out.println(cd.Right());
		//or
		cd.r();
		System.out.println();

		System.out.println(cd.stop());
		//or
		cd.s();
		System.out.println();

	}

}
