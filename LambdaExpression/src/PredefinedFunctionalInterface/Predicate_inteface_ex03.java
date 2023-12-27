package PredefinedFunctionalInterface;

import java.util.function.Predicate;

public class Predicate_inteface_ex03
{
	public static void main(String[] args) {
		 
		String name[]= {"sagar" , "vadiraj", "Chetan" , "chidu", "amit"};
		 
		Predicate<String> pr = n->(n.length()>4);
		
		for (String names : name) 
		{
			System.out.println( names+pr.test(names));
		}
		
		
	}
	
}