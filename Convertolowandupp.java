package string;
import java.util.Scanner;
public class Convertolowandupp {
	public static void main(String [] args) {
	String str;
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter the string");
	str = sc.nextLine();
	String lowercase,uppercase;
	lowercase=str.toLowerCase();
	uppercase=str.toUpperCase();
	System.out.println("lowwer case" +lowercase);
	System.out.println("upper case" +uppercase);
	
	
	}

}
