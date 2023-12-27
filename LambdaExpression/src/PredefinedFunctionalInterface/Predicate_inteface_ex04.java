package PredefinedFunctionalInterface;

import java.util.function.Predicate;

class Student
{
	String name;
	int Sal;
	int exp;
	public Student(String name, int sal, int exp) {
	
		this.name = name;
		this.Sal = sal;
		this.exp = exp;
	}
	
	
}


public class Predicate_inteface_ex04
{
public static void main(String[] args) 
{
	Student s= new Student("sagar", 50000, 5);
	
	
	Predicate<Student> st= (e)->(e.Sal>5000000 && e.exp>3);
	
	System.out.println(st.test(s));
}
	
}