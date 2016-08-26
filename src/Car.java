
public class Car extends CarDealership {
	private String make;
	private String model;
	private int year;
	private double price;
	
	

	public Car(String string, String string2, int i, double d) {
		make = string;
		model = string2;
		year = i;
		price = d;

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


}
