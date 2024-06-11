package com.app.validations;

import java.time.LocalDate;
import java.util.List;

import com.app.entity.Brand;
import com.app.entity.Color;
import com.app.entity.InkColor;
import com.app.entity.Material;
import com.app.entity.Pen;
import com.app.exceptions.PenException;

public class ValidationRules {
//	Pen p;
	public static Pen validateInputs(String brand, String color, String inkColor, String material, int Stock, int price, List<Pen> pens) throws PenException {
		
		Brand penBrand = parseAndValidateBrand(brand);
		Color penColor = parseAndValidateColor(color);
		InkColor penInkColor = parseAndValidateInkColor(inkColor);
		Material penMaterial = parseAndValidateMaterial(material);
//		LocalDate penstockUpdateDate = parseAndValidateDate(stockUpdateDate);
//		LocalDate penstockListingDate = parseAndValidateDate(stockListingDate);
//		checkForDup(penBrand, pens);
		return new Pen(penBrand, penColor, penInkColor, penMaterial, Stock, price);
	}

	public static void checkForDup(Brand brand, List<Pen> pens) throws PenException {
		Pen pen= new Pen(brand);
		if(pens.contains(pen))
			throw new PenException("Duplicate pen added!!");
	}

	private static LocalDate parseAndValidateDate(String date) {
		return LocalDate.parse(date);
	}

	private static Material parseAndValidateMaterial(String material) {
		return Material.valueOf(material.toUpperCase());
	}

	public static InkColor parseAndValidateInkColor(String inkColor) {
		return InkColor.valueOf(inkColor.toUpperCase());
	}

	public static Color parseAndValidateColor(String color) {
		return Color.valueOf(color.toUpperCase());
	}

	public static Brand parseAndValidateBrand(String brand) {

		return Brand.valueOf(brand.toUpperCase());
	}
	
	
}
