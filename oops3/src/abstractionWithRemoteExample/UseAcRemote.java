package abstractionWithRemoteExample;

public class UseAcRemote {
	public static void main(String[] args) {
		AcRemote r1 = new AcRemote();
		System.out.println(r1.findBatteryLife() + " Months");
		System.out.println(r1.findRange() + " Meters");
		System.out.println(r1.onOffFunction());
	}
}
