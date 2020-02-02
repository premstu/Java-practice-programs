package string;
import java.util.Scanner;

public class CountVolandCons {
	public static void main(String[] args) {
        String str;
       // int volcount = 0, conscount = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        str = sc.nextLine();
        int volcount = 0, conscount = 0;
        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++) 
        { 
        	char ch = str.charAt(i); 
             if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
             { volcount++; } 
            else if((ch >= 'a'&& ch <= 'z')) 
               {
                conscount++;
               }
        }
        System.out.println("Number of Vowels: " + volcount);
        System.out.println("Number of Consonants: " + conscount);
    }

}
