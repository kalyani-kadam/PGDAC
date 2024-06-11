package com.app.utils;

import java.time.LocalDate;
import java.util.List;

import com.app.entity.Pen;
import com.app.exceptions.PenException;

public class PenUtil {

	public static void UpdateStock(int id, int stock, List<Pen> pens) throws PenException {
		Pen p = new Pen(id);
		int pen = pens.indexOf(p);
		if (pens.indexOf(p) == -1) {
			throw new PenException("Pen not found");
		}
		pens.get(pen).setStock(stock);
		pens.get(pen).setStockUpdateDate(LocalDate.now());
		System.out.println("Stock updated to : " + pens.get(pen).getStock() + " for pen ID = " + pens.get(pen).getID()
				+ " successfully!!");
	}

	public static void setDiscount(List<Pen> pens) {
		LocalDate threemonthsago = LocalDate.now().minusMonths(3);
		for (Pen p : pens) {
//			System.out.println(p);
			int index = pens.indexOf(p);
//			System.out.println(index);
			boolean date = p.getStockListingDate().isBefore(threemonthsago);
//			System.out.println(date);
			if (date) {
				p.setDiscount(20);
				System.out.println("Discount applied");
			} else {
				System.out.println("Cant update discount");
			}
		}
		
//		pens.forEach(p -> p.getStockUpdateDate().isBefore(threemonthsago ));
	}

	public static void removePen(List<Pen> pens) {
		LocalDate notSoldIn9months = LocalDate.now().minusMonths(9);
//		Iterator<Pen> itr = pens.iterator();
//		for (Pen pen : pens) {
//			System.out.println(pen);
//			boolean date = pen.getStockListingDate().isBefore(notSoldIn9months);
//			if(date) {
//				int index = pens.indexOf(pen);
//				pens.remove(index);
//				System.out.println("Old unsold pens removed.");
//			}
//			else
//				System.out.println("Old unsold pens not removed.");
		
			pens.removeIf(p -> p.getStockListingDate().isBefore(notSoldIn9months));
			System.out.println("Pen removed...");
//		}
	}
}
