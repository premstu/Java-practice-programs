package myproject;
import java.util.Scanner;

public class Arraysearch {
		
		
		public static void main(String[] args) 
		{
			int i, Number,search;
			Scanner sc = new Scanner(System.in);
		 
			System.out.print(" Please Enter Numberof element in an array : ");
			Number = sc.nextInt();	
			
			int [] Array = new int[Number];
			
			System.out.print(" Please Enter " + Number + " elements of an Array  : ");
			for (i = 0; i < Number; i++)
			{
				Array[i] = sc.nextInt();
			}    
			System.out.print(" Please Enter search number: ");
			search = sc.nextInt();
			for (i = 0; i <Number; i++)
			{
				if(Array[i]==search)
				{
				System.out.print(" search num "+ search +" is present at location " +(i));
				break;
				}
			}
			if(i==Number)
				System.out.print(" search num "+ search +" is not present in array ");
		}

	
}
