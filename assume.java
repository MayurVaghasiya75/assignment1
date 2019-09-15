import java.util.Scanner;
import java.util.Random;

public class assume
{
	static booleanisNumber(String s) 
    { 
        for (int y = 0; y <s.length(); y++) 
        if (Character.isDigit(s.charAt(y)) == false) 
            return false; 

        return true; 
    }
	
	public static void main(String args[]) {
    Scanner input = new Scanner(System.in);
    int calculate = 1;
	Random generate = new Random();
    int x = generate.nextInt(100)+1;
    String assume = "";

System.out.println("I am opine of a number from 1 to 100" + " ... assume what it is ?");
	System.out.println("Enter q to Quit...!!!");
		
	while (!assume.equals(String.valueOf(x))) 
	{
		assume = input.next();	
		
		if (isNumber(assume)) 
		{
			if(Integer.parseInt(assume)==x)
			  {
					System.out.println("Right!");
			  }
			  else if (Integer.parseInt(assume)<x) 
			  {
				System.out.println("Your assume was too LOW.");
				count++;
			  } 
			  else 
			  {
				System.out.println("Your assume was too HIGH.");
				count++;
			  }
		}
		else
		{
			if (assume.equals("q"))
			{
				assume = "";
				System.out.println("Goodbye....!!!");
				System.exit(0);
			}else {
			System.out.println("Please Enter Valid Input"); 
			}
		}	
	}
System.out.println("Congratulations. You assumed the number with "
        + count + " tries!");
}
}
