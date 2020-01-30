package myproject;
import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) 
	 {
	Scanner fan = new Scanner(System.in);
    System.out.println("Enter two numbers: ");
    double first = fan.nextDouble();
    double second = fan.nextDouble();
    System.out.print("Enter a num 1:add 2: sub 3: mul 4: div ");
    int num = fan.nextInt();
    double result;
    switch(num)
    {
        case 1:
            result = first + second;
            System.out.print("add "+result);
            break;
        case 2:
            result = first - second;
            System.out.print("sub"+result);
            break;
        case 3:
            result = first * second;
            System.out.print("mul "+result);
            break;
        case 4:
            result = first / second;
            System.out.print("div "+result);
            break;
        
        default:
            System.out.printf("Error! number is not correct");
            return;
    }
   
}

}
