package com.Vehical;

import java.time.LocalDate;
import java.util.Date;

import com.Enum.Colour;

public class Vehical {
    private String chasisNo;
    private String uniqueId;
    private Colour cr;
    private double price;
    private LocalDate mfgDate;
    private LocalDate InsuExpDate;
   // private double pollutionlevel;
    private double kilometer;
    
    
	
	public Vehical(String chasisNo,String uniqueId,Colour cr,double price,LocalDate mfgDate,LocalDate InsuExpDate,double kilometer)
    {
    	this.chasisNo=chasisNo;
    	this.uniqueId=uniqueId;
    	this.cr=cr;
    	this.price=price;
    	this.mfgDate=mfgDate;
    	this.InsuExpDate=InsuExpDate;
    	this.kilometer=kilometer;
    }
    public String toString()
    {
    	return"Chasis no:  "+chasisNo+"  UniqueId: "+uniqueId+"  colour: "+cr+
    			"  Price: "+price+"  MfgDate: "+mfgDate+"  Insurance ExpDATE: "
    			+InsuExpDate+"  Kilometer: "+kilometer;
    }
	public String getChasisNo() {
		return chasisNo;
	}
	public void setChasisNo(String chasisNo) {
		this.chasisNo = chasisNo;
	}
	public String getUniqueId() {
		return uniqueId;
	}
	public void setUniqueId(String uniqueId) {
		this.uniqueId = uniqueId;
	}
	public Colour getCr() {
		return cr;
	}
	public void setCr(Colour cr) {
		this.cr = cr;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public LocalDate getMfgDate() {
		return mfgDate;
	}
	public void setMfgDate(LocalDate mfgDate) {
		this.mfgDate = mfgDate;
	}
	public LocalDate getInsuExpDate() {
		return InsuExpDate;
	}
	public void setInsuExpDate(LocalDate insuExpDate) {
		InsuExpDate = insuExpDate;
	}
//	public double getPollutionlevel() {
//		return pollutionlevel;
//	}
//	public void setPollutionlevel(double pollutionlevel) {
//		this.pollutionlevel = pollutionlevel;
//	}
	public double getKilometer() {
		return kilometer;
	}
	public void setKilometer(double kilometer) {
		this.kilometer = kilometer;
    
	}
}
