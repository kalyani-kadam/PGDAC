package com.app.tester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

//import com.app.details.Customer;
import com.app.entity.Item;
import static com.app.utils.Utils.*;
//import static com.app.storedetails.ItemStore.*;

public class Tester {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {

			Map<String, Item> items = new HashMap<>();

			try {
				boolean exit = false;
				while (!exit) {
					System.out.println("1.Add item\n2.Display all item\n3.Sort by Item code\n4.Sort by shipment Date\n5.Rad file\n");
					System.out.println("Enter choice");
					switch (sc.nextInt()) {

					case 0:
						System.out.println("Thank you");
						exit = true;
						break;

					case 1:
						for (int i = 0; i < 4; i++) {
							System.out.println("Enter items details:code,desc, price, Shipment date ");
							Item item = addNewItem(sc.next(), sc.next(), sc.nextDouble(), sc.next(), items);
							items.put(item.getItemCode(), item);
							System.out.println("Item added");
						}
						break;
//						k k 680 2012-01-01
//						js hwd 300 2013-02-23
//						gd rsd 21 2011-01-29
//						ab desd 28 2001-01-29
					case 2:
//						items.forEach(i -> System.out.println(i));
//						for (Item i : items.values()) {
//							System.out.println(i);
//						}
						displayDetails(items);
						break;

					case 3:
						List<Item> Ilist = new ArrayList<Item>(items.values());
//						Collections.sort(Ilist,Comparator.comparing(Item::getItemCode));
//						for(Item i:items.values()) {
//							System.out.println(i);
//						}
						Collections.sort(Ilist, new Comparator<Item>() {

							@Override
							public int compare(Item o1, Item o2) {
//								int ress = o1.getItemCode().compareTo(o2.getItemCode());
//								if (ress == 0)
//									return 1;
//								else if (ress < 0)
//									return -1;
//								return 1;
								return o1.getItemCode().compareTo(o2.getItemCode());
							}
						});
						for(Item c: Ilist)
							System.out.println(c);
						System.out.println("Enter file name to store details by date");
						writeDetails(Ilist, sc.next());
						//displayDetails(Ilist);
						break;

					case 4:
						List<Item> ilist = new ArrayList<Item>(items.values());
						Collections.sort(ilist, new Comparator<Item>() {

							@Override
							public int compare(Item o1, Item o2) {
//								int ress = o1.getItemCode().compareTo(o2.getItemCode());
//								if (ress < 1)
//									return -1;
//								else if (ress > 1)
//									return 1;
//								return 0;
								
								return o1.getShipmentDate().compareTo(o2.getShipmentDate());
							}
						});
						//displayDetails(items);
						for(Item c: ilist)
							System.out.println(c);
						System.out.println("Enter file name to store details by date");
						writeDetails(ilist, sc.next());
						break;
						
					case 5:
						System.out.println("Enter file name to read details");
						Object o = readDetails(sc.next());
						System.out.println(o);
						break;
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
				sc.nextLine();
			}
		}
	}

}