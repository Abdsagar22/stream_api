package FunctionInterface;

import java.util.function.Function;

public class Ex_02 {
	public static void main(String[] args) {

		Function<Integer, Integer> f= n->n*2 ;
		Function<Integer, Integer> f1= n->n*n*n;
		
		
		
		// in this method f will be execute frist and f1 will second
		
		System.out.println(f.andThen(f1).apply(2));
		
		// in this method f1 will be execute frist and f  will second
		System.out.println(f.compose(f1).apply(2));
		
	}
	
}
