package AllMethod;

import java.util.HashSet;
import java.util.Set;

public class Matchs 
{
  public static void main(String[] args) {
	 
	   Set<String> fruites = new HashSet<String>();
	   fruites.add("one apple");
	   fruites.add("two  mango");
	   fruites.add("one mango");
	   fruites.add("two apple");
	   
	   
	  boolean result= fruites.stream().anyMatch(value->{return value.startsWith("one");});
System.out.println(result);
}
}
