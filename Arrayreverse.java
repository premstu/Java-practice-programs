package myproject;
import java.util.Scanner;

public class Arrayreverse {
	public static void main(String[] args) {
		int num;
		Scanner fun = new Scanner(System.in);
		num = fun.nextInt();
		int [] Array = new int[num];
		
		System.out.print(" Please Enter " + num + " elements of an Array  : ");
		for (int i = 0; i < num; i++)
		{
			Array[i] = fun.nextInt();
		}    
		 System.out.println("Original array: ");  
	        for (int i = 0; i < Array.length; i++) {  
	            System.out.print(Array[i] + " ");  
	        }  
	        System.out.println();  
	        System.out.println("Array in reverse order: ");  
	        //int [] arr;
	        for (int i = Array.length-1; i >= 0; i--) {  
	            System.out.print(Array[i] + " ");  
	        }
		
		
		
	}

}
