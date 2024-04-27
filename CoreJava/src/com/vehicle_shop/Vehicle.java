package vehicle_shop;

import java.util.Date;

public class Vehicle {
	
	private String chasisNo;
	protected vehicleColor color;
	private double price;
	private Date manufactureDate;
	private Date insuranceExpDate;
	private double pollutionlevel;
	
//	public Vehicle(String chasisNo,vehicleColor color,double price,Date manufactureDate,Date insuranceExpDate,double pollutionlevel) {
//		this.chasisNo=chasisNo;
//		this.color=color;
//		this.price=price;
//		this.manufactureDate=manufactureDate;
//		this.insuranceExpDate=insuranceExpDate;
//		this.pollutionlevel=pollutionlevel;
//	}
	
	public Vehicle(String chasisNo,double price,Date manufactureDate,Date insuranceExpDate,double pollutionlevel) {
		this.chasisNo=chasisNo;
		this.price=price;
		this.manufactureDate=manufactureDate;
		this.insuranceExpDate=insuranceExpDate;
		this.pollutionlevel=pollutionlevel;
	}
	public static void validatePollutionlevel(double pollutionlevel) throws VehicleException {
		
		if(pollutionlevel>20)
			throw new VehicleException("Max pollution level!!....\nNot able to buy vehicle...");
		else
			System.out.println("Good to go!!!");
	}
	
	public void validateColor(vehicleColor color) throws VehicleException {
		if(!(  (color.equals(vehicleColor.BLACK)) || (color.equals(vehicleColor.BLUE)) || (color.equals(vehicleColor.RED))  ||
				(color.equals(vehicleColor.SILVER)) || (color.equals(vehicleColor.WHITE)) )) {
			throw new VehicleException("Right now this Color is Not Available....!");
		}
		else {
			System.out.println("Good Choice>>>>");
		}
	}
	
	@Override
	public String toString()
	{
		return "\nChasis No : "+this.chasisNo+"\nPrice : "+this.price+"\nManufactureDate : "+this.manufactureDate+
				"\nInsuranceExpDate : "+this.insuranceExpDate+"\nPollutionlevel : "+this.pollutionlevel;
	}
	
}
