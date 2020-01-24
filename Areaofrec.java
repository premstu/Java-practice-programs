package myproject;
import java.util.Scanner;
public class Areaofrec {
	public static void main(String[] args) 
	 {
		  Scanner lala = new Scanner(System.in);
		   System.out.println("Enter the length of Rectangle:");
		   double length = lala.nextDouble();
		   System.out.println("Enter the width of Rectangle:");
		   double width = lala.nextDouble();
		   double area = length*width;
		   System.out.println("Area of Rectangle is:"+area);
	 }
	

}
