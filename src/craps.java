import java.util.*;
import java.math.*;

public class craps {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		 Random rand = new Random(); 
		String answer;
		
		System.out.println("do you wnt to roll the dice? (yes or no)");
		answer = in.next();
		
		
		
		while(answer.equals("yes"))
		{	
			//int roll = (int)(( Math.random() * 11) + 2);
			
			
			int roll = rand.nextInt(11) + 1;
			answer = ComeOut(roll);
		
		
		}
	}

	
	public static String ComeOut(int x)
	{
		System.out.println("You rolled " + x);
		
		if(x == 7 || x == 11)
		{
			System.out.println("You Win!!");
			return "no";
		}
		else if (x == 2 || x == 3 || x == 12)
		{
			System.out.println("Uh oh! You crapped out!");
		}
			else
		{
			String ans = Point(x);
			return ans;
		}
		return "no";
	}
	
	public static String Point(int x)
	{
		
		 Random rand = new Random(); 
		
		while(true)
		{
			//int reroll = ((int) Math.random() * 11) + 2;
			int reroll = rand.nextInt(11) + 1;
			
			System.out.println("you rolled " + reroll);
			
			if(reroll == 7)
			{
				System.out.println("Uh oh! You sevened out!");
				return "no";
			}
			else if(reroll == x)
			{
				System.out.println("Congradulations! You win!");
				//System.out.println("Play again? (yes or no)");
				//Scanner in = new Scanner(System.in);
				//String ans = in.nextLine();
				return "no";
				
				
			}
		}
		
		
	}
}


