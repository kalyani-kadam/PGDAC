package com.app.utils;

import java.util.List;
import java.util.Map;

import javax.security.sasl.AuthenticationException;

import com.app.authorizationexception.AuthorizationException;
import com.app.entity.Category;
import com.app.entity.Order;
import com.app.entity.Pet;
import com.app.entity.Status;
import com.app.outofstockexception.OutOfStockException;

public class Utils {
	public static void logIn(String loginId, String password, String loggedInUser, Map<String, String> users)
			throws AuthenticationException {
		if (users.containsKey(loginId) && users.get(loginId).equals(password)) {
			loggedInUser = loginId;
			System.out.println("Login successfully!!");
		} else {
			throw new AuthenticationException("Invalid loginId or password");
		}
	}

	public static Pet addNewFunctionality(String name, String category, double unitPrice, int stocks, List<Pet> pets) {
//		Category.valueOf(category.)
		Category selectedCategory = parseAndValidateCategory(category);
		return new Pet(name, selectedCategory, unitPrice, stocks);
	}

//	bull dog 2000 3

	private static Category parseAndValidateCategory(String category) {

		return Category.valueOf(category.toUpperCase());
	}

	public static boolean checkAdminAccess(String loggedInUser) throws AuthorizationException {
		if ("c1".equals(loggedInUser)) {
			System.out.println("c1".equals(loggedInUser));
			return false;
//			throw new AuthorizationException("You are not authorized person to perform this operation.");
		}
		return true;
	}

	public static void updatePetDetails(int id, String name, String category, double unitPrice, int stocks,
			List<Pet> pets) throws AuthenticationException {
		Category selectedCategory = parseAndValidateCategory(category);
		Pet p = new Pet(id);
		int index = pets.indexOf(p);
		if(index == -1) {
			throw new AuthenticationException("Invalid id");
		}
		pets.get(index).setName(name);
		pets.get(index).setCategory(selectedCategory);
		pets.get(index).setUnitPrice(unitPrice);
		pets.get(index).setStocks(stocks);
		System.out.println("Pet details updated!!");
//		Pet p = new Pet(id);
////		int index = pets.get(p.getId()).getId();
//		int index = pets.indexOf(p);
//		Category cat = Category.valueOf(category.toUpperCase());
//		if(index == -1) {
//			throw new com.app.authenticationexception.AuthenticationException("Invalid index");
//		}
////		pets.get(index)
//		pets.get(index).setName(name);
//		pets.get(index).setCategory(cat);
//		pets.get(index).setUnitPrice(unitPrice);
//		pets.get(index).setStocks(stocks);
//		System.out.println("Pet details updated!!");

//		Pet p = new Pet(id);
		// int index = pets.get(p.getId()).getId();
//		int index=pets.get(id).getId();
//		int index, idm = 0;
		
//		for (index = 0; index < pets.size(); index++) {
//			if (index < pets.size() && index >= 0) {
//				if (pets.get(index).getId() == id) {
//					Category cat = Category.valueOf(category.toUpperCase());
//					p.setName(name);
//					p.setCategory(cat);
//					p.setUnitPrice(unitPrice);
//					p.setStocks(stocks);
//					pets.set(index, p);
//					break;
//				} else
//					throw new com.app.authenticationexception.AuthenticationException("Invalid index");
//			}
//		}

//		System.out.println("Pet details updated!!");

	}

	public static Order orderPet(int petid, int qty, List<Pet> pets, List<Order> orders)
			throws com.app.authenticationexception.AuthenticationException {
		Pet p = new Pet(petid);
		Order o = new Order();
//		int index = pets.indexOf(p.getId());
//		int index = pets.get(petid).getId();
		int index = pets.indexOf(p);
		if (index == -1) {
			throw new com.app.authenticationexception.AuthenticationException("Invalid index");
		}
		return new Order(petid, qty, Status.IN_PROCESS);
//		o.setPetId(p.getId());
//		o.setQty(qty);
//		o.setStatus(Status.IN_PROCESS);
//		System.out.println("Order booked");
	}

	public static void checkOrderStatus(int orderid, List<Order> orders) throws OutOfStockException {
		Order o = new Order(orderid);
		int index = orders.indexOf(o);
		if(index == -1) {
			throw new OutOfStockException("order id not found");
		}
		System.out.println("Order status for id = " + orders.get(index).getOrderId() + " is " + orders.get(index).getStatus());
	}

	public static void updateOrderStatus(int orderid, List<Order> orders) throws OutOfStockException {
		Order o = new Order(orderid);
		int index = orders.indexOf(o);
		if (orders.contains(o)) {
			orders.get(index).setStatus(Status.COMPLETED);
			System.out.println("Updated status for order id="+orders.get(index).getOrderId()+" with status = "+orders.get(index).getStatus());
			displayOrders(orders);
		}else {
			throw new OutOfStockException("order id not found");
		}
	}
	
	public static void displayOrders(List<Order>orders) {
		for(Order o:orders) {
			System.out.println(o);
		}
	}
}
