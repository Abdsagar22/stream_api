package FilterMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Filter_01 {

	public static void main(String[] args) {
		
//    		ArrayList<Integer> a =new ArrayList<Integer>();
//		
//		a.add(10);
//		a.add(20);
//		a.add(50);
//		a.add(60);
//		a.add(40);
//		
//		System.out.println(a);
		 
		List<Integer> a = Arrays.asList(10,20,45,25,36,12,25);
		List<Integer> newarraylist= new ArrayList<Integer>();
		
//		for (Integer integer : a) 
//		{
//			if(integer%2 ==0)
//			{
//				System.out.println(integer);
//				 newarraylist.add(integer);
//			}
//		}
//		
		newarraylist=a.stream().filter(n->n%2==0).collect(Collectors.toList());
		
		a.stream().filter(n->n%2==0).forEach(s->System.out.println(s));

		a.stream().filter(n->n%2==0).forEach(System.out::println);

		
		System.out.println(newarraylist);

	}

}
