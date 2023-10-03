package arrayList;

public class AC {
	private  String brand;
	private  float tons;
	private int warranty;
	private  boolean isInverter;
	// singleton Example
	private static AC a;

	public static AC getOfSingleton() {
		if (a == null)
			a = new AC();
		return a;
	}

	public void setB(String b) {
		brand = b;
	}

	public void setT(float t) {
		tons = t;
	}

	public void setW(int w) {
		warranty = w;
	}

	public void setIsInverter(boolean is) {
		isInverter = is;
	}

	public String getB() {
		return brand;
	}

	public float getT() {
		return tons;
	}

	public int getW() {
		return warranty;
	}

	public boolean getIsInverter() {
		return isInverter;
	}

	public AC(String b, float t, int w, boolean is) {
		brand = b;
		tons = t;
		warranty = w;
		isInverter = is;
	}

	public AC() {
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		return "BRAND: " + brand + ", " + "Capacity: " + tons + "tons, " + "Warranty: " + warranty + ", "
				+ "Is Inverter: " + isInverter;
	}

}
