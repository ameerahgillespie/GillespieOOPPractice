
public class UsedCar extends Car {
	public UsedCar(String string, String string2, int i, double d, int miles) {
		super(string, string2, i, d);
		this.miles = miles;
	}

	private int miles;

	public int getMiles() {
		return miles;
	}

	public void setMiles(int miles) {
		this.miles = miles;
	}

}
