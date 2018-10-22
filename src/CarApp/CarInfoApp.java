package CarApp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class CarInfoApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		CarInfo car = new CarInfo();
		ArrayList<CarInfo> carLot = new ArrayList<>();
		
		//will create size of the carLot
		int sizeOfLot = Validator.getInt(scan, "How many cars would you like to add to the car lot?");
		
		//will loop the user input for the amount of cars
		for (int i = 0; i < sizeOfLot; i++) {
			
	    String carMake = Validator.getString(scan, "Enter Car #" + (i + 1) + " Make :");
	    
	    car.setMake(carMake);
	    
	    String carModel = Validator.getString(scan, "Enter Car # " + (i + 1) + " Model :");
	    
		car.setModel(carModel);
		
		//I added a max and mix for years because cars werent really made before the early 1900s 
		//I just went a little past the current year for the max since they release new cars the year prior
	    int carYear = Validator.getInt(scan, "Enter Car # " + (i + 1) + " Year :", 1906, 2020);
	    
	    car.setYear(carYear);
	    
	    double carPrice = Validator.getDouble(scan, "Enter Car # " + (i + 1) + " Price :");
	    
	    car.setPrice(carPrice);
	    
	    carLot.add(new CarInfo(carMake, carModel, carYear, carPrice));
		}
		
		System.out.println("Current Inventory:");
		System.out.printf("%-10s %-10s %-10s %-10s\n", "Make", "Model", "Year", "Price");
		
		for (CarInfo cars : carLot) {
			
			System.out.println(cars);
			
		}
		
	
	    
	}

}
