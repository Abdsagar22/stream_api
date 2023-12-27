package MapMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
class Emp{
	int id;
	String name;
	int sal;
	
	public Emp(int id, String name, int sal) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
}



public class Mapmethods01 {
	public static void main(String[] args) 
	{
		ArrayList<Emp> e = new ArrayList<Emp>();
		e.add(new Emp(1,"sagar",50000));
		
		e.add(new Emp(2,"chetan",40000));
		e.add(new Emp(3,"vadiraj",50000));
		e.add(new Emp(4,"sagar",35000));
		e.add(new Emp(5,"sagar",20000));
		
		
		List<String> chetan=e.stream().filter(n-> n.sal>40000)
		.map(s->s.name).collect(Collectors.toList());
		System.out.println(chetan);
		
	}
}