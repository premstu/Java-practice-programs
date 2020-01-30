package myproject;
import java.util.Scanner;
public class Oddoreven {
	public static void main(String[] args)
	{
		int num,itr;
		System.out.println("enter the range");
		Scanner fun = new Scanner(System.in);
		num = fun.nextInt();
		System.out.println("even are");
		for( itr=2; itr<=num; itr++)
		{   
			System.out.println(+itr);
			itr=itr+1;
	    }
		System.out.println("odd");
		for( itr=1; itr<=num; itr++)
		{   
			System.out.println(+itr);
			itr=itr+1;
	    }
		
	}

}
