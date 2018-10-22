package CarApp;

public class UsedCarMileage extends CarInfo {
	private double mileage;

	public UsedCarMileage() {
		// TODO Auto-generated constructor stub
	}

	public UsedCarMileage(double mileage) {
		super();
		this.mileage = mileage;
	}
	
	

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	public UsedCarMileage(String carMake, String carModel, int carYear, double carPrice, double mileage) {
		super(carMake, carModel, carYear, carPrice);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return super.toString() + String.format("%-10s", mileage);
	}
	

}
