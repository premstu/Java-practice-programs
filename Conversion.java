package myproject;

public class Conversion {
	public static void main(String[] args)
	{
		int i=200;  
		String s=String.valueOf(i); 
		System.out.println("inte to str");  
		//String s=Integer.toString(i);
		System.out.println(i+100);
		System.out.println(s+100);
		System.out.println("str to long");
		String st="9990449935";  
		long l=Long.parseLong(st); 
		System.out.println(l); 
		System.out.println("long to str");
		long x=9993939399L;  
		String str=String.valueOf(x);  
		System.out.println(str);
		System.out.println("str to float");
		String stri="23.6";  
		float f=Float.parseFloat(stri);  
		System.out.println(f); 
	}

}
