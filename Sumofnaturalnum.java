package myproject;

import java.util.Scanner;

public class Sumofnaturalnum {
	 public static void main(String[] args) 
	 {
	        int num, sum = 0;
	        System.out.println("Enter the number");
			Scanner fun = new Scanner(System.in);
			num = fun.nextInt();
	        for(int i = 1; i <= num; ++i)
	        {
	            sum = sum + i; 
	        }
	        System.out.println("Sum = " + sum);
	    }

}
