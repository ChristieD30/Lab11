package CarApp;



public class CarInfo {

	private String make;
	private String model;
	private int year;
	private double price;
	public String info;
	
	public CarInfo(){
		
	}
	
	public CarInfo(String carMake, String carModel, int carYear, double carPrice) {
		this.make = carMake;
		this.model = carModel;
		this.year = carYear;
		this.price = carPrice;
			
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return String.format("%-10s %-10s %-10s %-10s", make, model, year, price);
	}

	
}

	
	
	
	
	
	
	

