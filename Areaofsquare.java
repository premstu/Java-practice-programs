package myproject;
import java.util.Scanner;

public class Areaofsquare {

	public static void main(String[] args) {
		 System.out.println("Enter Side of Square:");
	   Scanner haha = new Scanner(System.in);
	       double side = haha.nextDouble();
	       double area = Math.pow(side,2); 
	       System.out.println("Area of Square is: "+area);

	}

}
