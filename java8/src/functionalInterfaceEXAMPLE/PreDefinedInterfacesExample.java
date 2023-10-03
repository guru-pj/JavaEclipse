package functionalInterfaceEXAMPLE;

import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PreDefinedInterfacesExample {
	public static void main(String[] args) {
	//Function<input,output> -> apply(w)	
		Function<Integer, String> fun = (a) -> "The value of a is= " + a;
		System.out.println(fun.apply(500));
	//Consumer<input> -> accept(w)
		Consumer<Integer> con = (a) -> System.out.println(a + 500);
		con.accept(1000);
	//Supplier<output> -> get();
		Supplier<String> sup = () -> "Hello";
		System.out.println(sup.get());
	//Predicate<input> -> test(w)
		Predicate<Integer> pre = (a) -> a % 2 == 0;
		System.out.println(pre.test(100));
		
		
		
	}
}
