package PredefinedFunctionalInterface;

import java.util.function.Predicate;

public class Predicate_inteface_ex06 {
	public static void main(String[] args) {
		int a []= { 10,20,5,15,256,25,80,25,54};
		
		Predicate<Integer> p1 = i -> (i%2==0);
		Predicate<Integer> p2 = i -> (i < 70);
		
//		for (int s : a) 
//		{
//			if (p1.and(p2).test(s)) 
//			{
//				System.out.println(s);
//			}
//		}
//		
//		for (int s : a) 
//		{
//			if (p1.or(p2).test(s)) 
//			{
//				System.out.println(s);
//			}
//		}
		for (int s : a) 
		{
			if (p1.negate().test(s)) 
			{
				System.out.println(s);
			}
		}
		



	}
}
