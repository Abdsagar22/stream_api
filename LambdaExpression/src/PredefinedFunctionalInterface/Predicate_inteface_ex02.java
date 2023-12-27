package PredefinedFunctionalInterface;

import java.util.function.Predicate;

public class Predicate_inteface_ex02 
{
	public static void main(String[] args) {
		Predicate<String> pr = s->
			(s.length()>5)
		;

		System.out.println(pr.test("sagara"));

		System.out.println(pr.test("saga"));

	}
}