package myproject;
import java.util.Scanner;
public class Perfectsquare {
	public static void main(String[] args) 
	 {
	System.out.print("Enter any number:");
	Scanner done = new Scanner(System.in);
	double num = done.nextDouble(); 
	double sq = Math.sqrt(num); 
	if ((sq-Math.floor(num))==0)
		System.out.print(num+ " is a perfect square number"); 
	else
		System.out.print(num+ " is not a perfect square number"); 
	
	
	 }

}
