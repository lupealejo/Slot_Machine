import java.util.*;
import java.lang.Math;

public class slot_machine
{
	public static void main(String []args)
	{
	   
	}
}




   public static int getBet()
   {
      //Scanner will allow for user input
      Scanner enterBet = new Scanner(System.in);
      //set input to int 
      int bet;
      // A while loop will keep the program running when true
      while (true) 
      {
         //Output welcome message
         System.out.print("Welcome to the Hunger Games Slot Machine!\n");
         System.out.print("Place a bet from 1 to 100 or enter 0 to quit: ");
    
         //nextInt scans the next token of the input as an int. 
         bet = enterBet.nextInt();
         
         //If statement returns bet range from 1 to 100
         if (bet <= 100 && bet >= 1) 
         {
            return bet;
         }
      }
   }

   public static TripleString pull()
   {
      //Use reel to set TripleString default constructor to initialize string members 
      TripleString reel = new TripleString();
      
      //Output result message
      System.out.print("Thank you, and may the odds be ever in your favor!\n");
      System.out.print("***YOUR PULL IS***\n");
      
      //Set mutators that intake private helper method randString()
      reel.setFirst(randString());
      reel.setSecond(randString());
      reel.setThird(randString());

      return reel;
   }



class TripleString
{
	private String string1, string2, string3;
	public static final int MAX_LEN = 20;
	public static final int MAX_PULLS = 40;
	public static int pullWinnings[] = new int[MAX_PULLS];
	private int index = 0;

	//Default Constructor
	public TripleString()
	{
		string1 = string2 = string3 = "";
	}
	
	//Mutators
	public boolean setFirst(String firstSymbol)
	{
		if (validString(firstSymbol))
			{
				string1 = firstSymbol;
				return true;
			}
		else 
			return false;
	}

	public boolean setSecond(String secondSymbol)
	{
		if (validString(secondSymbol))
		{
			string2 = secondSymbol;
			return true;
		}
	else 
		return false;
	}

	public boolean setThird(String thirdSymbol)
	{
		if (validString(thirdSymbol))
		{
			string3 = thirdSymbol;
			return true;
		}
	else 
		return false;
	}
	
	//Accessors
	public String getFirst()
	{
		return string1;
	}
	
	public String getSecond()
	{
		return string2;
	}
	
	public String getThird()
	{
		return string3;
	}
	
	public String toString()
	{
		return getFirst() + getSecond() + getThird();
	}
	
	private boolean validString(String str)
	{
		if (str.length() <= MAX_LEN)
		{
			return true;
		}
		else
			return false;
	}
	
	//Winning Methods
	public boolean saveWinnings(int winnings)
	{
	   if (index < MAX_PULLS)
	   {
	      pullWinnings[index] = winnings;
	      ++index;
	      return true;
	   }
	   else
	      return false;
	}
	
	public String displayWinnings()
	{
	   String allWinnings = "";
	   
	   for (int i = 0; i < MAX_PULLS; i++)
	   {
	      allWinnings += Integer.toString(pullWinnings[i]) + " ";
	   }
	   
	   return allWinnings;
	}
	
}
