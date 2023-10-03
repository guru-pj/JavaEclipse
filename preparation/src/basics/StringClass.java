package basics;

public class StringClass {
// 	*String is Class
//	*can be created in 2 ways 1)->string literals, 2)->using new keyword
//		1)String Literal ->
// 	
	public static void main(String[] args) {
		System.out.println("                                   Creating Strings in 2ways(immutable)");
//creating String in normal ways(immutable)	
		// 1)string literal
		String name = "Guru";// creating string in String literal way->stores in StringPool memory(part of
								// the heap memory)
		String name2 = "Guru";
		System.out.println(name + " " + name.hashCode() + " Memory:" + System.identityHashCode(name)); // old hashCode
		name = name.concat("moorthy");
		System.out.println(name + " " + name.hashCode() + " Memory:" + System.identityHashCode(name)); // new hashCode
		// 2)using new keyword
		String b = new String("Vishnu"); // creating string with new keyword->stores directly in HeapMemory//immutable
											// same as literal way
//memory 
		System.out.println(name2 + " " + name2.hashCode() + " Memory:" + System.identityHashCode(name2));

		// ********that is why String is immutable********

//creating String for making it mutable
		System.out.println("                                   making Strings mutable using 2 class");

		// 1)using StringBuffer class
		StringBuffer c = new StringBuffer("Sathya");
		System.out.println(c + " " + c.hashCode() + " Memory:" + System.identityHashCode(c));
		c = c.append("moorthy");
		System.out.println(c + " " + c.hashCode() + " Memory:" + System.identityHashCode(name2));

		// 2)using StringBuilder class
		StringBuffer d = new StringBuffer("Sathya");
		System.out.println(d + " " + d.hashCode() + " Memory:" + System.identityHashCode(d));
		d = d.append("moorthy");
		System.out.println(d + " " + d.hashCode() + " Memory:" + System.identityHashCode(name2));

	}
}
