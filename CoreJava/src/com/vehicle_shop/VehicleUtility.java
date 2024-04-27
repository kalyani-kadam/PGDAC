package vehicle_shop;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class VehicleUtility {

	private Locale localeString;

	@SuppressWarnings("deprecation")
	public void acceptDetails(Vehicle arr[]) throws VehicleException  {
		Scanner sc = new Scanner(System.in);
		for(int i =0; i<arr.length; i++) {
			System.out.println("Enter Chasis No : ");
			String Chasis = sc.next();
			System.out.println("Enter price : ");
			double price = sc.nextDouble();
			//System.out.println("Enter Pollution Level : ");
			double level = driveVehicle();
//			System.out.println("Enter manufactureDate : ");
//			System.out.println("Enter insuranceExpDate : ");
			
//			System.out.println("Colors Available : \n.WHITE \nSILVER \nBLACK \nRED \nBLUE");
//			System.out.println("Choose Color : ");
//			String clr = sc.next();
//			switch(clr) {
//			case "WHITE" :  return vehicleColor.WHITE;
//							break;
//			}
//			String s = "10-Apr-2023";
//			SimpleDateFormat mdf=new SimpleDateFormat("dd-mon-yyyy",localeString);
			arr[i] = new Vehicle(Chasis,price,new Date("10/10/2005"),new Date("20/10/2022"),level);
			//arr[i] = new Vehicle(Chasis,price,new Date("10/10/2005"),new Date("20/10/2022"),level);
			//vehicleColor color = (vehicleColor)sc.next();
			
		}
	}
	
	public double driveVehicle() throws VehicleException {
		Scanner sc = new Scanner(System.in);
		double level=0;
		System.out.println("Enter Kms : ");
		double kms = sc.nextDouble();
		if(kms>=500 && kms<1000) {
			level = 15;
			Vehicle.validatePollutionlevel(level);
		
		}
		else if(kms>=1000 && kms<1500) {
			level = 25;
			Vehicle.validatePollutionlevel(level);
		}
		
		return level;
	}
	
	public void displayDetails(Vehicle arr[]) {
		System.out.println("\n________Vehicle Details_________");
		for(int i =0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	
}
