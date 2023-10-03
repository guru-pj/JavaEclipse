package day2Test;

public class ExtraStudent1Use {
	public static void main(String[] args) {

		ExtraStudent1 s1 = new ExtraStudent1();
		ExtraStudent1 s2 = new ExtraStudent1();
		ExtraStudent1 s3 = new ExtraStudent1();

		s1.sN = "Guru";
		s1.sA = 16;
		s1.sNo = 9944726265l;
		s1.sec = 'B';
		s1.mP = 80;

		s2.sN = "Dilip";
		s2.sA = 15;
		s2.sNo = 9944726065l;
		s2.sec = 'D';
		s2.mP = 88;

		s3.sN = "Mukesh";
		s3.sA = 16;
		s3.sNo = 9944726200l;
		s3.sec = 'A';
		s3.mP = 91;

		System.out.println(s1.sN + " " + s1.sA + " " + s1.sNo + " " + s1.sec + " " + s1.mP);
		System.out.println(s2.sN + " " + s2.sA + " " + s2.sNo + " " + s2.sec + " " + s2.mP);
		System.out.println(s3.sN + " " + s3.sA + " " + s3.sNo + " " + s3.sec + " " + s3.mP);

	}
}
