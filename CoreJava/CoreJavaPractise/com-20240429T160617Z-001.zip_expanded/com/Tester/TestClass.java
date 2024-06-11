package com.Tester;
import static com.Validaterule.Validaterules.findByName;
import java.time.*;
import static com.Validaterule.Validaterules.TestPollution;
import com.CustomException.ColourNotFoundException;
import com.CustomException.PollutionLevelOutOfRangeException;
import com.Enum.Colour;

import java.time.LocalDate;
import java.util.Scanner;
import com.Vehical.Vehical;

public class TestClass {
     
	public static void main(String[] args)  {
		Scanner sc1=new Scanner(System.in);
		boolean flag=true;
		System.out.println("Enter size of vehical array");
		int size=sc1.nextInt();
		Vehical[] varr=new Vehical[size];
		
		while(true)
		{
			
			System.out.println("1.Add vehicle based on colour \n 2.Display vehical \n "
					+ "3.Drive vehicle based on pollution level \n 4.Exit");
			System.out.println("Enter the choice");
			int ch=sc1.nextInt();
			switch(ch)
			{
			case 1:
				for(int i=0;i<varr.length;i++)
				{
				System.out.println("Enter chasisNo of vehicle");
				String chasisNo=sc1.next();
				System.out.println("Enter UniqueId of vehicle");
				String UniqueId=sc1.next();
				System.out.println("Enter the name of colour");
				Colour c1=null;
				try
				{
					String color=sc1.next();
					c1=findByName(color);
					System.out.println("colour is available: "+color);
				}
				catch(ColourNotFoundException e)
				{
					System.out.println(e.getMessage());
				}
				
				System.out.println("Enter price");
				double price=sc1.nextDouble();
				LocalDate mfgdate=null;
				LocalDate InsuExpDate=null;
				try
				{
					System.out.println("Enter mfg date");
					 mfgdate=LocalDate.parse(sc1.next());
					System.out.println(mfgdate);
				   System.out.println("Enter insurance expiry date ");
					 InsuExpDate=LocalDate.parse(sc1.next());
					System.out.println(InsuExpDate);
				}
				catch(Exception e)
				{
					e.printStackTrace();
				}
				double km=0;
				try 
				{
					System.out.println("Enter kilometer which you drive");
					
					TestPollution(km=sc1.nextDouble());
				}
				catch(PollutionLevelOutOfRangeException e)
				{
					System.out.println(e.getMessage());
				}
				
				varr[i]=new Vehical(chasisNo,UniqueId,c1,price,mfgdate,InsuExpDate,km);
				
			}		
				break;
			case 2:
				System.out.println("Display vehical ");
				for(int i=0;i<varr.length;i++)
				{
				    System.out.println(varr[i]);
				}
				break;
				
			case 3:
				for(int i=0;i<varr.length;i++)
				{	
				try 
				{
					System.out.println("Enter kilometer which you drive");
					TestPollution(sc1.nextDouble());
				}
				catch(PollutionLevelOutOfRangeException e)
				{
					System.out.println(e.getMessage());
				}
				}
				break;
			case 4:
				System.exit(0);
			default:
				System.out.println("Invalid choice");
					
			}
		}
		
	}
}
