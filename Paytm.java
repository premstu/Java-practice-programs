package myproject;
import java.util.Scanner;

public class Paytm {
	public static void main(String[] args)
	{
		int j=1000;
		int temp;
		Scanner myObj = new Scanner(System.in);
		System.out.println("enter the number");
		int i = myObj.nextInt();
		if(i==1)
		{
			temp=j-250;
			System.out.println("total"+temp);
		}
		else if(i==2)
		{
			temp=j+500;
			System.out.println(+temp);
		}
		else {
			System.out.println(+j);}
		
	}

}
