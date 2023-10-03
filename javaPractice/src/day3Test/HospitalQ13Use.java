package day3Test;

public class HospitalQ13Use {
	public static void main(String[] args) {
		// create details nfor 3 hospitals
		HospitalQ13 h1 = new HospitalQ13();
		HospitalQ13 h2 = new HospitalQ13();
		HospitalQ13 h3 = new HospitalQ13();

		h1.n = "Apollo";
		h1.l = "Chennai";
		h1.is24 = true;

		h2.n = "kauvery";
		h2.l = "Chennai";
		h2.is24 = true;

		h3.n = "SIMS";
		h3.l = "Chennai";
		h3.is24 = true;

		// print the in Capital Letters
		System.out.println(
				"Hospital names are :  " + h1.n.toUpperCase() + " " + h2.n.toUpperCase() + " " + h3.n.toUpperCase());

		// find length of the loactions
		System.out
				.println("Length of the Locations are : " + h1.l.length() + " " + h2.l.length() + " " + h3.l.length());

		// check hosp name1 and hosp name2 are equal
		System.out.println("Does Hospital 1 and 2 have the same name : " + h1.n.equals(h2.n));
	}

}
