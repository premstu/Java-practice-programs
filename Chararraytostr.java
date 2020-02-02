package string;
import java.util.Scanner;
public class Chararraytostr {
	public static void main(String args[])
	   {
	      
	      char[] ch;
	      Scanner sc = new Scanner(System.in);
	      ch = sc.next().toCharArray();
	      String str = new String(ch);
	      System.out.println(str);
	      String str2 = String.valueOf(ch);
	      System.out.println(str2);
	   }

}
