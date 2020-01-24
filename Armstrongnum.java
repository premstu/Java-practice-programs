package myproject;

import java.util.Scanner;

public class Armstrongnum {

	public static void main(String[] args) {
		
		int num, safe, rem, result = 0;
		System.out.println("Enter the number");
		Scanner fun = new Scanner(System.in);
		num = fun.nextInt();
        safe = num;
        while (safe != 0)
        {
            rem = safe % 10;
            result =result + (rem*rem*rem);
            safe =safe/ 10;
        }
        if(result == num)
            System.out.println(num + " is an Armstrong number.");
        else
            System.out.println(num + " is not an Armstrong number.");

	}

}
