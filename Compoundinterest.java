package myproject;
import java.util.Scanner;

public class Compoundinterest {
	
	public static void main(String[] args)
	{
		float res=1,compint;
		float x;
		Scanner fun = new Scanner(System.in);
		System.out.println("enter the principle");
		int principle= fun.nextInt();
		System.out.println("enter the time");
		int time= fun.nextInt();
		System.out.println("enter the rot");
		float rot= fun.nextInt();
		
		x=1+(rot/100);
		System.out.println("x=" +x);
		
		for(int i=1;i<=time;i++)
		{
			res=res*x;
		}
		System.out.println("res=" +res);
		compint=principle*res;
		System.out.println("compound interest" +compint);
		
		
	}

}
