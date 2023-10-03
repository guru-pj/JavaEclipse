package Day5ErrorSysOut;

import java.util.Scanner;

public class SearchVowelsInGivenWord {

	Scanner s = new Scanner(System.in);
	System.out.println("Enter The word: ");
	String s1 = s.next();

	if(s1.contains("a","e","i","o","u"))
	{
		System.out.println("Vowel is present in the word ");

	}else
	{
		System.out.println("Vowel is not present in the word ");
	}
}}