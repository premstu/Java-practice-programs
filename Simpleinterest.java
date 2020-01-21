package myproject;

import java.util.Scanner;

public class Simpleinterest {
	public static void main(String[] args)
	{
		Scanner fun = new Scanner(System.in);
		System.out.println("enter the principle");
		int principle = fun.nextInt();
		System.out.println("enter the time");
		int time = fun.nextInt();
		System.out.println("enter the rate of interest");
		int rateofinterest = fun.nextInt();
		int simpleint;
		simpleint=(principle*time*rateofinterest)/100;
		System.out.println("simple interest =" +simpleint);
		
		
	}
	}


