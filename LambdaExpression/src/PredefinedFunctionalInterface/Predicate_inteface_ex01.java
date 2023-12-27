package PredefinedFunctionalInterface;

import java.util.function.Predicate;

public class Predicate_inteface_ex01 {
	public static void main(String[] args) {
		Predicate<Integer> pr = i -> (i < 20);

		System.out.println(pr.test(15));

	}
}
