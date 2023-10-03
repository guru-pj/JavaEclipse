package for1Programs;

public class AvgOfAddingNumbers {
	// Add numbers from 1 to n and find the avg
	// Example: 1 to 5
	// Run for loop from 1 to 5 and count the loops
	// the avg of them by dividing total sum/count

	public static void main(String[] args) {
		int add = 0, count = 0;
		for (int i = 1; i <= 5; i++) {
			add = add + i;
			count = count + 1;
		}
		System.out.println(add / count);
	}
}