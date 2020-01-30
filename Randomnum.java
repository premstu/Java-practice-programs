package myproject;
import java.util.Random;
public class Randomnum {
	public static void main(String[] args)
	{
		Random sun = new Random();
        for (int itr = 0; itr< 5; itr++)
        {
          int randomNumber = sun.nextInt(100);
          System.out.println("Random No : " + randomNumber); 
         }
        System.out.println("using math funtion ");
        for(int itn = 0; itn< 5; itn++)
        {
            System.out.println(Math.random());
         }
		
	}

}
