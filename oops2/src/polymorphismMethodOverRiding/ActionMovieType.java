package polymorphismMethodOverRiding;

public class ActionMovieType extends Movie {

	public void fightSequence(int n) {
		if (n > 0 && n <= 3) {
			System.out.println("Low Level Action Movie");
		} else if (n > 3 && n <= 6) {
			System.out.println("Normal Action Movie");
		} else if (n > 6) {
			System.out.println("HadrCore Action Movie");
		}
	}
}
