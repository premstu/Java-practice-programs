package myproject;

import java.util.Scanner;

public class Powerofnum {

	public static void main(String[] args)
	{
		int powerofnum=1;
		Scanner fun = new Scanner(System.in);
		System.out.println("enter the num");
		int num = fun.nextInt();
		System.out.println("enter the power");
		int power = fun.nextInt();
		for(int i=1;i<=power;i++)
		{
		powerofnum=powerofnum*num;
		}
		System.out.println("cal.power of num " +powerofnum);
	}

}

