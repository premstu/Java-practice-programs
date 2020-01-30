package myproject;

import java.util.Scanner;

public class MergeoftwoArrays {
	 public static void main(String[] args) {
		 int Number;
		 Scanner sc = new Scanner(System.in);
			System.out.print(" Please Enter Numberof element in an array : ");
			Number = sc.nextInt();	
			int [] Array1= new int[Number];
			int [] Array2= new int[Number];
			System.out.print(" Please Enter " + Number + " elements of an Array  : ");
			for (int i = 0; i < Number; i++)
			{
				Array1[i] = sc.nextInt();
			}    
			for (int i = 0; i < Number; i++)
			{
				Array2[i] = sc.nextInt();
			}    
	      int[]c = new int[Array1.length+Array2.length];
	      int count = 0;
	      
	      for(int i = 0; i < Array1.length; i++) { 
	         c[i] = Array1[i];
	         count++;
	      } 
	      for(int j = 0; j < Array2.length;j++) { 
	         c[count++] = Array2[j];
	      } 
	      for(int i = 0;i < c.length;i++) 
	      System.out.print(c[i]+" ");
	   } 

}
