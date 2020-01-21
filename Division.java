package myproject;
import java.util.Scanner;

public class Division 
{
	public static void main(String[] args)
	{
		//int dividend;
		//int divisor;
		Scanner myObj = new Scanner(System.in);
		System.out.println("enter the dividend");
		int dividend = myObj.nextInt();
		System.out.println("enter the divisor");
		int divisor = myObj.nextInt();
		int quotient;
		quotient=dividend/divisor;
		System.out.println("Quotient=" +quotient);
		int remainder;
		remainder=dividend%divisor;
		System.out.println("Remainder=" +remainder);
	}

}
