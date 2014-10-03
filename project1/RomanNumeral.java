package project1;

public class RomanNumeral {
	//Part 1: Roman Numeral
	private static String UNDEFINED = "-100";
	private int integerValue;
	// Maximum number that can be calculated
	private static int max = 2500;
	// Minimum number that can be calculated
	private static int min = 0;
	
	private enum
	
	public RomanNumeral(int integerValue)
	{
		setIntegerValue(integerValue);
	}
	
	// Reports if invalid integer is entered, but still stores the number
	public void setIntegerValue(int integerValue)
	{
		if(integerValue > max || integerValue < min)
		{
			System.out.println("Error: Invalid input\n");
		}
		this.integerValue = integerValue;
	}
	
	// Generates roman numeral representation of integerValue if possible
	// Else returns UNDEFINEDs static value
	public String toString()
	{
		String tmp = "";
		
		if(integerValue >= min || integerValue <= max)
		{
		}
		else
		{
			tmp = UNDEFINED;
		}
		
		return tmp;	
	}
	
	public int toInt()
	{
		return integerValue;
	}
	
	// Return 1 if greater than r, 0 if equal, -1 otherwise
	public int compareTo(RomanNumeral r)
	{
		int value = null;
		
		if(toInt() > r.toInt())
		{
			value = 1;
		}
		else if(toInt() == r.toInt())
		{
			value = 0;
		}
		else
		{
			value = -1;
		}
		
		return value;
	}
}
