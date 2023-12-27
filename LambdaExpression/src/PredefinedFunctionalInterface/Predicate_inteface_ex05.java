package PredefinedFunctionalInterface;

import java.util.ArrayList;
import java.util.function.Predicate;

class SagarI
{
	String name;
	int Sal;
	int exp;
	public SagarI(String name, int sal, int exp) {
	
		this.name = name;
		this.Sal = sal;
		this.exp = exp;
	}
	
}


public class Predicate_inteface_ex05
{
public static void main(String[] args) 
{
	SagarI s= new SagarI("sagar", 50000, 5);
	
	
	ArrayList<SagarI> a= new ArrayList<SagarI>();
	a.add(new SagarI("sagar", 50000, 5));
	a.add(new SagarI("amit", 4000, 1));
    a.add(new SagarI("vadirajr", 5000, 2));
    a.add(new SagarI("Chidanand", 30000, 5));
    
    Predicate<SagarI> st= (e)->(e.Sal>5000 && e.exp>3);

    for (SagarI student : a) 
    {
		if (st.test(student)) 
		{
			System.out.println("name of emp" + student.name + "salary of emp :" + student.Sal);
		}
	}
	
	
	
	
	
	
	System.out.println(st.test(s));
}
	
}