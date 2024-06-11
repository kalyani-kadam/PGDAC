package com.Validaterule;
//import com.Tester.TestClass;
import com.CustomException.ColourNotFoundException;
import com.CustomException.PollutionLevelOutOfRangeException;
import com.CustomException.PollutionLevelOutOfRangeException;
import com.Enum.*;
import com.Enum.Colour;

public class Validaterules {
	public static final Colour cr;
	public static final double Kilometer ; 
	static{
	   cr=null;
	   Kilometer=500;
	}
	
	public static Colour findByName(String name) throws ColourNotFoundException  
	{
		for(Colour c:Colour.values())
		{
			if(c.name().equalsIgnoreCase(name))
			{
				return c;
			}
		}
		throw new ColourNotFoundException("Colour is not Available");
	}
	
    public static void TestPollution(double Km) throws PollutionLevelOutOfRangeException
    {
    	if(Km>Kilometer)
    	{
    		System.out.println("Pollution level is too high");
    	}
    	else
    	System.out.println("Pollution is in Control");
    }
}
