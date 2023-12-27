package com;

@FunctionalInterface
interface Sagar
{
	public String Bookcar(String Origin, String Destinatoon , int price);
}

//class Vadi implements Sagar
//{
//
//	@Override
//	public String Bookcar(String Origin, String Destinatoon, int price) {
//	   System.out.println("your r booked ur ticket from :" + Origin + "to"  + Destinatoon  + "and price of ticcket :"  + price);
//		return Destinatoon;
//	}
//	
//}

public class withArgu 
{
  public static void main(String[] args)
  {
	 Sagar s= (String Origin, String Destinatoon, int price )->
	 {
		  System.out.println("your r booked ur ticket from :" + Origin + "  to : "  + Destinatoon  + "and price of ticcket :"  + price);
			return Destinatoon;
		 
	 };
	 s.Bookcar("bengaluru", "Vijayapur", 800);
}
}
