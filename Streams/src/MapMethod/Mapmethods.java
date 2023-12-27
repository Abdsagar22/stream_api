package MapMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Mapmethods {
	public static void main(String[] args) 
	{
       List<String> names= Arrays.asList("sagar","ingale" , "chetan" , "vadi");
      
       
       for (String name : names) 
       {
	
		
		System.out.println(name.toUpperCase());
	}
       
       
       List<String> modifiednames   =names.stream().map(n->n.toUpperCase()).collect(Collectors.toList());
       
       System.out.println(modifiednames);
	}
}
