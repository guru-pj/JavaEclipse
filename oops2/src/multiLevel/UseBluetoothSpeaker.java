package multiLevel;

public class UseBluetoothSpeaker {
	public static void main(String[] args) {
		BluetoothSpeaker bs1 = new BluetoothSpeaker("JBL", "25W", "Type-C", true, "Portable", 9499, "Green");
		System.out.println(bs1.toString());
	}
}
