package demo1;

import java.util.Scanner;
public class Demo2 {

		int id;
		String VehicaleModel;
		int price;
		String colour;
		String Area;
		String OwnerName;
		long mobNo;
		long AdharNO;
	   
	   public void set_info(int id, String VehicaleModel, int price,String colour,String Area,String OwnerName,long mobNo,long AdharNO)
	    {
	        this.id = id;
	        this.VehicaleModel = VehicaleModel;
	        this.price = price;
	        this.colour = colour; 
	        this.Area = Area;
	        this.OwnerName = OwnerName;
	        this.mobNo = mobNo;
	        this.AdharNO = AdharNO;
	        
	    }
	     public void get_info()
	    {
	    	System.out.println("\nRegistration Id : " +id);
			System.out.println("Name of Model : " +VehicaleModel);
			System.out.println("Price of Vehicle : " +price);
			System.out.println("Colour of vehicle : " +colour);
			System.out.println("Area : " +Area);
			System.out.println("Owner Name : " +OwnerName);
			System.out.println("Mobile number : " +mobNo);
			System.out.println("Aadhar Number : " +AdharNO);
	        
	    }

		
		public static void main(String[] args) {
			
			Demo2 au= new Demo2();
			
			Scanner s = new Scanner(System.in);
			
			int ch = 0;
			while(ch != 4) {
			System.out.println("\n~~~~~~~~~~~~~~~~~~ Welcome to vehicles registration system options ~~~~~~~~~~~~~~~~~~");
			System.out.println("\nChoose Option From Below :- ");
			System.out.println("1.registration\n2.view\n3.update\n4.Exit\nEnter your choice : ");
			 ch = s.nextInt();
			
			switch(ch)
			{
			case 1 :
				System.out.println( "Enter Registration Id : ");
				int id = s.nextInt();
				s.nextLine();
				System.out.println( "Enter Model Name : ");
				String VehicaleModel = s.nextLine();
				System.out.println( "Enter Price of vehicle : ");
				int price = s.nextInt();
				s.nextLine();
				System.out.println( "Enter Colour : ");
				String colour = s.nextLine();
				System.out.println( "Enter Area : ");
				String Area = s.nextLine();
				System.out.println( "Enter Owner Name : ");
				String OwnerName = s.nextLine();
				System.out.println( "Enter Mobile Number : ");
				long mobNo = s.nextLong();
				System.out.println( "Aadhar Card Number : ");
				long AdharNO = s.nextLong();
				au.set_info(id, VehicaleModel, price, colour, Area, OwnerName, mobNo, AdharNO);
				System.out.println("\nRegistration completed successfully...");
				break;
			
			case 2 :
				System.out.println("\n----------------------- Your registered details -----------------------");
				au.get_info();
				System.out.println("\nDetails showed successfully...");
				break;
			
				case 3 :
				
					int choice = 0;
					
					System.out.println("\n~~~~~~~~~~~~~~~ options for updation ~~~~~~~~~~~~~~~\n\n1.Update Registration id\n2.Update Model Name\n3.Update Price\n4.Update colour\n5.Area\n6.Owner\n7.Mobile no.\n8.Adhar no.\n\nEnter your choice : ");
					choice = s.nextInt();
						
					switch (choice) {
						
					case 1:
						System.out.println( "Enter Registration Id : ");
						au.id = s.nextInt();
						System.out.println("\nUpdated successfully...");
						break;
							
					case 2:
						s.nextLine();
						System.out.println("Enter model name : ");
						au.VehicaleModel = s.nextLine();
						System.out.println("\nUpdated successfully...");
						break;
						
					case 3 :
						System.out.println("Enter new price : ");
						au.price = s.nextInt();
						System.out.println("\nUpdated successfully...");
						break;
							
					case 4 :
						s.nextLine();
						System.out.println( "Enter new Colour : ");
						au.colour = s.nextLine();
						System.out.println("\nUpdated successfully...");
						break;
							
					case 5 :
						s.nextLine();
						System.out.println( "Enter new Area : ");
						au.Area = s.nextLine();
						System.out.println("\nUpdated successfully...");
						break;
							
					case 6 :
						s.nextLine();
						System.out.println( "Enter Owner Name : ");
						au.OwnerName = s.nextLine();
						System.out.println("\nUpdated successfully...");
						break;
							
					case 7 :
						System.out.println( "Enter new Mobile Number : ");
						au.mobNo = s.nextLong();
						System.out.println("\nUpdated successfully...");
						break;
							
					case 8 :
						System.out.println( "Aadhar new Card Number : ");
						au.AdharNO = s.nextLong();
						System.out.println("\nUpdated successfully...");
						break;
						
					}
					break;
					
				case 4 :
					System.out.println("\nExiting successfully...");
					break;
					
				default :
					System.out.println("Invalid choice!!!!!!!!!!" );
			}
			}
			
		}

	}

