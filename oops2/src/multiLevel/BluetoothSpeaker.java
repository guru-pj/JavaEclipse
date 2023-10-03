package multiLevel;

public class BluetoothSpeaker extends Speaker {
	String brand;
	String outputPower;
	String chargerType;

	public BluetoothSpeaker(String b, String oP, String cT, boolean is, String ran, int pri, String color) {
		super(is, ran, pri, color);
		brand = b;
		outputPower = oP;
		chargerType = cT;
	}

	public String toString() {
		return super.toString() + ", " + "Brand: " + brand + ", " + "OutPutPower: " + outputPower + ", "
				+ "ChargerType: " + chargerType;
	}
}
