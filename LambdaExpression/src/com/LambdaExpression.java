package com;

@FunctionalInterface
interface cab {
	public void bookcab();

}



//class ola implements cab {
//
//	@Override
//	public void bookcab() {
//		System.out.println("ola cab is booked..............");
//
//	}
//	
//	}


public class LambdaExpression {
	public static void main(String[] args) 
	{
       cab ola =	()->System.out.println("ola cab is booked..............");
       ola.bookcab();
	}
}
