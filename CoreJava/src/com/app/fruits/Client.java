package com.app.fruits;

import java.util.Scanner;

public class Client {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size: ");
		int s=sc.nextInt();
		Fruit[] f = new Fruit[s];
//		Fruit fr=new Mango()
//		Fruit fresh = new Fruit();
		FruitUtility fu = new FruitUtility();
		
		
		while(true) {
			System.out.println();
//			System.out.println("\n1.Mango\n2.Orange\n3.Apple\n");
			System.out.println("\n0.Exit\n1.Add fruit\n2.Display details\n3.Mark Stale\n4.Mark Sour");
			System.out.println("Enter choice: ");
			int choice = sc.nextInt();
				switch(choice) {
				case 1:
						System.out.println("SELECT 1.Fresh\n2.Stale");
						System.out.println("Enter your choice: ");
						int ch=sc.nextInt();
						
						//int s=(ch==1)?IsFresh.FRESH:IsFresh.STALE;
						if(ch == 1) {
							IsFresh fr = IsFresh.FRESH;
								fu.acceptDetails(f,fr);
							}
						else {
							IsFresh fr = IsFresh.STALE;
						}
						break;
				case 2:
					fu.displayDetails(f);
					break;
					
				case 3:
					System.out.println("Enter index: ");
					int i=sc.nextInt();
					try {
						if(i>f.length) {
							throw new Exception("Wrong index");
						}
					}
					catch(Exception e){
						System.out.println(e.getMessage());
					}
					f[i].setFresh(IsFresh.STALE);
					break;
				case 4:
					String taste="sweet";
					for(int j=0; j<f.length; j++) {
						if(f[j] instanceof Mango) {
							Mango m =(Mango) f[j];
							taste = m.taste();	
						}
						else if(f[j] instanceof Orange) {
							Orange o =(Orange) f[j];
							taste = o.taste();	
						}
						else if(f[j] instanceof Apple) {
							Apple a =(Apple) f[j];
							taste = a.taste();	
						}
						if(taste.equals("sour")) {
							IsFresh fr = IsFresh.STALE;
						}
					}
					break;
				case 5:
					for(int j=0; j<f.length; j++) {
						if(f[j] instanceof Mango) {
							Mango m =(Mango) f[j];
							m.pulp();	
						}
						else if(f[j] instanceof Orange) {
							Orange o =(Orange) f[j];
							o.juice();
						}
						else if(f[j] instanceof Apple) {
							Apple a =(Apple) f[j];
							a.jam();
						}
					}
					break;
				case 0:
					System.exit(0);
			}
	}
}
}	
