package myproject;
import java.util.Scanner;

public class Areaoftri {
	public static void main(String args[]) {   
	      Scanner nana = new Scanner(System.in);

	      System.out.println("Enter the width of the Triangle:");
	      double base = nana.nextDouble();

	      System.out.println("Enter the height of the Triangle:");
	      double height = nana.nextDouble();

	      
	      double area = (base* height)/2;
	      System.out.println("Area of Triangle is: " + area);  
	}
}
