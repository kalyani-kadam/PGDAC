package vehicle_shop;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) throws VehicleException {
		int s;
		Scanner sc = new Scanner(System.in);
//		try(Scanner sc = new Scanner(System.in)){
//			System.out.println("Enter how many vehicle you want add: ");
//			s=sc.nextInt();
//		}
		System.out.println("Enter how many vehicle you want add: ");
		s=sc.nextInt();
		Vehicle varr[] = new Vehicle[s];
		
		VehicleUtility vu = new VehicleUtility();
		
		
		while(true) {
			System.out.println("\n0.Exit\n1.Add vehicle\n2.Display vehicle");
			System.out.println("Enter choice: ");
//			Scanner sc = new Scanner(System.in);
			int ch=sc.nextInt();
			
			switch(ch) {
			case 0:
				System.exit(0);break;
				
			case 1 : 
					 vu.acceptDetails(varr);
					 break;
					 
			case 2 : 
				 	 vu.displayDetails(varr);
				 	 break;
			
			default :
				System.out.println("Invalid choice.........");
			}
		}
	}

}
