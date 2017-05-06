import java.util.*;
import java.lang.Math;

public class slot_machine
{
	public static void main(String []args)
	{
	   
	}
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