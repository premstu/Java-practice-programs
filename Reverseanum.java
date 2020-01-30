package myproject;

import java.util.Scanner;

public class Reverseanum {

	public static void main(String[] args) 
	{
		int num,reversenum=0;
		System.out.println("Enter the  number");
		Scanner fun = new Scanner(System.in);
		num = fun.nextInt();
		while(num != 0) {
            int digit = num % 10;
            reversenum = reversenum * 10 + digit;
            num =num/10;
		}
		System.out.println("reverse num is "+reversenum);
		for(;num != 0; num =num/10) 
		{
            int digit = num % 10;
            reversenum = reversenum * 10 + digit;
        }
		System.out.println("reverse num is "+reversenum);


	}

}
