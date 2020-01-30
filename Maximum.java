package myproject;
import java.util.Scanner;

public class Maximum {

	public static void main(String[] args) {
		int num1,num2,num3;
		System.out.println("Enter the three number");
		Scanner fun = new Scanner(System.in);
		num1 = fun.nextInt();
		num2 = fun.nextInt();
		num3 = fun.nextInt();
	      if (num1 >= num2 && num1 >= num3)
	         System.out.println( num1 + " is the maximum number.");
	      else if (num2 >= num1 && num2 >= num3)
	         System.out.println( num2 + " is the maximum number.");
	      else
	         System.out.println( num3 + " is the maximum number.");


	}

}
