package string;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Delimiter {
	public static void main(String[] args){
		String str;
		Scanner sc = new Scanner (System.in);
		System.out.println("enter  dot string");
		str = sc.nextLine();
		sc.close();
		String[] output = str.split("\\.");
		System.out.println(output[0]);
		System.out.println(output[1]);
		System.out.println(output[2]);
	}

}
