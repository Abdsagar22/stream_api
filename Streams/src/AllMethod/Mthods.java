package AllMethod;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Mthods {

	public static void main(String[] args) {
		
		//sorted
		//for integer
		
		List<Integer> number = Arrays.asList(25,24,61,85,265,12,36,15,12);
		
		List<Integer>	sorted=number.stream().sorted().collect(Collectors.toList());
		System.out.println(sorted);
		
		List<Integer>	sorteddesc=number.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		System.out.println(sorteddesc);
		
		// for String
		
		List<String> names= Arrays.asList("sagatr" , "vadi" , "chetan" , "sunoil");
		
		List<String> soterdnames=names.stream().sorted().collect(Collectors.toList());
		
		System.out.println(soterdnames);
		List<String> dessoterdnames=names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		
		System.out.println(dessoterdnames);
		
		
		
		// all match
		
		
		
		

	}

}
