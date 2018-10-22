package CarApp;

import java.util.ArrayList;
import java.util.Scanner;

public class UsedCar {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	CarInfo car = new CarInfo("Tesla", "Model X", 2018, 45000.50);
	CarInfo car2 = new CarInfo("Honda", "Fit", 2018, 15999.99);
	CarInfo car3 = new CarInfo("Honda", "Fit", 2018, 15999.99);
	UsedCarMileage used1 = new UsedCarMileage("Ford", "Fiesta", 2010, 9999.99, 143000.00);
	used1.setMileage(143000);
	UsedCarMileage used2 = new UsedCarMileage("Dodge", "Charger", 2007, 5995.95, 147325.00);
	used2.setMileage(147325);
	UsedCarMileage used3 = new UsedCarMileage("GMC", "Denali", 2012, 15999.95, 85000.00);
	used3.setMileage(85000);
	

	ArrayList<CarInfo> carLot = new ArrayList<>();
	carLot.add(car);
	carLot.add(car2);
	carLot.add(car3);
	carLot.add(used1);
	carLot.add(used2);
	carLot.add(used3);
	
	
	for (CarInfo cars : carLot) {
		
		System.out.println(cars);
		
	}
	
	int userOption = Validator.getInt(scan, "Please enter what number car you would like to buy", 1, 6);
	
	userOption = (userOption - 1);
	System.out.println("Would you like to buy " + carLot.get(userOption) + "?");
	
	
	String contYN = Validator.getString(scan, "If so press y");
	while (contYN.equalsIgnoreCase("y")) {
	 System.out.println("Excellent our finance department will get the paperwork ready");
	 break;
	} 
	carLot.remove(userOption);
	System.out.println("Here is the remaining vehicles.");
	 for (CarInfo carInfo : carLot) {
		 System.out.println(carInfo);
		
	}

	System.out.println("Have a great day, and enjoy your new vehicle!");
	
	}

}
