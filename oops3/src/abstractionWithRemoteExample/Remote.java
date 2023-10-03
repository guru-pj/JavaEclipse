package abstractionWithRemoteExample;

public abstract class Remote {
	public abstract int findBatteryLife();

	public abstract int findRange();

	public String onOffFunction() {
		return "Always Same";
	}
}
