package programs;

import java.util.*;
import java.util.stream.Collectors;

//Question-> int[]->bubbleSort

//1-> sort using inbuilt method->comparator.compareto()
//2-> bubble sorting
//3-> second highest
//4-> find and print duplicates
//5-> duplicates count

public class BubbleSorting {

	public static void bubbleSortingIntArray(int[] iA) {
		int n = iA.length;
		int t = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {// for starts with 1 so ends at j<(n-i-1)//or if starts with zero then
												// ends
												// at j<n-i-1
				// swaping the elements
				if (iA[j - 1] > iA[j]) { // for starts with 1 so condition iA[j-1]>iA[j]//or starts with 0 so condition
											// iA[j]>iA[j+1]

					t = iA[j - 1];
					iA[j - 1] = iA[j];
					iA[j] = t;
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] a = { 12, 4, 55, 14, 66, 8, 10, 4, 10 };

// 1)-> sorting using streams
		System.out.println("                                Sorting using streams");
		ArrayList<Integer> iAl = new ArrayList<>();
		// or List<Integer> iAl2 = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			iAl.add(a[i]);
		}
		List<Integer> iAlnew = iAl.stream().sorted().collect(Collectors.toList());
		System.out.println(iAlnew);

// 2)-> printing sorted array using bubble sorting
		// bubble sorting method
		System.out.println("                                Sorting using bubbleSort(for loop)");
		bubbleSortingIntArray(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println(Arrays.toString(a));

// 3)-> finding second highest 
		System.out.println("                                Second highest after sorting");
		System.out.println(a[a.length - 2]);

// 4)-> find and print duplicates
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				int c = 1;
				if (a[i] == a[j]) {
					c++;
					System.out.println(a[j] + " Count:" + c);
				}
			}
		}

// 5)-> duplicates with count

	}
}
