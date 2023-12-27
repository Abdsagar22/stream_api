package FunctionInterface;

import java.util.function.Function;

public class Ex_01 {
	public static void main(String[] args) {

		Function<Integer, Integer> f= n->n*n;
		
		System.out.println(f.apply(5));
		System.out.println(f.apply(15));
		System.out.println(f.apply(25));
		
		
		Function<String, Integer> s= a->a.length();
		System.out.println(s.apply("sagar"));
		System.out.println(s.apply("sagdqwar"));
		System.out.println(s.apply("sagaasdkjr"));
	}
}
